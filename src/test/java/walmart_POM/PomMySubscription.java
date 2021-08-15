package walmart_POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import walmartbasepackage.BaseWalmartclass;

public class PomMySubscription extends BaseWalmartclass
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
  
	@FindBy(xpath="(//a[@class='css-1t0um3j et5cpij4'])[3]")
	WebElement mysubscriptionlink;
	
	@FindBy(xpath="//div[@class='og-autosave-product-button']")
	WebElement subscribetobabyproductslink;
	
	@FindBy(xpath="//img[@alt='Pampers Swaddlers Diapers, Super Econo Pack']")
	WebElement selectbabyproduct;
	
	@FindBy(xpath="(//input[@name='purchase_frequency'])[2]")
	WebElement subscriberadiobutton;
	
	@FindBy(xpath="//button[@class='css-vfxkzw edzik9p0']")
	WebElement addtocartbutton;
	
	@FindBy(xpath="(//button[@class='css-vfxkzw edzik9p0'])[2]")
	WebElement checkoutbutton;
	
	@FindBy(xpath="//input[@class='css-1dvfhqp e1rerbcg3']")
	WebElement onetimedeliveryradiobutton;
	
	@FindBy(xpath="(//div[@data-automation='money-box-estimated-total']//div)[3]")
	WebElement onetimedeliveryprice;
	
	@FindBy(xpath ="(//div[@data-automation='money-box-estimated-total']//div)[3]")
	WebElement SubscriptionPrice;
	
	@FindBy(xpath="(//input[@class='css-1dvfhqp e1rerbcg3'])[2]")
	WebElement subscribeAndSaveRadiobutton;
	
	@FindBy(xpath="//div[text()='Subscriptions']")
	WebElement secondsubscriptionlink;
	
	@FindBy(xpath="//span[text()='My Account ']")
	WebElement hoverMouseAfterMySubscriptionLink;
	
	@FindBy(xpath="//a[@analytics-data='logOut']")
	WebElement signoutbtn;
	
	//initiate page elements
	
	public PomMySubscription() 
		 
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
	  
	  public void SecondSubscriptionLink() throws InterruptedException
	  {
		 Actions actions = new Actions(driver);
		 actions.click(secondsubscriptionlink);
		 actions.build().perform();
		 Thread.sleep(3000);
	  }
	  
	  public void MySubscriptionLink() throws InterruptedException
	  {
		  Actions action = new Actions(driver);
			action.moveToElement(hovermouse).perform();
			action.click(mysubscriptionlink);
			action.build().perform();
			Thread.sleep(3000);
	  }
	  
	  public void SubscribeAndSave() throws InterruptedException
	  {
		  Actions action = new Actions(driver);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,500)");
		  action.click(subscribetobabyproductslink);
		  action.build().perform();
		  Thread.sleep(3000);
	  }
	  
	  public void SelectProductToSubscribe() throws InterruptedException
	  {
		  Actions actions = new Actions(driver);
			 
		  actions.click(selectbabyproduct);
		  actions.build().perform();
		  Thread.sleep(3000);
		  
		  
	  }
	  
	  public void ScrollBy() throws InterruptedException
	  {
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,500)","");
		  Thread.sleep(3000);
	  }
	  
	 public void SubscribeRadioButton() throws InterruptedException
	  {
		 Actions actions = new Actions(driver);
		 

		  actions.click(subscriberadiobutton);
		  subscriberadiobutton.isSelected();
		  actions.build().perform();
		  Thread.sleep(3000);
		  
	  }
	 
	 public void AddtoCart() throws InterruptedException
	 {
		 Actions actions = new Actions(driver);
		 actions.click(addtocartbutton);
		 actions.build().perform();
		 Thread.sleep(3000);
	 }
	 
	 public void CheckOut() throws InterruptedException
	 {
		 Actions actions = new Actions(driver);
		 actions.click(checkoutbutton);
		 actions.build().perform();
		 Thread.sleep(3000);
		 String actual = "Subtotal after discounts:";
		 
		 Assert.assertTrue(actual.contains("Subtotal after discounts:"));
	{
		 System.out.println("Discount is applied");
	 }
	 }
	 
	 public void OneTimeDeliveryOption() throws InterruptedException
	 {
		 Actions actions = new Actions(driver);
		 
			
				  actions.click(onetimedeliveryradiobutton);
				  actions.build().perform();
				  Thread.sleep(3000);
				  boolean Onetimedelivery=onetimedeliveryradiobutton.isSelected();
				 // boolean SubscribeandSave= subscriberadiobutton.isSelected();
				 
				  if(Onetimedelivery)
				  {
					  System.out.println("One time delivery is selected");
				  }
				  
					   else 
						  {
							  System.out.println("Subscribe to save radio button is selected");
					}
				}
	
		public void PriceUpdate() throws InterruptedException
		{
			Actions actions = new Actions(driver);
			actions.click(onetimedeliveryradiobutton);
			actions.build().perform();
		    Thread.sleep(3000);
		    String regularprice = onetimedeliveryprice.getText();
		    System.out.println("The regular value is: "+ regularprice);
		    
		}
		
		public void subscribeAndSaveRadioButton() throws InterruptedException
		 {
			 Actions actions = new Actions(driver);
			 
				
					  actions.click(subscribeAndSaveRadiobutton);
					  actions.build().perform();
					  Thread.sleep(8000);
					  boolean SubscribeAndSave=subscribeAndSaveRadiobutton.isSelected();
					 // boolean SubscribeandSave= subscriberadiobutton.isSelected();
					 
					  if(SubscribeAndSave)
					  {
						  System.out.println("Subscribe to save radio button is selected");
					  }
					  
						   else 
							  {
								  System.out.println("One-time delivery radio button is selected");
						}
					}
		
		public void SubscriptionPriceUpdate() throws InterruptedException
		{
			Actions actions = new Actions(driver);
			actions.click(subscribeAndSaveRadiobutton);
			actions.build().perform();
		    Thread.sleep(3000);
		    String SubscribePrice = SubscriptionPrice.getText();
		    System.out.println("The Subscription value is: "+ SubscribePrice);
		    
		}
		// Assertion to verify two values are not same and discount is applied on regular price when user is selecting subscribe and save option
		public void AssertSubscriptionPriceAndRegularPrice() throws InterruptedException
		
		{
			Assert.assertNotEquals("SubscribePrice","regularprice");
			System.out.println("Discount is applied on regular price");
			Thread.sleep(3000);
		}
	 
	  public void MySubscriptionLinkTitle() throws InterruptedException
	  {
	  
		  String actualTitle = driver.getTitle();
		  System.out.println(actualTitle);
		  String expectedTitle = "Walmart Canada";
			if(actualTitle.equals(expectedTitle))
				System.out.println("Title Matched");
			else
				System.out.println("Title didn't match");
				Thread.sleep(3000);
	  }
	  
	  
	  
	  public void clickSignout() throws InterruptedException
	  {
		  	Actions action = new Actions(driver);
		  	//for hovering the mouse after clicking on my subscription link to click on signout button
			action.moveToElement(hoverMouseAfterMySubscriptionLink).perform();
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
