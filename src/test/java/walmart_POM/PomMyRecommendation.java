package walmart_POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import walmartbasepackage.BaseWalmartclass;

public class PomMyRecommendation extends BaseWalmartclass {
		
	
		//object repository
		
	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath="//button[@class='css-vfxkzw edzik9p0']")
	WebElement Signin;
	
	@FindBy(xpath="//span[@data-automation='my-account-link']")  
	WebElement hovermouse;
	
	@FindBy(xpath ="//a[@href='/my-account/recommendations']" )
	WebElement myRecommendationLink;
	
	@FindBy(xpath="//span[text()='My Account ']")
	WebElement hovermouseaftermyRecommendation;
	
	@FindBy(xpath="//span[text()='People with similar interests also bought:']")
	WebElement undertext;
	
	@FindBy(xpath="//html[@lang='en']")
	WebElement scrolldown;
	
	@FindBy(xpath="(//div[@class='bx-next'])[3]")
	WebElement bxslider;
	
	@FindBy(xpath="//*[@id=\"header-sign-out\"]")
	WebElement signoutbtn;
	
	
	
		 
		
		
		//initiate page elements
		
		public PomMyRecommendation()
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
		  public void MyRecommendationpage() throws InterruptedException
			{
				
				Actions action = new Actions(driver);
				action.moveToElement(hovermouse).perform();
				action.click(myRecommendationLink);
				action.build().perform();
				Thread.sleep(3000);
				
			}
		  public void MyRecommendationPageTitle() throws InterruptedException
		  {
			  String actualTitle = driver.getTitle();
			  System.out.println(actualTitle);
			  String expectedTitle = "My Recommendations | Walmart Canada";
				if(actualTitle.equals(expectedTitle))
					System.out.println("Title Matched");
				else
					System.out.println("Title didn't match");
				Thread.sleep(3000);
				
		  }
		  
		  public void underText() throws InterruptedException
		  {
			  
			  if(undertext.isDisplayed())
					   System.out.println("People with similar purchase history found");
					  else 
						  System.out.println("People with similar purchase history not found");
			  			  Thread.sleep(3000);
			
		  }
		  


		public void bxSlider() throws InterruptedException
		  {
			 
			
			  JavascriptExecutor executor = (JavascriptExecutor)driver;
			  executor.executeScript("arguments[0].click();", bxslider);
			  Thread.sleep(3000);
		  }
		  
		 
		  public void clickSignout() throws InterruptedException
		  {
			  	Actions action = new Actions(driver);
			  	//for hovering the mouse after clicking on my recommendation link to click on signout button
				action.moveToElement(hovermouseaftermyRecommendation).perform();
				action.click(signoutbtn);
				action.build().perform();
				Thread.sleep(3000);
		  }
		  
		  public void PageTitleAfterSignOut()
		  {
			  String actualTitle = driver.getTitle();
			  System.out.println(actualTitle);
			  String expectedTitle = "Online Shopping Canada: Everyday Low Prices at Walmart.ca!";
				if(actualTitle.equals(expectedTitle))
					System.out.println("Title Matched");
				else
					System.out.println("Title didn't match");
		  }
		  
		  public void CloseBrowser()
		  {
			  driver.close();
		  }
		  
		}



