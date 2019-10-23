package com.icici.loans.carloans;

import org.apache.log4j.Logger;

public class TC_004 extends BaseTest
{

	private static final Logger log=Logger.getLogger(TC_004.class.getName());
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Initializing properties files.....");
		
		launch("chromebrowser");
		log.info("Launched the browser :-" +p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url :- " + p.getProperty("amazonurl"));

		selectOption("amazondropdown_id","Books");
		log.info("Selected the item Books by using locator :- " + or.getProperty("amazondropdown_id"));
		
		typeValue("amazonsearchbox_id","Harry Potter");
		log.info("Entered the test Harry Potter by using locator :- " + or.getProperty("amazonsearchbox_id"));
		
		clickEement("amazonsearchbutton_xpath");
		log.info("Clicked on Button by using locator :- " +  or.getProperty("amazonsearchbutton_xpath"));
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		
		
		
		
		
		
		
		
		
		

	}

	

}
