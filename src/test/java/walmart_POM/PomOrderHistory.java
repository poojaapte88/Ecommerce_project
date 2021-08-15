package walmart_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import walmartbasepackage.BaseWalmartclass;

public class PomOrderHistory extends BaseWalmartclass
{
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
	
	@FindBy(xpath="//p[@class='css-ww8iju e1p2iyht4']")
	WebElement orderhistorylink;
	
	@FindBy(xpath="//select[@class='css-141gpem e1tbi35p0']")
	WebElement viewhistorydropdownbutton;
	
	@FindBy(xpath="//option[@value='{\"date\":2019,\"count\":0}']")
	WebElement selectayearforhistory;
	
	@FindBy(xpath="//div[@class='css-1rgkcr e1f6n1xh2']//div[1]")
	WebElement verifytextwhennoordersplaced;
	
	@FindBy(xpath="//a[contains(@class,'e1f6n1xh0 css-kggsyq')]")
	WebElement startshoppinglink;
	
	@FindBy(xpath="//span[@data-automation='my-account-link']")
	WebElement hovermouseaftermyaccount;
	
	@FindBy(xpath="//a[@data-automation='sign-out-link']")
	WebElement signoutbtn;
	
	//initiate page elements
	
	public PomOrderHistory() 
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
	  
	  public void MyAccountPageTitle() throws InterruptedException
	  {
		  String actualTitle = driver.getTitle();
		  System.out.println(actualTitle);
		  String expectedTitle = "Shop Walmart.ca: Online Shopping & Everyday Low Prices";
			if(actualTitle.equals(expectedTitle))
				System.out.println("Title Matched");
			else
				System.out.println("Title didn't match");
			Thread.sleep(3000);
			
	  }
	  
	  public void ViewOrderHistory() throws InterruptedException
	  {
		  orderhistorylink.click();
		  Thread.sleep(3000);
	  }
	  
	  public void ViewLast10YearsOrderHistory() throws InterruptedException
	  {
		  viewhistorydropdownbutton.click();
		  Thread.sleep(3000);
	  }
	  
	  public void SelectaYearToViewOrderHistory() throws InterruptedException
	  {
		  selectayearforhistory.click();
		  Thread.sleep(3000);
	  }
	  
	  public void VerifyTextWhenNoRrdersPlaced() throws InterruptedException
	  {
		  if(verifytextwhennoordersplaced.isDisplayed())
			   System.out.println("You currently have no orders to display");
			  else 
				  System.out.println("Text not matching");
		  Thread.sleep(3000);
	  }
	  
	  public void StartShoppingLink() throws InterruptedException
	  {
		  startshoppinglink.click();
		  String Expected_Window_Title = "Online Shopping Canada: Everyday Low Prices at Walmart.ca!";
		  String Current_window_title = driver.getTitle();
		  Assert.assertEquals(Current_window_title,Expected_Window_Title);
		  System.out.println("AssertEquals test passed");
		  Thread.sleep(3000);
		  
		  
	  }
	  
	  public void clickSignout()
	  {
		  	Actions action = new Actions(driver);
		  	//for hovering the mouse after clicking on my recommendation link to click on signout button
			action.moveToElement(hovermouseaftermyaccount).perform();
			action.click(signoutbtn);
			action.build().perform();
	  }
	  
	  public void CloseBrowser()
	  {
		  driver.close();
	  }



}
