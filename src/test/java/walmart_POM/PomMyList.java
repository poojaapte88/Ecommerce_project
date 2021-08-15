package walmart_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import walmartbasepackage.BaseWalmartclass;

public class PomMyList extends BaseWalmartclass
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
	
	@FindBy(xpath="//div[text()='Lists']")
	WebElement listlink;
	
	@FindBy(xpath="(//input[@type='search'])[2]")
	WebElement searchbox;
	
	@FindBy(xpath="(//button[@class='button-submit button-companion-right'])[1]")
	WebElement clicksearchbutton;
	
	@FindBy(xpath="//span[text()='My Account ']")
	WebElement hovermouseaftermylist;
	
	@FindBy(xpath="(//a[@id='header-sign-out'])[1]")
	WebElement clickonsignoutaftersearch;
	

	
	
	
	public PomMyList() 
	 
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
	  
	  public void ScrollDown()
	  {
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,500)","");
	  }
	  
	
	  public void MyList() throws InterruptedException
	  {
		  Actions actions = new Actions(driver);
		  actions.click(listlink);
		  actions.build().perform();
		  Thread.sleep(3000);
	  }
	  
	  public void Searchbox(String entertextinsearchbox) throws InterruptedException
	  {
		  Actions actions= new Actions(driver);
		  actions.click(searchbox);
		  actions.build().perform();
		  searchbox.sendKeys(entertextinsearchbox);
		  Thread.sleep(3000);
		  
	  }
	  
	  public void ClickSearchButton() throws InterruptedException
	  {
		  Actions actions = new Actions(driver);
		  actions.click(clicksearchbutton);
		  actions.build().perform();
		  Thread.sleep(3000);
		  
		  try {
			  WebDriverWait wait = new WebDriverWait(driver,10);
			  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Search")));
			  try {
			  driver.findElement(By.id("Search")).click();
			  } catch (WebDriverException e) {
			  System.out.println("An exceptional case.");
			  }
			  } catch (TimeoutException e) {
			  System.out.println("WebDriver couldn’t locate the element");
			  }
	  }
		  
		  public void clickSignout()
		  {
			  	Actions action = new Actions(driver);
			  	//for hovering the mouse after clicking on my subscription link to click on signout button
				action.moveToElement(hovermouseaftermylist).perform();
				action.click(clickonsignoutaftersearch);
				action.build().perform();
		  }
		  
		    
	  }
	  

