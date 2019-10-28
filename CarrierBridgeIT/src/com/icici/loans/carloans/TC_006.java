package com.icici.loans.carloans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class TC_006 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
	
		test=reports.startTest("TC_005");
		
		init();
		test.log(LogStatus.INFO, "Initializing properties files.....");
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Launched the browser :-" +p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.INFO, "Navigated to url :- " + p.getProperty("amazonurl"));
		
		/*String actualTitle = driver.getTitle();
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon";

		System.out.println("Actual Title :" + actualTitle);
		System.out.println("Expected Title :" + expectedTitle);
		
		//if(actualTitle.equals(expectedTitle))
		//if(actualTitle.equalsIgnoreCase(expectedTitle))
		if(actualTitle.contains(expectedTitle))
			System.out.println("Both Titles are equal...");
		else
			System.out.println("Both Titles are not equal...");*/
		
		
		
		/*
		//String actualLink = driver.findElement(By.linkText("AmazonBasics")).getText();
		String actualLink = driver.findElement(By.linkText("AmazonBasics")).getAttribute("innerHTML");
		String expectedLink="AmazonBasics";
		
		System.out.println("Actual Link :" + actualLink);
		System.out.println("Expected Link :" + expectedLink);
		
		if(actualLink.equalsIgnoreCase(expectedLink))
			System.out.println("Both Links are equal...");
		else
			System.out.println("Both Links are not equal...");*/
		
		
		WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		
		loc.sendKeys("samsung");
		
		String value = loc.getAttribute("value");
		
		System.out.println("Value is : " + value);
		
	
		
		
	}
}
