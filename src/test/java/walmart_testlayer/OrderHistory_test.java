package walmart_testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import walmart_POM.PomOrderHistory;
import walmartbasepackage.BaseWalmartclass;

public class OrderHistory_test extends BaseWalmartclass {
	
	private static final String username = "adamwilson271988@yahoo.com";
	private static final String password = "Abc@D1234$";
	PomOrderHistory Create;
	
	public OrderHistory_test()

	{
		super();
	}
	
@BeforeMethod
	
	public void initsetup()
	{ 
		initiation(); 
		Create= new PomOrderHistory();
	
	}	
//Login and navigate to My Account page to view and access page
@Test(priority=1) 
public void viewAccessMyAccountPage() throws InterruptedException
{
	//Enter username
	Create.enterEmail(username);
	
	//Enter password
	Create.enterPassword(password);
	
	//Click on sign in button
	Create.clicksignin();

	//Click on MyAccount link and go to MyAccount page
	Create.MyAccountpage();

	//Verify MyAccount page title
	Create.MyAccountPageTitle();
	
	//Click on Order history link and view order history if any
	Create.ViewOrderHistory();

	//Click on signout button
	Create.clickSignout();

}

@Test(priority=2)
public void ViewOrdersFromLastTenYears() throws InterruptedException
{
	//Enter username
	Create.enterEmail(username);
	
	//Enter password
	Create.enterPassword(password);
	
	//Click on sign in button
	Create.clicksignin();
	
	//Click on MyAccount link and go to MyAccount page
	Create.MyAccountpage();
	
	//Verify MyAccount page title
	Create.MyAccountPageTitle();
	
	//Click on Order history link and view order history if any
	Create.ViewOrderHistory();
	
	//View last 10 years of order history if any
	Create.ViewLast10YearsOrderHistory();
	
	//Select a year to view order history of that year
	Create.SelectaYearToViewOrderHistory();
	
	//Click on signout button
	Create.clickSignout();
	
}

@Test(priority=3)
public void VerifyTextWhenOrderIsNotPlaced() throws InterruptedException
{
	//Enter username
	Create.enterEmail(username);
	
	//Enter password
	Create.enterPassword(password);
	
	//Click on sign in button
	Create.clicksignin();
	
	//Click on MyAccount link and go to MyAccount page
	Create.MyAccountpage();
	
	//Verify MyAccount page title
	Create.MyAccountPageTitle();
	
	//Click on Order history link and view order history if any
	Create.ViewOrderHistory();
	
	//View last 10 years of order history if any
	Create.ViewLast10YearsOrderHistory();
	
	//Select a year to view order history of that year
	Create.SelectaYearToViewOrderHistory();
	
	//Verify if actual and expected text matches when no orders are placed
	Create.VerifyTextWhenNoRrdersPlaced();
	
	//Click on signout button
	Create.clickSignout();
}

@Test(priority=4)
public void VerifyStartShoppingLinkworking() throws InterruptedException
{
	//Enter username
	Create.enterEmail(username);
	
	//Enter password
	Create.enterPassword(password);
	
	//Click on sign in button
	Create.clicksignin();
	
	//Click on MyAccount link and go to MyAccount page
	Create.MyAccountpage();
	
	//Verify MyAccount page title
	Create.MyAccountPageTitle();
	
	//Click on Order history link and view order history if any
	Create.ViewOrderHistory();
	
	//View last 10 years of order history if any
	Create.ViewLast10YearsOrderHistory();
	
	//Select a year to view order history of that year
	Create.SelectaYearToViewOrderHistory();
	
	//Verify if actual and expected text matches when no orders are placed
	Create.VerifyTextWhenNoRrdersPlaced();
	
	//Verify if start shopping link works
	Create.StartShoppingLink();
	
	//Click on signout button
	Create.clickSignout();
	
	//Close the browser
	Create.CloseBrowser();
}
@AfterMethod

//Close the browser
public void closebrowser()
{
	driver.quit();
}
}



