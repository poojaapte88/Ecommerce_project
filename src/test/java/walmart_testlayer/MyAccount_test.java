package walmart_testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import walmart_POM.PomMyAccount;
import walmartbasepackage.BaseWalmartclass;

public class MyAccount_test extends BaseWalmartclass {
	
	private static final String username = "adamwilson271988@yahoo.com";
	private static final String password = "Abc@D1234$";
	PomMyAccount Create;
	
	public MyAccount_test() 

	{
		super();
	}
	
@BeforeMethod
	
	public void initsetup()
	{ 
		initiation(); 
		Create= new PomMyAccount();
	
	}	
//Login and navigate to My Account page to view and access page
@Test(priority=1) public void viewAccessMyAccountPage() throws InterruptedException
{
//Enter username	
Create.enterEmail(username);

//Enter password
Create.enterPassword(password);

//Click on signin button
Create.clicksignin();

//Go to MyAccount page
Create.MyAccountpage();

//Verify if MyAccount page title matches
Create.MyAccountPageTitle();

//Click on signout button
Create.clickSignout();

//Verify Signout page title after signing out
Create.PageTitleAfterSignOut();

//Close the browser
Create.CloseBrowser();

}

//Login and navigate to My Account page and then navigate to shopping cart page
@Test(priority=2)
public void ClickOnShoppingCart() throws InterruptedException
{
	//Enter username	
	Create.enterEmail(username);
	
	//Enter password
	Create.enterPassword(password);
	
	//Click on signin button
	Create.clicksignin();
	
	//Go to MyAccount page
	Create.MyAccountpage();
		
	//Verify if MyAccount page title matches
	Create.MyAccountPageTitle();
	
	//Click on Shopping cart link
	Create.ShoppingCartLink();
	
	//Click on signout button
	Create.clickSignout();
	
	//Verify Signout page title after signing out
	Create.PageTitleAfterSignOut();
	
	//Close the browser
	Create.CloseBrowser();
	
	
}

//Login and navigate to My Orders page and then logout
@Test(priority=3)
public void ClickOnMyOrdersLink() throws InterruptedException
{
	//Enter username	
	Create.enterEmail(username);
	
	//Enter password
	Create.enterPassword(password);
	
	//Click on signin button
	Create.clicksignin();
	
	//Go to MyAccount page
	Create.MyAccountpage();
	
	//Go to Myorders page from MyAccount page
	Create.MyOrdersPage();
	
	//Click on Signout button
	Create.clickSignout();
	
	//Verify Signout page title after signing out
	Create.PageTitleAfterSignOut();
	
	//Close the browser
	Create.CloseBrowser();
}

@AfterMethod
public void closebrowser()
{
	driver.close();
}
}
