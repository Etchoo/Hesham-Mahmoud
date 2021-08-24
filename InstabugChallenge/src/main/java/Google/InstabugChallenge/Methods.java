package Google.InstabugChallenge;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Random;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Methods {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static final String baseURL = "https://www.google.com/";
	public static final String chromeDriverPath = "C:\\Users\\pc\\Desktop\\chromedriver_win32\\chromedriver.exe";
	public static final String SEARCH_TEXT_FIELD_CLASSNAME = "gLFyf";
	public static final String SEARCH_PREDICTION_CLASSNAME = "sbct";
	public static final String SEARCH_BTN_CLASSNAME = "gNO89b";
	
	
	public static WebElement find(String className) {
		return driver.findElement(By.className(className));
	}
	
	public static void click(String className) {
		find(className).click();
		return;
	}
	
	public static void fillIn(String className, String text) {
		find(className).sendKeys(text);
		return;
	}
	
	public static void pressKey(String className, Keys key) {
		find(className).sendKeys(key);
		return;
	}
	
	public static List<WebElement> listing(String className) {	
//		System.out.println("Trying to retrieve the List");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(BASE_VIEW_ID + id)));
		List<WebElement> parent = driver.findElements(By.className(className));
//		System.out.println("List retrieved...");
//		System.out.println(parent.size());
		return parent;
	}
	
	public static void clickOneIndex(String className, int index) {
		List<WebElement> elements = listing(className);
		clickIndex(elements, index);
	}
	
	public static void clickIndex(List<WebElement> p, int index) {
		p.get(index).click();
		return;
	}
	
	public static void assertElementVisibility(String className) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(className))).isDisplayed();
	}
	
	public static boolean assertElementBool(String className) {

		boolean elementVisibility = false;
		if(driver.findElements(By.className(className)).size() > 0 ) {
			elementVisibility = true;
		}
		return elementVisibility;
	}
	
	public static void assertContainsText(String className, int index, String text) {
		boolean contains = listing(className).get(0).getText().contains(text.toLowerCase());
		Assert.assertTrue(contains);
	}
	
	public static int randomNumberGenerator(int range) {
		Random randomGenerator = new Random();
		return randomGenerator.nextInt(range);
	}
	
}
