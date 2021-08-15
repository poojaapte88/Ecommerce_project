package walmart_POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import walmartbasepackage.BaseWalmartclass;

public class PomProductSearch extends BaseWalmartclass
{
	

	@FindBy(xpath="//input[@data-automation='search-form-input']")
	WebElement searchwithkeyword;
	
	@FindBy(xpath="//*[@id=\"search_a\"]")
	WebElement clicksearchbutton;
	
	@FindBy(xpath = "//button[@data-automation='cta-button']")
	String addtocart;
	
	@FindBy(xpath="//a[@class='css-1syn49 elkyjhv0']")
	WebElement nextbutton;
	
	@FindBy(xpath="(//div[@class='css-1ik4laa eupzuf59'])[3]")
	WebElement filterbycategory;
	
	@FindBy(xpath="//label[@for='51086347']")
	WebElement checkbox;
	
	@FindBy(xpath="//div[@data-automation='sort-by-dropdown-text']")
	WebElement sorting;
	
	@FindBy(xpath="//span[text()='Price: Low to High']")
	WebElement sortlowtohighprice;
	
	@FindBy(xpath = "//span[@data-automation='current-price']")
	WebElement prices;

	
	
	public PomProductSearch() {
		PageFactory.initElements(driver,this);
	}
	
	public void SearchWithKeyword(String keyword) throws InterruptedException
	
	
	{
		searchwithkeyword.sendKeys(keyword);
		Actions action = new Actions(driver);
		action.click(clicksearchbutton);
		action.build().perform();
		Thread.sleep(5000);
	}
	 
	public void ScrollDown() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 try {
		    long lastHeight = (long) ((JavascriptExecutor) js).executeScript("return document.body.scrollHeight");

		    while (true) {
		        ((JavascriptExecutor) js).executeScript("window.scrollTo(0, document.body.scrollHeight);");
		        Thread.sleep(5000);

		        long newHeight = (long) ((JavascriptExecutor) js).executeScript("return document.body.scrollHeight");
		        if (newHeight == lastHeight) {
		            break;
		        }
		        lastHeight = newHeight;
		    }
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	}
	
public void CountAddToCart() throws InterruptedException
	
	
	{
		int iCount = 0;
		iCount = driver.findElements(By.xpath("//button[@data-automation='cta-button']")).size();
		System.out.println(" Actual number of products on page are: " +  iCount);
		Thread.sleep(3000);
	}

public void expectedProductsOnPage()
{
	int expectedProductCount = 60;
	int iCount = 0;
	iCount = driver.findElements(By.xpath("//button[@data-automation='cta-button']")).size();
	
	
	if (iCount == expectedProductCount) {
	
	System.out.println("Total number of products displayed on a page are as expected count: " + expectedProductCount);
	}
	else {
		System.out.println("Actual number of products on page are not equal to expected number of products that is: " +  expectedProductCount);
		Assert.assertEquals("iCount","expectedProductCount");
		System.out.println("Assertion failed!");
		
			}
}

public void robotHandling() throws AWTException
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

public void CountNumberOfElements() throws InterruptedException
{
	 List<WebElement> allElements = driver.findElements(By.xpath("//*"));      //Identify all the elements on web page
     
     int elementsCount = allElements.size();     //Count the total all element on web page
     
     System.out.println("Total Number of All Element on webpage = "  + elementsCount); //Print the total count of all element on webpage4
     Thread.sleep(3000);
    
     
     
     
}


 public void ScrollUp()
 {
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,-700)","");
 }
 

public void ClickOnNextButton() throws InterruptedException
{
	Actions action = new Actions(driver);
	action.click(nextbutton);
	action.build().perform();
	Thread.sleep(3000);
}

public void CheckForDuplicateProduct() throws InterruptedException
{
	
	
	List<WebElement> elements = driver.findElements(By.xpath("//p[text()='Sanyo 32\" Class 2K (720P) Roku Smart LED TV (FW32R19F)']"));
	Map<String, Integer> textCounts = new HashMap<>();

	for (WebElement element : elements) {

	    String text = element.getText();
	        if (textCounts.containsKey(text)) {

	            textCounts.put(text, textCounts.get(text) + 1);
	        } else {

	        textCounts.put(text, 1);
	    }
	}
	
	for (Map.Entry<String, Integer> entry : textCounts.entrySet()) {
	    System.out.println(entry.getKey()+" : "+entry.getValue());
	}
}
public void CheckForDuplicateProducts() throws InterruptedException
{
	
	List<WebElement> allProducts = driver.findElements(By.xpath("//p[@data-automation='name']"));//

for(WebElement product1 : allProducts) {
	
	System.out.println(product1.getText());
	System.out.println("-------------------------");
	

}
Actions action = new Actions(driver);
action.click(nextbutton);
action.build().perform();
Thread.sleep(3000);

ScrollDown();


List<WebElement> allProductsP2 = driver.findElements(By.xpath("//p[@data-automation='name']"));

for(WebElement product2 : allProductsP2) {
	
	System.out.println(product2.getText());
	System.out.println("***********************");
}
System.out.println("Compare if product/s is/are duplicate: " + allProductsP2.containsAll(allProducts));

}

public void ScrollDownHalfway()
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", filterbycategory);
	
}

public void ScrollIntoView()
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", sorting);
}

public void SortBy() throws InterruptedException
{
	Actions action = new Actions(driver);
	action.click(sorting);
	action.build().perform();
	Thread.sleep(2000);
}
public void SortByPrice() throws InterruptedException
{
	Actions action = new Actions(driver);
	action.click(sortlowtohighprice);
	action.build().perform();
	Thread.sleep(3000);
}

public void VerifySorting()
{

	ArrayList<String> obtainedList = new ArrayList<>();
	// scrape price elements
	List<WebElement> price = driver.findElements(By.xpath("//span[@data-automation='current-price']"));
		
		  for (WebElement sortedprices : price)
		  {
			  obtainedList.add(sortedprices.getText());
		  
		 System.out.println(sortedprices.getText());
		 System.out.println("-------------------------------------------");
		  }
		  ArrayList<String> sortedList = new ArrayList<>();   
		  for(String s:obtainedList){
		  sortedList.add(s);
		  }
		  
		  Collections.sort(sortedList);
		  Assert.assertTrue(sortedList.equals(obtainedList));
		  System.out.println("Products are sorted from low to high");
}
		 

public void robotHandling_of_otherpage() throws AWTException
{
String ActualUrl = driver.getCurrentUrl();
String expectedUrl = "https://www.walmart.ca/search?q=television&c=10003";
try {
	Assert.assertEquals(ActualUrl,expectedUrl );
	} 
catch (AssertionError f)
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


public void FilterByCategory() throws InterruptedException
{
	Actions action = new Actions(driver);
	action.click(filterbycategory);
	action.build().perform();
	Thread.sleep(3000);
}

public void SelectCheckBox() throws InterruptedException
{
	// This will Toggle the Check box 
	checkbox.click();
	
	// Check whether the Check box is toggled on 		
    if (checkbox.isSelected()) {					
        System.out.println("Checkbox is Toggled On");					

    }
    else {			
        System.out.println("Checkbox is Toggled Off");					
    }		
    
    Thread.sleep(3000);
    
}



public void CloseBrowser()
{
	driver.close();
}

}

	

