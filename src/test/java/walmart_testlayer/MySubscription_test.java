package walmart_testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import walmart_POM.PomMySubscription;
import walmartbasepackage.BaseWalmartclass;

public class MySubscription_test extends BaseWalmartclass {
	
	private static final String username = "adamwilson271988@yahoo.com";
	private static final String password = "Abc@D1234$";
	
		
	PomMySubscription Create;
	public MySubscription_test() 
	{
		super();
	}
@BeforeMethod
	
	public void initsetup()
	{ 
		initiation(); 
		Create= new PomMySubscription();
	
	}	
	

	
	//Login and navigate to My Subscription page to view and access page
	  @Test(priority=1) public void ViewAccessMySubscriptionPage() throws InterruptedException 
	  {
	  
	  //Enter username	  
	  Create.enterEmail(username);
	  
	  //Enter password
	  Create.enterPassword(password);
	  
	  //Click on signin
	  Create.clicksignin();
	  
	  //Click on MySubscription link
	  Create.MySubscriptionLink();
	  
	  //Verify mysubscritionlink title
	  Create.MySubscriptionLinkTitle();
	  
	  //Click on signout
	  Create.clickSignout();  
	  
	 //Verify page title after signout
	  Create.PageTitleAfterSignOut();
	  
	  }
	  
	  //Login and navigate to My Account page and then click on Subscription link. 
	  //Next click on "Sign out" button from the drop down menu
	  
	  @Test(priority=2)
	  public void ViewAccessSecondSubscriptionLink() throws InterruptedException
	  {
		  //Enter username	
		  Create.enterEmail(username);
		  
		  //Enter password
		  Create.enterPassword(password);
		  
		  //Click on signin
		  Create.clicksignin();
		  
		  //Go to my account page
		  Create.MyAccountpage();
		  
		  //Click on second subscription link
		  Create.SecondSubscriptionLink();
		  
		  //Click on signout button
		  Create.clickSignout();
		  
		  
	  }
	  
	  @Test(priority=3)
	  public void VerifyDiscountAfterSubscription() throws InterruptedException
	  {
		  //Enter username	
		  Create.enterEmail(username);
		  
		  //Enter password
		  Create.enterPassword(password);
		  
		  //Click on Sign in
		  Create.clicksignin();
		  
		  //Click on MySubscription link
		  Create.MySubscriptionLink();
		  
		  //Subscribe to a product
		  Create.SubscribeAndSave();
		  
		  //Click on a specific product to subscribe
		  Create.SelectProductToSubscribe();
		 
		  //Scroll down to the element
		  Create.ScrollBy();
		  
		  //Select subscribe radio button to subscribe to a product
		  Create.SubscribeRadioButton();
		  
		  //Click on Add to Cart button
		  Create.AddtoCart();
		  
		  //Click on Checkout button
		  Create.CheckOut();
		   
		  //Click on Signout button
		  Create.clickSignout();
		  
	  }
	  
	  @Test(priority=4)
	  public void VerifyRadioButtonIsToggling() throws InterruptedException
	  {
		  //Enter username	
		  Create.enterEmail(username);
		  
		  //Enter password
		  Create.enterPassword(password);
		  
		  //Click on Sign in
		  Create.clicksignin();
		  
		  //Click on MySubscription link
		  Create.MySubscriptionLink();
		  
		  //Subscribe to a product
		  Create.SubscribeAndSave();
		 
		  //Click on a specific product to subscribe
		  Create.SelectProductToSubscribe();
		  
		  //Scroll down to the element
		  Create.ScrollBy();
		  
		  //Select subscribe radio button to subscribe to a product
		  Create.SubscribeRadioButton();
		  
		  //Click on Add to Cart button
		  Create.AddtoCart();
		  
		  //Click on Checkout button 
		  Create.CheckOut();
		  
		  //Select one time delivery option
		  Create.OneTimeDeliveryOption();
		  
		  //Click on signout button
		  Create.clickSignout();
		  
	  }
	  @Test(priority=5)
	  public void VerifyPriceUpdate() throws InterruptedException
	  {
		  //Enter username	
		  Create.enterEmail(username);
		  
		  //Enter password
		  Create.enterPassword(password);
		  
		  //Click on Sign in
		  Create.clicksignin();
		  
		  //Click on MySubscription link
		  Create.MySubscriptionLink();
		  
		  //Subscribe to a product
		  Create.SubscribeAndSave();
		  
		  //Click on a specific product to subscribe
		  Create.SelectProductToSubscribe();
		  
		  //Scroll down to the element
		  Create.ScrollBy();
		  
		  //Select subscribe radio button to subscribe to a product
		  Create.SubscribeRadioButton();
		  
		  //Click on Add to Cart button
		  Create.AddtoCart();
		  
		  //Click on Checkout button 
		  Create.CheckOut();
		  
		  //Select one time delivery option 
		  Create.OneTimeDeliveryOption();
		  
		  //Verify if price updates when user clicks on one time delivery option
		  Create.PriceUpdate();
		  
		  //Click on Subscribe and save radio button
		  Create.subscribeAndSaveRadioButton();
		  
		  //Verify if price updates after user selects Subscribe and Save option
		  Create.SubscriptionPriceUpdate();
		  
		  //Verify using assertion that final price updates depending on options: One time delivery/Subscribe and Save
		  Create.AssertSubscriptionPriceAndRegularPrice();
		  
		  //Click on signout button
		  Create.clickSignout();
		  
		  //Close the browser
		  Create.CloseBrowser();
		  
	  }
	  @AfterMethod
	  //Close browser
	  public void CloseBrowser()
	  {
		  driver.quit();
	  }
	  
}
