
	
	package walmartbasepackage;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import utility_walmart.TimeUtils_Walmart;

	public class BaseWalmartclass {
		
		//browser info	WebDriver driver = new ChromeDriver();
		//url info
		//username and password
		
		public static Properties prop= new Properties();
		public static WebDriver driver;
		
		//Step 1
		
		public BaseWalmartclass()
		{
			try {
				FileInputStream file = new FileInputStream("C:\\Users\\chintan\\eclipse-workspace\\Walmart_Project\\src\\test\\java\\walmart_environment_variables\\Config.prop");
				prop.load(file);
			} 
			
			catch (FileNotFoundException e) {
		
				e.printStackTrace();
			} catch (IOException a) {
		
				a.printStackTrace();
			}
		}	
			//Step 2
			
			public static void initiation()
			{
				//if browser = chrome webdriver.chrome.driver
				//else if(browser=firefox)
				//{webdriver.gecko.driver
				
				String browsername=prop.getProperty("browser");
				
				if(browsername.equals("GoogleChrome"))
						{
					
					System.setProperty("webdriver.chrome.driver","chromedriver.exe");
							driver=new ChromeDriver();
						}
						
				else if(browsername.equals("Firefox"))
				{
					System.setProperty("webdriver.gecko.driver","C:\\\\Program Files\\\\Selenium Webdriver\\\\geckodriver.exe");
					driver= new FirefoxDriver();
				}
				
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(TimeUtils_Walmart.time_utility,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(TimeUtils_Walmart.implicitw, TimeUnit.SECONDS);
				
				driver.get(prop.getProperty("url"));
			//	driver.get(prop.getProperty("loginurl"));
				}
			
			
			public static void createAccount()
			{
				//if browser = chrome webdriver.chrome.driver
				//else if(browser=firefox)
				//{webdriver.gecko.driver
				
				String browsername=prop.getProperty("browser");
				
				if(browsername.equals("GoogleChrome"))
						{
					
					System.setProperty("webdriver.chrome.driver","chromedriver.exe");
							driver=new ChromeDriver();
						}
						
				else if(browsername.equals("Firefox"))
				{
					System.setProperty("webdriver.gecko.driver","C:\\\\Program Files\\\\Selenium Webdriver\\\\geckodriver.exe");
					driver= new FirefoxDriver();
				}
				
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(TimeUtils_Walmart.time_utility,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(TimeUtils_Walmart.implicitw, TimeUnit.SECONDS);
				
				driver.get(prop.getProperty("create_account_url"));
			//	driver.get(prop.getProperty("loginurl"));
				}
			
			
			public static void loginUrl()
			{
				//if browser = chrome webdriver.chrome.driver
				//else if(browser=firefox)
				//{webdriver.gecko.driver
				
				String browsername=prop.getProperty("browser");
				
				if(browsername.equals("GoogleChrome"))
						{
					
					System.setProperty("webdriver.chrome.driver","chromedriver.exe");
							driver=new ChromeDriver();
						}
						
				else if(browsername.equals("Firefox"))
				{
					System.setProperty("webdriver.gecko.driver","C:\\\\Program Files\\\\Selenium Webdriver\\\\geckodriver.exe");
					driver= new FirefoxDriver();
				}
				//maximize the window
				driver.manage().window().maximize();
				
				//Give pageloadtimeout
				driver.manage().timeouts().pageLoadTimeout(TimeUtils_Walmart.time_utility,TimeUnit.SECONDS);
				
				//Give implicit wait
				driver.manage().timeouts().implicitlyWait(TimeUtils_Walmart.implicitw, TimeUnit.SECONDS);
				
				//get url
				driver.get(prop.getProperty("loginurl"));
				}
	}
			
		




