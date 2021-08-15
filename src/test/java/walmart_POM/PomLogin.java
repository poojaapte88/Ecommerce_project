package walmart_POM;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import walmartbasepackage.BaseWalmartclass;

public class PomLogin extends BaseWalmartclass {
		
	
	//object repository
		
	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath="//button[@class='css-vfxkzw edzik9p0']")
	WebElement Signin;
	
	
	//initiate page elements
		
		public PomLogin()
		{
			PageFactory.initElements(driver,this);
		}
		
		
		  public void enterEmail(String username) 
		  { 
			  Email.sendKeys(username);
			  
		  }
		  
		  public void enterPassword(String password)
		  { 
			  Password.sendKeys(password);
		  }
		  
		  public void clicksignin()
			{
				Signin.click();
				
			}
		

	}



