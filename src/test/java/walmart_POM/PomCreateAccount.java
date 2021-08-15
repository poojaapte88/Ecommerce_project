package walmart_POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import walmartbasepackage.BaseWalmartclass;

public class PomCreateAccount extends BaseWalmartclass {
		
	
		//object repository
		
		  @FindBy(id="firstName") 
		  WebElement Firstname;
		  
		  @FindBy(css="#lastName") 
		  WebElement Lastname;
		  
		  @FindBy(xpath="//*[@id=\"phoneNumber\"]")
		  WebElement Phonenumber;
		  
		  @FindBy(css="#email")
		  WebElement Emailaddress;
		  
		  @FindBy(css="#password")
		  WebElement Password;
		  
		  @FindBy(xpath="//label[@class='css-1jg09os ega94xn0']")
		  WebElement OptionalCheckbox;
		  
		  @FindBy(
		  css="#create-account-form > div > div:nth-child(9) > div > div > label")
		  WebElement CreataccountCheckbox;
		  
		  @FindBy(xpath="//button[text()='Create account']")
		  WebElement Createaccountbtn;
		  
		  @FindBy(xpath="//*[@id=\"create-account-form\"]/div/div[10]/button")
		  WebElement sliderElement;
		  
		  @FindBy(xpath="//*[@id=\"unlfDIcePUMrUNV\"]") 
		  WebElement clickHold;
		 
		
		
		//initiate page elements
		
		public PomCreateAccount()
		{
			PageFactory.initElements(driver,this);
		}
		
		
		  public void enterFirstname(String fname) throws InterruptedException 
		  { 
			  Firstname.sendKeys(fname);
			  String expectederrormsg = "Please enter a valid first name.";
			  String actualerromsg=driver.getTitle();
			  Thread.sleep(2000);

			  
			  if(expectederrormsg.equals(actualerromsg))
			  {
				  System.out.println("Error message matching..");
			  }
				 
			  else {
				System.out.println("Error message Validation failed");
			}
			  
		  }
		  
		  public void enterLastname(String lname) throws InterruptedException
		  { 
			  Lastname.sendKeys(lname);
			  Thread.sleep(2000);
		  }
		  
		  public void enterPhonenumber(String phone) throws InterruptedException
		  { 
			  Phonenumber.sendKeys(phone);
			  Thread.sleep(2000);
		   }
		  
		  public void enterEmailaddress(String email) throws InterruptedException
		  {
			  Emailaddress.sendKeys(email);
			  Thread.sleep(2000);
		  }
		  
		  public void enterPassword(String pass) throws InterruptedException
		  {
			  Password.sendKeys(pass); 
			  Thread.sleep(2000);
		  }
		  
		  public void OptionalCheck() throws InterruptedException
		  {
		  
			  OptionalCheckbox.click();
			  Thread.sleep(2000);
		   }
		  
		  public void createAccountcheck() throws InterruptedException {
		  
		  CreataccountCheckbox.click(); 
		  Thread.sleep(4000);
		  
		  }
		  
		  
		  public void createAccountbtn() throws InterruptedException {
		  Createaccountbtn.click(); 
		  Thread.sleep(8000);
		//  boolean presshold= 
		  }
		  
		  public void robotHandling() throws AWTException 
		  { 
			 
			  
			  try {
				  driver.findElement(By.xpath("//div[contains(@aria-label,'Human Challenge requires verification. Please press and hold the button until verified')]")).isDisplayed();
				  
					} 
				catch (AssertionError e)
				{
					Robot robot = new Robot();
					robot.mouseMove(110,325);
					robot.delay(2000);
					robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
					robot.delay(5000);
					robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
					robot.delay(2000);
					System.out.println("Robot handling test executed!");
					e.printStackTrace();
				}
			  
		  }		

	}



