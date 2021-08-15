package walmart_testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import walmart_POM.PomMyList;
import walmartbasepackage.BaseWalmartclass;

public class MyList_test extends BaseWalmartclass
{
	private static final String username = "adamwilson271988@yahoo.com";
	private static final String password = "Abc@D1234$";
	private static final String searchtext= "Home Decor";
	
		
	PomMyList Create;
	public MyList_test()  
	{
		super();
	}
@BeforeMethod
	
	public void initsetup()
	{ 
		initiation(); 
		Create= new PomMyList();
	
	}	

//Login and navigate to My Account page. Next click on Lists.
@Test(priority=1)
public void GoToListPage() throws InterruptedException {
Create.enterEmail(username);

Create.enterPassword(password);
Create.clicksignin();
Create.MyAccountpage();

Create.ScrollDown();

Create.MyList();
	
Create.Searchbox(searchtext);
Create.ClickSearchButton();
Create.clickSignout();
}

@AfterMethod
public void CloseBrowser()
{
	driver.close();
}
}
