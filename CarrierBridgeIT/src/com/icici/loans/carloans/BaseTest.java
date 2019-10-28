package com.icici.loans.carloans;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectPath=System.getProperty("user.dir");
	public static Properties p;
	public static Properties or;
	
	public static ExtentReports reports = ExtentManager.getInstance();
	public static ExtentTest test;
	
	public static void init() throws Exception
	{
		FileInputStream fis=new FileInputStream(projectPath+"//data.properties");
		p=new Properties();
		p.load(fis);
		
		FileInputStream fis1=new FileInputStream(projectPath+"//or.properties");
		or=new Properties();
		or.load(fis1);
		
		PropertyConfigurator.configure(projectPath+"//log4j.properties");
		
		
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) 
		{
			ChromeOptions option=new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 9");
			
			option.addArguments("--disable-notifications");
			option.addArguments("--disable-infobars");
			option.addArguments("--start-maximized");
			
			//Proxy IP Configuration
			//option.addArguments("--proxy-server=http://192.168.90.84:1234");
			
			driver=new ChromeDriver(option);
		}
		else if(p.getProperty(browser).equals("firefox")) 
		{
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "e://xyzlogs.txt");
			
			ProfilesIni p=new ProfilesIni();
			FirefoxProfile profile = p.getProfile("carrier");
			
			//notifications
			profile.setPreference("dom.webnotifications.enabled", false);
			
			//proxy servers
			//profile.setPreference("network.proxy.type", 1);
			//profile.setPreference("network.proxy.socks", "192.168.90.54");
			//profile.setPreference("network.proxy.socks_port", 1744);
			
			FirefoxOptions option=new FirefoxOptions();
			option.setProfile(profile);
			
			driver=new FirefoxDriver(option);
		}
	}
	
	public static void navigateUrl(String url)
	{
		//driver.get(p.getProperty(url));
		driver.navigate().to(p.getProperty(url));
		driver.manage().window().maximize();
	}
	
	public static void clickEement(String locatorKey) 
	{
		getElement(locatorKey).click();
		//driver.findElement(By.xpath(or.getProperty(locatorKey))).click();
	}

	public static void typeValue(String locatorKey, String value) 
	{
		getElement(locatorKey).sendKeys(value);
		//driver.findElement(By.name(or.getProperty(locatorKey))).sendKeys(value);
	}

	public static void selectOption(String locatorKey, String option) 
	{
		getElement(locatorKey).sendKeys(option);
		//driver.findElement(By.id(or.getProperty(locatorKey))).sendKeys(option);
	}

	public static WebElement getElement(String locatorKey) 
	{
		WebElement element=null;
		if(locatorKey.endsWith("_id")) {
			element=driver.findElement(By.id(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_name")) {
			element=driver.findElement(By.name(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_classname")) {
			element=driver.findElement(By.className(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_xpath")) {
			element=driver.findElement(By.xpath(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_css")) {
			element=driver.findElement(By.cssSelector(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_linktext")) {
			element=driver.findElement(By.linkText(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_partiallinktext")) {
			element=driver.findElement(By.partialLinkText(or.getProperty(locatorKey)));
		}
		return element;
		
	}
	
	
	//   ***************************  Verifications   **************************
	
	public static boolean verifyTitle(String expectedTitle) 
	{
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle))
			return true;
		else
			return false;
		
	}
	
	
	public static boolean verifyElement(String expectedLink) 
	{
		String actualLink = driver.findElement(By.linkText("AmazonBasics")).getText();
		if(actualLink.equals(expectedLink))
			return true;
		else
			return false;	
	}
	
//  ***************************  Reportings   **************************
	
	public static void reportSuccess(String passMessage) 
	{
		test.log(LogStatus.PASS, passMessage);
	}

	public static void reportFailure(String failMessage) 
	{
		test.log(LogStatus.FAIL, failMessage);
		takeScreenshot();
		
	}
	
	public static void takeScreenshot() 
	{
		Date dt=new Date();
		String screenshotFileName = dt.toString().replace(":", "_").replace(" ", "_")+".png";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			FileHandler.copy(scrFile, new File(projectPath+"//failure//"+screenshotFileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//put screen shot file in extent reports
		test.log(LogStatus.INFO, "Screenshot --> "+ test.addScreenCapture(projectPath+"//failure//"+screenshotFileName));
		
	}
	
	
}
