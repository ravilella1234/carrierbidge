package com.icici.loans.carloans;

import com.relevantcodes.extentreports.LogStatus;

public class TC_007 extends BaseTest
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
		
		
		
		
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(!verifyTitle(expectedTitle))
			reportFailure("Both Titles are not equal...");
		else
			reportSuccess("Both Titles are  equal...");
		
		
		String expectedLink="AmazonBasic";
		if(!verifyElement(expectedLink))
			reportFailure("Both Links are not equal...");
		else
			reportSuccess("Both Links are  equal...");
		
		reports.endTest(test);
		reports.flush();
	
	}
}
