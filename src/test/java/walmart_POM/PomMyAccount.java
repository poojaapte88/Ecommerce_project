package walmart_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import walmartbasepackage.BaseWalmartclass;

public class PomMyAccount extends BaseWalmartclass {
	
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
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[5]/a")
	WebElement shoppingcartlink;
	
	@FindBy(xpath="//span[@data-automation='my-account-link']")
	WebElement hovermouseaftershoppingcartlink;
	
	@FindBy(xpath="//a[@href='/my-account/order-history']")
	WebElement myorderslink;
	
	@FindBy(xpath="//span[@data-automation='my-account-link']")
	WebElement hovermouseaftermyaccount;
	
	@FindBy(xpath="//a[@data-automation='sign-out-link']")
	WebElement signoutbtn;
	
	//initiate page elements
	
			public PomMyAccount() 
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
			  
			  public void ShoppingCartLink() throws InterruptedException
			  {
				  shoppingcartlink.click();
				  Thread.sleep(3000);
			  }
			  
			  public void MyOrdersPage() throws InterruptedException
			  {
				  	Actions action = new Actions(driver);
					action.moveToElement(hovermouseaftershoppingcartlink).perform();
					action.click(myorderslink);
					action.build().perform();
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
			  
			  public void PageTitleAfterSignOut() throws InterruptedException
			  {
				  String actualTitle = driver.getTitle();
				  System.out.println(actualTitle);
				  String expectedTitle = "Online Shopping Canada: Everyday Low Prices at Walmart.ca!";
					if(actualTitle.equals(expectedTitle))
						System.out.println("Title Matched");
					else
						System.out.println("Title didn't match");
					Thread.sleep(3000);
			  }
			  
			  public void CloseBrowser()
			  {
				  driver.close();
			  }
			  


			
			  
			  
	

}
