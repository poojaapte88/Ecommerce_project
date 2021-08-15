package walmart_testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import walmart_POM.PomProfileSettings;
import walmartbasepackage.BaseWalmartclass;

public class ProfileSettings_Test extends BaseWalmartclass{
	
	private static final String username = "adamwilson271988@yahoo.com";
	private static final String password = "Abc@D1234$";
	private static final String newtext="Peter";
	private static final String currentpass = "AbcDefG234#";
	private static final String newpass="Abc@D1234$";
	
		
	PomProfileSettings Create;
	public  ProfileSettings_Test() 
	{
		super();
	}
@BeforeMethod
	
	public void initsetup()
	{ 
		initiation(); 
		Create= new PomProfileSettings();
	
	}	
	

	
	//Login and navigate to My Subscription page to view and access page
	  @Test(priority=1) 
	  public void ChangePersonalInfoExceptEmailIdAndSaveButtonFunctionality() throws InterruptedException
	  {
		//Enter username
		Create.enterEmail(username);
	  
		//Enter password
		Create.enterPassword(password);
		
		//Click on signin button
		Create.clicksignin();
		
		//Click on MyAccount link and go to MyAccount page
		Create.MyAccountpage();
		
		//Scroll down the page upto certain pixels
		Create.ScrollBy();
		
		//Click on profile settings link
		Create.ProfileSettingsLink();
		
		//Click on Edit link to edit name
		Create.EditFullName();
		
		//Clear existing text to enter new text
		Create.clearExistingText(newtext);
		
		//Click on save button
	 	Create.ClickSaveButton();
	 	
	 	//Close the browser
	 	Create.CloseBrowser();
	  
	  

}
	  @Test(priority=2) 
	  public void CheckFunctionalityOfCancelButton() throws InterruptedException
	  {
		  
	  //Enter username	  
	  Create.enterEmail(username);
	  
	  //Enter password
	  Create.enterPassword(password);
	  
	  //Click on signin button
	  Create.clicksignin();
	  
	  //Click on MyAccount link and go to MyAccount page
	  Create.MyAccountpage();
	  
	  //Scroll down the page upto certain pixels
	  Create.ScrollBy();
	  
	  //Click on profile settings link
	  Create.ProfileSettingsLink();
	  
	  //Click on Edit link to edit name
	  Create.EditFullName();
	  
	  //Clear existing text to enter new text 
	  Create.clearExistingText(newtext);
	  
	  //Click on Cancel button
	  Create.ClickCancelButton();
	  
	  //Close the browser
	  Create.CloseBrowser();
	  

}
	  @Test(priority=3) 
	  public void ChangePassword() throws InterruptedException
	  {
	
	  //Enter username	  
	  Create.enterEmail(username);
	  
	  //Enter password
	  Create.enterPassword(password);
	  
	  //Click on signin button
	  Create.clicksignin();
	  
	  //Click on MyAccount link and go to MyAccount page
	  Create.MyAccountpage();
	  
	  //Scroll down the page upto certain pixels
	  Create.ScrollBy();
	  
	  //Click on profile settings link
	  Create.ProfileSettingsLink();
	  
	  //Change password
	  Create.ChangePassword();
	  
	  //Enter current and new password to change the password
	  Create.CurrentAndNewPassword(currentpass, newpass);
	  
	  //Click on signout button
	  Create.clickSignout();
	  
	  //Close the browser
	  Create.CloseBrowser();
	  
	  
	 
	  
}
	  
	  @Test(priority=4)
	  public void CheckFunctionalityOfPasswordFieldCancelButton() throws InterruptedException
	  {
		  //Enter username	
		  Create.enterEmail(username);
		  
		  //Enter password
		  Create.enterPassword(password);
		  
		  //Click on signin button
		  Create.clicksignin();
		  
		  //Click on MyAccount link and go to MyAccount page
		  Create.MyAccountpage();
		  
		  //Scroll down the page upto certain pixels
		  Create.ScrollBy();
		  
		  //Click on profile settings link
		  Create.ProfileSettingsLink();
		  
		  //Change password
		  Create.ChangePassword();
		  
		  //Enter current and new password to change the password
		  Create.CurrentAndNewPassword(currentpass, newpass);
		  
		  //Click on Cancel button
		  Create.Cancelbutton();
		  
		  //Click on signout button
		  Create.clickSignout();
		  
		  //Close the browser
		  Create.CloseBrowser();
	  }
	  
	  @AfterMethod
	  
	  public void CloseTheBrowser()
	  {
		  driver.close();
	  }
}
