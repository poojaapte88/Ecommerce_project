package walmart_POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import walmartbasepackage.BaseWalmartclass;

public class PomProfileSettings extends BaseWalmartclass {
	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath="//button[@class='css-vfxkzw edzik9p0']")
	WebElement Signin;
	
	@FindBy(xpath="//span[@data-automation='my-account-link']")  
	WebElement hovermouse;
	
	@FindBy(xpath="(//a[@class='css-1t0um3j et5cpij4'])[4]")
	WebElement myaccountlink;
	
	@FindBy(xpath="(//div[@class='css-1sll2pi e12pf3y42'])[1]")
	WebElement profilesettingslink;
	
	@FindBy(xpath="(//button[@class='css-1amkq5n eezo71g2'])[1]")
	WebElement editlinkforfullname;
	
	@FindBy(xpath="(//input[@class='css-1lo2pik eesbt950'])[1]")
	WebElement firstnametextbox;
	
	@FindBy(xpath="//button[contains(@class,'eex3brl11 css-1aukoqp')]")
	WebElement savebutton;
	
	@FindBy(xpath="//button[contains(@class,'eex3brl6 css-fe445y')]")
	WebElement cancelbutton;
	
	@FindBy(xpath="(//button[@data-automation='edit-password'])[2]")
	WebElement changepassword;
	
	@FindBy(xpath="(//input[@id='currentPassword'])[2]")
	WebElement currentpassword;
	
	@FindBy(xpath="(//input[@id='newPassword'])[2]")
	WebElement newpasswordElement;
	
	@FindBy(xpath="//button[contains(@class,'eex3brl11 css-1aukoqp')]")
	WebElement updatepassword;
	
	@FindBy(xpath="//span[@data-automation='my-account-link']")
	WebElement hovermouseafterpasswordupdate;
	
	@FindBy(xpath="//a[@data-automation='sign-out-link']")
	WebElement signoutbutton;
	
	@FindBy(xpath="(//button[@data-automation='update-password-cancel'])[2]")
	WebElement passwordcancelbutton;
	
	public PomProfileSettings() 
	 
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
	  
	  public void clicksignin() throws InterruptedException
		{
			Signin.click();
			Thread.sleep(8000);
			
		}
	  
	  public void MyAccountpage() throws InterruptedException
		{
			
			Actions action = new Actions(driver);
			action.moveToElement(hovermouse).perform();
			action.click(myaccountlink);
			action.build().perform();
			Thread.sleep(3000);
			
		}
	  
	  public void ScrollBy()
	  {
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,500)","");
	  }
	  
	  public void ProfileSettingsLink() throws InterruptedException
	  {
		  	Actions action = new Actions(driver);
			
			action.click(profilesettingslink);
			action.build().perform();
			Thread.sleep(4000);
			
		  
	  }
	  
	  public void EditFullName() throws InterruptedException
	  {
		  Actions action = new Actions(driver);
			
			action.click(editlinkforfullname);
			action.build().perform();
			Thread.sleep(4000);
			
	  }
	  
	  public void clearExistingText(String newText) throws InterruptedException{
		    firstnametextbox.clear();
		    firstnametextbox.sendKeys(newText);
		    Thread.sleep(3000);
		  }
	  public void ClickSaveButton() throws InterruptedException
	  {
		  Actions action = new Actions(driver);
			
			action.click(savebutton);
			action.build().perform();
			Thread.sleep(4000);
	  }
	  
	  public void ChangePassword() throws InterruptedException
	  {
		  Actions action = new Actions(driver);
			
			action.click(changepassword);
			action.build().perform();
			Thread.sleep(4000);
	  }
	  
	  public void CurrentAndNewPassword(String currentpass,String newpass) throws InterruptedException
	  {
		  currentpassword.sendKeys(currentpass);
		  newpasswordElement.sendKeys(newpass);
		  Thread.sleep(3000);
		  Actions actions=new Actions(driver);
		  actions.click(updatepassword);
		  actions.build().perform();
		  
	  }
	  
	  public void ClickCancelButton() throws InterruptedException
	  {
		  Actions action = new Actions(driver);
			
			action.click(cancelbutton);
			action.build().perform();
			Thread.sleep(4000);
	  }
	  
	  public void clickSignout() throws InterruptedException
	  {
		  	Actions action = new Actions(driver);
		  	//for hovering the mouse after clicking on my recommendation link to click on signout button
			action.moveToElement(hovermouseafterpasswordupdate).perform();
			action.click(signoutbutton);
			action.build().perform();
			Thread.sleep(3000);
	  }
	  
	  public void Cancelbutton() throws InterruptedException
	  {
		  Actions action = new Actions(driver);
		  	
			action.click(passwordcancelbutton);
			action.build().perform();
			Thread.sleep(3000);
	  }
	  
	  public void CloseBrowser()
	  {
		  driver.close();
	  }
}
