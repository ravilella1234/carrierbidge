package com.icici.loans.carloans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static WebDriver driver;
	
	public static void launch(String browser)
	{
		if(browser.equals("chrome")) 
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) 
		{
			driver=new FirefoxDriver();
		}
	}
	
	public static void navigateUrl(String url)
	{
		driver.get(url);
	}
	
	
}
