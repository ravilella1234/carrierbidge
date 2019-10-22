package com.icici.loans.carloans;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_003 extends  BaseTest
{

	public static void main(String[] args) throws Exception
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		/*WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		
		loc.sendKeys("sony");
		
		Thread.sleep(4000);
		
		loc.clear();
		
		driver.findElement(By.name("field-keywords")).sendKeys("philips");
		
		//driver.findElement(By.className("nav-input")).clear();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("samsung");
*/
		
		//driver.findElement(By.linkText("Amazon Pay")).click();
		
		//driver.findElement(By.partialLinkText("mazon Pa")).click();
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		for(int i=0;i<link.size();i++)
			if(!link.get(i).getText().isEmpty())
			System.out.println(link.get(i).getText());
		
	}

}
