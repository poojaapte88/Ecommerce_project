package walmart_testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import walmart_POM.PomGuestAccount;
import walmartbasepackage.BaseWalmartclass;

public class GuestAccount_Test extends BaseWalmartclass {

	PomGuestAccount Create;
	public GuestAccount_Test()
	{
		super();
	}
@BeforeMethod
	
	public void initsetup()
	{ 
		initiation(); 
		Create= new PomGuestAccount();
	
	}	


@Test(priority=1)

public void VerifyGuestUserNavigation() throws InterruptedException
{
	Create.ClickOnPatioLink();
	Create.ScrollTo();
	Create.ClickOnConversationSets();
	Create.ScrollDown();
	Create.ClickOnPatioSet();
	Create.IncreaseProductQuantity();
	Create.Scroll();
	Create.AddToCartButton();
	Create.CheckOutButton();
	Create.ProceedToCheckOut();
	Create.CheckOutAsGuest();
	Create.ShippingOption();
	Create.CloseBrowser();
	
	
}

@AfterMethod
public void CloseTheBrowser()
{
	driver.quit();
}
}
