package walmart_testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import walmart_POM.PomAddresses;
import walmartbasepackage.BaseWalmartclass;

public class Addresses_Test extends BaseWalmartclass 
{
	private static final String username = "adamwilson271988@yahoo.com";
	private static final String password = "Abc@D1234$";
	private static final String addaddresstext ="30 Streamline Drive";
	private static final String city="Brampton";
	private static final String postal="L6V 4T2";
	private static final String phone="5198342344";
	
	PomAddresses Create;
	public Addresses_Test()
	{
		super();
	}
@BeforeMethod
	
	public void initsetup()
	{ 
		initiation(); 
		Create= new PomAddresses();
	
	}	
	

	
	//Login and navigate to My Subscription page to view and access page
	  @Test(priority=1) 
	  public void ClickOnAddressesLink() throws InterruptedException
	  {
	  Create.enterEmail(username);
	  
	  Create.enterPassword(password);
	  Create.clicksignin();
	  Create.MyAccountpage();
	  Create.AddressLink();
	  Create.AddressButton();
	  Create.ScrollDown();
	  Create.AddAddressText(addaddresstext,city);
	 
	//  Create.SelectAddressFromOptions();
	  Create.ProvinceDropDown();
	  Create.EnterPostalCode(postal);
	  Create.EnterPhoneNumber(phone);
	  Create.ClickOnSaveButton();
	  Create.ClickOnSaveAddressButton();
	  Create.ScrollUp();
	  Create.clickSignout();
	  Create.VerifyTitleAfterSignOut();
	  Create.CloseBrowser();
}
	  
	 @AfterMethod
	 public void CloseBrowser()
	 {
		 driver.close();
	 }
	 
}
