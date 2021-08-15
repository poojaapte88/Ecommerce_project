package walmart_testlayer;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import walmart_POM.PomShoppingCart;
import walmartbasepackage.BaseWalmartclass;

public class ShoppingCart_Test extends BaseWalmartclass{

private static final String keyword = "television";
//private static final String searchtext = "television stand";
	
PomShoppingCart Create;
	
	public ShoppingCart_Test() 

	{
		super();
	}
@BeforeMethod
	//initialize browser and driver
	public void initsetup()
	{ 
	
		initiation(); 
		Create= new PomShoppingCart();
	
	}	
@Test(priority=1)
public void VerifyProductAddToCartFunctionality() throws InterruptedException, AWTException
{
	//enter keyword to search
	Create.SearchText(keyword);	
	
	//handle robot button
	Create.RobotHandling();		
	
	//Scroll Down
	Create.ScrollDown();
	
	//Add item to cart
	Create.ProductAddedToCart();
	
	//Close the browser
	Create.CloseBrowser();	
	 
}

//User is able to increase the quantity of item from the cart and price gets updated to reflect the correct figure.

@Test(priority=2)

public void VerifyRemovalOfProduct() throws InterruptedException, AWTException
{
	//enter keyword to search
	Create.SearchText(keyword);	
	
	//handle robot button
	Create.RobotHandling();		
	
	//Scroll Down
	Create.ScrollDown();
	
	//Add item to cart
	Create.ProductAddedToCart();
	
	//Remove product from cart
	Create.ClickOnRemoveLink();
	
	//Close the browser
	Create.CloseBrowser();
	
	
	
	
}

@AfterMethod

public void CloseTheBrowser()
{
	driver.quit();
}
}
