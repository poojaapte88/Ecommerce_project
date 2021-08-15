package walmart_POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility_walmart.TimeUtils_Walmart;
import walmartbasepackage.BaseWalmartclass;

public class PomShoppingCart extends BaseWalmartclass {
	
	@FindBy(xpath="//input[@data-automation='search-form-input']")
	WebElement searchwithkeyword;
	
	@FindBy(xpath="//*[@id=\"search_a\"]")
	WebElement clicksearchbutton;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement addtocartbutton;
	
	@FindBy(xpath="//button[@data-automation='checkout']")
	WebElement checkoutbutton;
	
	@FindBy(xpath="//div[@role='img']")
	WebElement verifyproduct;
	
	@FindBy(xpath="//*[@id=\"product-results\"]/div[1]/div/a/div/div[2]/div[2]/span/div/p")
	WebElement productSearch;
	
	@FindBy(xpath="//button[contains(@class,'e5qqw234 css-1gezpl6')]")
	WebElement increaseqty;
	
	@FindBy(xpath="//span[text()='Remove']")
	WebElement removelink;
	
	@FindBy(xpath="(//div[@data-automation='money-box-estimated-total']//div)[3]")
	WebElement estimatedtotal;
	
	@FindBy(xpath="(//div[contains(@class,'eeazboz0 css-1p2xd9r')])[2]")
	WebElement updatedprice;
	
	public PomShoppingCart()
	{
		PageFactory.initElements(driver,this);
	}
	
public void SearchText(String keyword) throws InterruptedException
	
	
	{
		searchwithkeyword.sendKeys(keyword);
		Actions action = new Actions(driver);
		action.click(clicksearchbutton);
		action.build().perform();
		Thread.sleep(5000);
	}
	
public void RobotHandling() throws AWTException
{
String ActualUrl = driver.getCurrentUrl();
String expectedUrl = "https://www.walmart.ca/search?q=television&c=10003";
try {
	Assert.assertEquals(ActualUrl,expectedUrl );
	} 
catch (AssertionError e)
{
	Robot robot = new Robot();
	robot.mouseMove(165,360);
	robot.delay(2000);
	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	robot.delay(5000);
	robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	robot.delay(2000);
	System.out.println("Robot handling test executed!");
}
}

public void ScrollDown()
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,500)","");
}

public void ProductAddedToCart() throws InterruptedException
{
	
	String productSearched = driver.findElement(By.xpath("//*[@id=\"product-results\"]/div[1]/div/a/div/div[2]/div[2]/span/div/p")).getText();
	System.out.println("Product added from search page to cart is:" + productSearch.getText());
	Actions action = new Actions(driver);
	action.click(addtocartbutton);
	action.build().perform();
	Thread.sleep(3000);
	
	action.click(checkoutbutton);
	action.build().perform();
	Thread.sleep(3000);
	
	String productOnCart= driver.findElement(By.xpath("//a[contains(@class,'ennws581 css-frpsc8')]")).getText();
	System.out.println("Product added to cart is:" + productOnCart);
    
	Assert.assertEquals(productOnCart, productSearched);
	
	if(productOnCart.equals(productSearched)) {
		System.out.println("Product got added to cart from search page is same");
	}
	
	  else {
	  System.out.println("Product got added to cart from search page is NOT same");
	  }
	 
	}



public void ClickOnCheckOutButton() throws InterruptedException
{
	Actions action = new Actions(driver);
	action.click(checkoutbutton);
	action.build().perform();
	Thread.sleep(3000);
	
}


public void ScrollDownTo()
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,500)","");
}



public void VerifyAssertion()
{

	String productOnCart= driver.findElement(By.xpath("//a[contains(@class,'ennws581 css-frpsc8')]")).getText();
	System.out.println("Product added to cart is:" + productOnCart);
    String productSearched = "Sanyo 32\" Class 2K (720P) Roku Smart LED TV (FW32R19F)";
   
	Assert.assertEquals(productOnCart, productSearched);
	
	if(productOnCart == productSearched) {
		System.out.println("Product got added to cart from search page is same");
	}
	else {
		System.out.println("Product got added to cart from search page is NOT same");
	}
	}

public void CloseBrowser()
{
	driver.close();
}


//Methods to show product quantity can be increased from the cart and the price updates

public void ClickOnRemoveLink() throws InterruptedException
{
	String regularprice = estimatedtotal.getText();
    System.out.println("The regular value is: "+ regularprice);
	Actions action = new Actions(driver);
	action.click(removelink);
	action.build().perform();
	Thread.sleep(3000);
	//driver.manage().timeouts().implicitlyWait(TimeUtils_Walmart.implicitw, TimeUnit.SECONDS);
	String finalprice= updatedprice.getText();
    System.out.println(finalprice);
    Assert.assertNotEquals(regularprice, finalprice);
    
    if(!regularprice.equals(finalprice)) {
    	System.out.println("Price got updated after removing product from the cart");
    }
    else {
    	System.out.println("Product didn't remove successfully from the cart.");
    }
    
	
	
	
}


}	
	
	





