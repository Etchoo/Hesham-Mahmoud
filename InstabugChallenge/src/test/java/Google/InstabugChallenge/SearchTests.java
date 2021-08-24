package Google.InstabugChallenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SearchTests extends AutomationMethods {
	
	@BeforeTest
	public static void initialization() throws Exception {
    	
    	System.setProperty("webdriver.chrome.driver",chromeDriverPath);
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get(baseURL);
    	Thread.sleep(1000);
    }
	
	
	
	@Test (priority = 0)
	public static void submitSearchWithPrediction() throws InterruptedException {
		elementVisibility(SEARCH_BTN_CLASSNAME);
		searchWithPrediction("Prediction test", 0);
	}
	
	@Test (priority = 1)
	public static void submitSearchWithEnter() throws InterruptedException {
		elementVisibility(SEARCH_BTN_CLASSNAME);
		searchWithEnter("Enter test");
	}
	
	@Test (priority = 2)
	public static void submitSearchWithButton() throws InterruptedException {
		elementVisibility(SEARCH_BTN_CLASSNAME);
		searchWithButton("search button test");
	}
	
	
	
	@AfterMethod
	public static void afterTests() throws InterruptedException {
		Thread.sleep(2000);
		driver.get(baseURL);
		Thread.sleep(1000);
	}
	
	@AfterTest
	public static void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	
}