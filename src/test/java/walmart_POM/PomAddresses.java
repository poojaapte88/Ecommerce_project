package walmart_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import walmartbasepackage.BaseWalmartclass;

public class PomAddresses extends BaseWalmartclass
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
	
	@FindBy(xpath="(//div[@class='css-1sll2pi e12pf3y42'])[3]")
	WebElement addresses;
	
	@FindBy(xpath="//button[contains(@class,'e1xsuuhf8 css-bmgcvp')]")
	WebElement addressbutton;
	
	@FindBy(xpath="(//input[@class='css-1lo2pik eesbt950'])[3]")
	WebElement addaddresstext;
	
	
	@FindBy(xpath="//span[text()='Brampton, ON, L6V - 42 Addresses']")
	WebElement selectenteredaddressfromoptions;
	
	
	@FindBy(xpath="//input[@data-automation='city']") 
	WebElement entercity;
	
	@FindBy(xpath="//input[@class='css-yi67yg eesbt950']")
	WebElement postalcode;
	
	@FindBy(xpath="//input[@data-automation='phone-number']")
	WebElement phonenumber;
	
	@FindBy(xpath="//button[@class='css-vfxkzw edzik9p0']")
	WebElement savebutton;
	
	@FindBy(xpath="//span[@data-automation='my-account-link']")
	WebElement hovermouseaftersavingaddress;
	
	@FindBy(xpath="//button[contains(@class,'e1iabzgi4 css-s8l8d')]")
	WebElement saveaddress;
	
	@FindBy(xpath="//a[@href='/ws/secure/en/sign-out']")
	WebElement signoutbtn;
	 
	
	
	public PomAddresses() 
	 
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
	  
	  public void MyAccountpage()
		{
			//this.driver=driver;
			//PageFactory.initElements(driver,this);
			Actions action = new Actions(driver);
			action.moveToElement(hovermouse).perform();
			action.click(myaccountlink);
			action.build().perform();
			
		}
	  
	  public void AddressLink() throws InterruptedException
	  {
		  	Actions action = new Actions(driver);
			action.click(addresses);
			action.build().perform();
			Thread.sleep(3000);
	  }
	  
	  public void AddressButton() throws InterruptedException
	  {
		  	Actions action = new Actions(driver);
			action.click(addressbutton);
			action.build().perform();
			Thread.sleep(3000);
	  }
	  
	public void AddAddressText(String addaddress,String city)throws InterruptedException
	{
		addaddresstext.sendKeys(addaddress);
		entercity.sendKeys(city);
		
	    Thread.sleep(3000);
	}
	
	public void ScrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,500)","");
	}
	
	
	public void ProvinceDropDown() throws InterruptedException
	{
		
		
		Select dropdown= new Select(driver.findElement(By.xpath("//label[text()='Province/Territory']/following-sibling::select")));
		dropdown.selectByVisibleText("Ontario");
		Thread.sleep(3000);
	}
	
	public void EnterPostalCode(String postal) throws InterruptedException
	{
		postalcode.sendKeys(postal);
		Thread.sleep(3000);
		
	}
	
	public void EnterPhoneNumber(String phone) throws InterruptedException
	{
		phonenumber.sendKeys(phone);
		Thread.sleep(3000);
	}
	
	public void ClickOnSaveButton() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.click(savebutton);
		action.build().perform();
		Thread.sleep(3000);
	}
	
	public void ClickOnSaveAddressButton() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.click(saveaddress);
		action.build().perform();
		Thread.sleep(3000);
	}
	
	public void ScrollUp()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,-500)","");
	}
	
	
	public void clickSignout() throws InterruptedException
	  {
		  	Actions action = new Actions(driver);
		  	//for hovering the mouse after clicking on my subscription link to click on signout button
			action.moveToElement(hovermouseaftersavingaddress).perform();
			action.click(signoutbtn);
			action.build().perform();
			Thread.sleep(3000);
	  }
	
	public void VerifyTitleAfterSignOut()
	{
		String actualTitle = driver.getTitle();
		  System.out.println(actualTitle);
		  String expectedTitle = "Walmart Canada";
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

