package walmart_testlayer;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import walmartbasepackage.BaseWalmartclass;
import walmart_POM.PomCreateAccount;



	
	public class CreateAccount_test extends BaseWalmartclass {
		
	
	private static final String Firstname = "M";
	private static final String Lastname = "Wilson";
	private static final String Phonenumber = "0987654333";
	private static final String Emailaddress = "mark_wilson19871988@yahoo.com";
	private static final String Password = "Abc@D1234$";
	
	
		
	PomCreateAccount Create;
	public CreateAccount_test()
	{
		super();
	}
	@BeforeMethod
	
	public void initsetup()
	{ 
		createAccount(); 
		Create= new PomCreateAccount();
	
	}	
	

	//Test to check if user is able to create an account by entering valid details in the form
	
	  @Test(priority=1) public void validTest() throws InterruptedException, AWTException 
	  {
	  Create.enterFirstname(Firstname);
	  
	  Create.enterLastname(Lastname);
	  
	  Create.enterPhonenumber(Phonenumber);
	  
	  Create.enterEmailaddress(Emailaddress);
	  
	  Create.enterPassword(Password);
	  
	  Create.OptionalCheck();
	  
	  Create.createAccountcheck();
	  
	  
	  Create.createAccountbtn(); 
	  Create.robotHandling();
	  }
	  
	  @Test(priority=2) public void invalidformentries() throws InterruptedException
	  {
		  	  //Enter invalid first name
		  	  Create.enterFirstname(Firstname);	
		  	  
		  	  //Enter invalid last name
			  Create.enterLastname(Lastname);
			  
			  //Enter invalid phone number
			  Create.enterPhonenumber(Phonenumber); 
			  
			  //Enter invalid email address
			  Create.enterEmailaddress(Emailaddress);
			  
			  //Enter invalid password
			  Create.enterPassword(Password);
			  
			  //Click on Optional Check checkbox
			  Create.OptionalCheck();
			 
			  //Click on Create Account checkbox
			  Create.createAccountcheck();
			 
			  //Click on Create Account button
			  Create.createAccountbtn(); 
			
	  
	  }
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	 
	}



