package walmart_testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import walmartbasepackage.BaseWalmartclass;
import walmart_POM.PomLogin;



	
	public class Login_Test extends BaseWalmartclass {
		
	
	private static final String username = "adamwilson271988@yahoo.com";
	private static final String password = "Abc@D1234$";
	
		
	PomLogin Create;
	public Login_Test()
	{
		super();
	}
	@BeforeMethod
	
	public void initsetup()
	{ 
		loginUrl(); 
		Create= new PomLogin();
	
	}	
	

	
	
	  @Test(priority=1) public void validTest() throws InterruptedException
	  {
	  Create.enterEmail(username);
	  
	  Create.enterPassword(password);
	  Create.clicksignin();
	 
	  }
	  
	  @AfterMethod
		public void closebrowser()
		{
			driver.close();
		}
	 
	}



