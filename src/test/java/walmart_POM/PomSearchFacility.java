package walmart_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import walmartbasepackage.BaseWalmartclass;

public class PomSearchFacility extends BaseWalmartclass
{
	@FindBy(xpath="//input[@data-automation='search-form-input']")
	WebElement searchwithkeyword;
	
	@FindBy(xpath="//*[@id=\"search_a\"]")
	WebElement clicksearchbutton;
	
	
	public PomSearchFacility()
	 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void SearchWithKeyword(String keyword) throws InterruptedException
	
		
		{
			searchwithkeyword.sendKeys(keyword);
			Actions action = new Actions(driver);
			action.click(clicksearchbutton);
			action.build().perform();
			Thread.sleep(3000);
		}
	
	public void CloseBrowser()
	{
		driver.close();
	}
	
	
	}

