package com.icici.loans.carloans;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;

public class TC_005 extends BaseTest
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

		selectOption("amazondropdown_id","Books");
		test.log(LogStatus.INFO, "Selected the item Books by using locator :- " + or.getProperty("amazondropdown_id"));
		
		typeValue("amazonsearchbox_id","Harry Potter");
		test.log(LogStatus.INFO, "Entered the test Harry Potter by using locator :- " + or.getProperty("amazonsearchbox_id"));
		
		
		clickEement("amazonsearchbutton_xpath");
		test.log(LogStatus.INFO, "Clicked on Button by using locator :- " +  or.getProperty("amazonsearchbutton_xpath"));
		
		
		reports.endTest(test);
		
		reports.flush();
		

	}

	

}
