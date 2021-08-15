package walmart_testlayer;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import walmart_POM.PomProductSearch;
import walmartbasepackage.BaseWalmartclass;

public class ProductSearch_test extends BaseWalmartclass
{
private static final String keyword = "television";

PomProductSearch Create;
	
	public ProductSearch_test()
	{
		super();
	}
@BeforeMethod
	
	public void initsetup()
	{ 
		initiation(); 
		Create= new PomProductSearch();
	
	}	

@Test(priority=1)
public void Search() throws InterruptedException, AWTException
{
	//enter keyword to search
	Create.SearchWithKeyword(keyword);	
	
	//handle robot button
	Create.robotHandling();		
	
	//scroll down to the end of the page
	Create.ScrollDown();	
	
	//Count add to cart buttons to count the number of items on a page
	Create.CountAddToCart();
	
	//Compare if the expected and actual number of products on the page matches
	Create.expectedProductsOnPage();
	
	//Close the browser
	Create.CloseBrowser();
	
	
}
	

@Test(priority=2)

//To check there is no product repeated on another page
public void CheckForDuplicateElements() throws InterruptedException, AWTException
{
	//Enter keyword in search box and search
	Create.SearchWithKeyword(keyword);
	
	//Click on Press & Hold button to avoid failure in test case due to robot verification
	Create.robotHandling();
	// Scroll the page to load all the searched products on the search page
	Create.ScrollDown();
	
	// Count the number of searched product on a page
	Create.CountNumberOfElements();
	
	// Scroll up the page to certain point to find the next page
	Create.ScrollUp();
	//Create.ClickOnNextButton();
	//Pooja's
	//Create.CheckForDuplicateProduct();
	
	// Compare two list of products from two different pages with same search and verify no product is repeating
	Create.CheckForDuplicateProducts();
	
}

@Test(priority=3)
public void FilterItemsByCategory() throws InterruptedException, AWTException
{
	//Enter keyword in search box and search
	Create.SearchWithKeyword(keyword);
	
	//Click on Press & Hold button to avoid failure in test case due to robot verification
	Create.robotHandling();
	
	//Create.ScrollDown();
	//Create.CountNumberOfElements();
	//Create.ScrollUp();
	//Scroll down to half way to find the web element
	Create.ScrollDownHalfway();
	
	// Click on filter by category from left panel
	Create.FilterByCategory();
	
	// Click on check box
	Create.SelectCheckBox();
	
}

@Test(priority=4)

public void SortItemsByParameter() throws InterruptedException, AWTException
{
	//Enter keyword in search box and search
	Create.SearchWithKeyword(keyword);
	
	//Click on Press & Hold button to avoid failure in test case due to robot verification
	Create.robotHandling();
	
	//Scroll to a particular element
	Create.ScrollIntoView();
	
	//Click on sort by
	Create.SortBy();
	
	//Sort items by price-Low to High
	Create.SortByPrice();
}

@Test(priority=5)

public void FilteringAndSorting() throws InterruptedException, AWTException
{
	//Enter keyword in search box and search
	Create.SearchWithKeyword(keyword);
	
	//Click on Press & Hold button to avoid failure in test case due to robot verification
	Create.robotHandling();
	
	//Scroll down half way
	Create.ScrollDownHalfway();
	
	//Click on a category to filter items based on that category
	Create.FilterByCategory();
	
	//Click on checkbox to select a brand
	Create.SelectCheckBox();
	
	//Click on sort by
	Create.SortBy();
	
	//Sort items by price-Low to High
	Create.SortByPrice();
	
	//Scroll down till the bottom of the page
	Create.ScrollDown();
	
	//Verify using assertion if sorting happens correctly
	Create.VerifySorting();
	
	
}

@Test(priority=6)

public void CountNumberOfItemsOnAPage() throws InterruptedException, AWTException
{
	//Enter keyword in search box and search
	Create.SearchWithKeyword(keyword);
	
	//Click on Press & Hold button to avoid failure in test case due to robot verification
	Create.robotHandling();
	
	//Scroll down half way
	Create.ScrollDownHalfway();
	
	//Click on a category to filter items based on that category
	Create.FilterByCategory();
	
	//Click on checkbox to select a brand
	Create.SelectCheckBox();
	
	//Click on sort by
	Create.SortBy();
	
	//Sort items by price-Low to High
	Create.SortByPrice();
	
	//Scroll down till the bottom of the page
	Create.ScrollDown();
	
	//Verify using assertion if sorting happens correctly
	Create.VerifySorting();
	
	//Verify expected products on page matches the actual products on the page
	Create.expectedProductsOnPage();
	
	//Close the browser
	Create.CloseBrowser();


	
}

@AfterMethod
public void CloseTheBrowser()
{
	driver.close();
}
}
