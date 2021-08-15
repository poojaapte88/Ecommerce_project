package walmart_testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import walmart_POM.PomSearchFacility;
import walmartbasepackage.BaseWalmartclass;

public class SearchFacility_Test extends BaseWalmartclass 
{
	
	private static final String keyword = "bread";
	
	PomSearchFacility Create;
	
	public SearchFacility_Test()
	{
		super();
	}
@BeforeMethod
	//Method to initialize the driver and browser
	public void initsetup()
	{ 
		initiation(); 
		Create= new PomSearchFacility();
	
	}	
	
@Test(priority=1)
public void Search() throws InterruptedException
{
	//Enter text in the searchbox and click on search buttton
	Create.SearchWithKeyword(keyword);
	Create.CloseBrowser();
	
	
}

@AfterMethod
public void CloseTheBrowser()
{
	driver.quit();
}

}