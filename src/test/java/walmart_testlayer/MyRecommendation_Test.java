package walmart_testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import walmartbasepackage.BaseWalmartclass;
import walmart_POM.PomMyRecommendation;



	
	public class MyRecommendation_Test extends BaseWalmartclass {
		
	
	private static final String username = "adamwilson271988@yahoo.com";
	private static final String password = "Abc@D1234$";
	
		
	PomMyRecommendation Create;
	public MyRecommendation_Test()
	{
		super();
	}
	@BeforeMethod
	
	public void initsetup()
	{ 
		initiation(); 
		Create= new PomMyRecommendation();
	
	}	
	

	
	//Login and navigate to My Recommendation page to view and access page
	  @Test(priority=1) public void viewAccessMyRecommendationPage() throws InterruptedException {
	  Create.enterEmail(username);
	  
	  Create.enterPassword(password);
	  Create.clicksignin();
	  
	  Create.MyRecommendationpage();
	  
	  Create.MyRecommendationPageTitle();
	  
	  
	  Create.clickSignout();
	  
	  Create.PageTitleAfterSignOut();
	  
	  }
	  
	//Login and navigate to My Recommendation page to view and verify under text
	
	  @Test(priority=2) public void verifySimilarPurchaseByPeople() throws
	  InterruptedException 
	  { 
		  //To enter username
		  Create.enterEmail(username);
		  
		  //To enter password
		  Create.enterPassword(password);
		  
		  //To click on sign in button
		  Create.clicksignin();
		  
		  //To navigate to my recommendation page
		  Create.MyRecommendationpage();
		 
		  //To verify my recommendation page title
		  Create.MyRecommendationPageTitle();
		  
		  //To verify undertext
		  Create.underText();
		  
		  //Click on signout
		  Create.clickSignout(); 
		  
		  //To verify page title after signing out
		  Create.PageTitleAfterSignOut();
	  }
	 
	  @Test(priority=3) public void verifyFunctionalityofBxslider() throws InterruptedException
	  {
		  //To enter username
		  Create.enterEmail(username);
		  
		  //To enter password
		  Create.enterPassword(password);
		  
		  //To click on sign in button
		  Create.clicksignin();
		  
		  //To navigate to my recommendation page
		  Create.MyRecommendationpage();
		 
		  //To verify my recommendation page title
		  Create.MyRecommendationPageTitle();
		 
		  //To verify undertext
		  Create.underText();
		  
		  //To scroll the bxslider
		  Create.bxSlider();
		  
		  //Click on signout
		  Create.clickSignout(); 
		  
		  //Close the browser
		  Create.CloseBrowser();
	  }
	@AfterMethod
	  
		//To close the browser
	  	public void closebrowser()
	  {
		  driver.quit();
	  }
	 
	}



