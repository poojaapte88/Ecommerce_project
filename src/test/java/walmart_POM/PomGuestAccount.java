package walmart_POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import walmartbasepackage.BaseWalmartclass;

public class PomGuestAccount extends BaseWalmartclass {
	
	@FindBy(xpath="(//a[contains(@class,'e8z2aj22 css-frpsc8')])[2]")
	WebElement patiolink;
	
	@FindBy(xpath="//div[@class='css-hqry55 eaue1ee2']//img")
	WebElement conversationsetslink;
	
	@FindBy(xpath="//p[@class='css-1p4va6y eudvd6x0']")
	WebElement patioset;
	
	@FindBy(xpath="//button[contains(@class,'e5qqw234 css-1gezpl6')]")
	WebElement increasequantitybutton;
	
	@FindBy(xpath="//button[@class='css-vfxkzw edzik9p0']")
	WebElement addtocartbutton;
	
	@FindBy(xpath="(//button[@class='css-vfxkzw edzik9p0'])[2]")
	WebElement checkoutbutton;
	
	@FindBy(xpath="//button[@class='css-vfxkzw edzik9p0']")
	WebElement proceedtocheckoutbutton;
	
	@FindBy(xpath="(//button[contains(@class,'e8oyuhv19 css-sytws')])[2]")
	WebElement checkoutasguest;
	
	@FindBy(xpath="(//span[@class='css-1xyby63 e1dm6fdn6'])[2]")
	WebElement shippingoption;
	
	public PomGuestAccount()
	 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnPatioLink() throws InterruptedException
	{
	Actions actions = new Actions(driver);
	actions.click(patiolink);
	actions.perform();
	
	}
	
	public void ScrollTo()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,500)","");
	}
	
	public void ClickOnConversationSets() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.click(conversationsetslink);
		action.build().perform();
		Thread.sleep(3000);
	}
	
	public void ScrollDown()
	{
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,1000)","");
	}
	public void ClickOnPatioSet() throws InterruptedException
	{
		Actions actions= new Actions(driver);
		actions.click(patioset);
		actions.build().perform();
		Thread.sleep(3000);
	}
	
	
	
	public void IncreaseProductQuantity() throws InterruptedException
	{
		Actions actions= new Actions(driver);
		actions.click(increasequantitybutton);
		actions.build().perform();
		Thread.sleep(3000);
	}
	
	public void AddToCartButton() throws InterruptedException
	{
		Actions actions= new Actions(driver);
		actions.click(addtocartbutton);
		actions.build().perform();
		Thread.sleep(3000);
	}
	
	public void Scroll()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,500)","");
	}
	
	public void CheckOutButton() throws InterruptedException
	{
		Actions actions= new Actions(driver);
		actions.click(checkoutbutton);
		actions.build().perform();
		Thread.sleep(3000);
	}
	
	public void ProceedToCheckOut() throws InterruptedException
	{
		Actions actions= new Actions(driver);
		actions.click(proceedtocheckoutbutton);
		actions.build().perform();
		Thread.sleep(3000);
	}
	
	public void CheckOutAsGuest() throws InterruptedException
	{
		Actions actions= new Actions(driver);
		actions.click(checkoutasguest);
		actions.build().perform();
		Thread.sleep(3000);
	
	}
	
	public void ShippingOption() throws InterruptedException
	{
		Actions actions= new Actions(driver);
		actions.click(shippingoption);
		actions.build().perform();
		Thread.sleep(3000);
	}
	public void CloseBrowser()
	{
		driver.close();
	}
}
