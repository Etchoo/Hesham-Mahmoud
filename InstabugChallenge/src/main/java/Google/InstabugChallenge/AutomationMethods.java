package Google.InstabugChallenge;


import org.openqa.selenium.Keys;


public class AutomationMethods extends Methods {
	
	public static void searchWithPrediction(String text, int index) throws InterruptedException {
		
		fillIn(SEARCH_TEXT_FIELD_CLASSNAME,text);
		Thread.sleep(1000);
		assertContainsText(SEARCH_PREDICTION_CLASSNAME, index, text);
		clickOneIndex(SEARCH_PREDICTION_CLASSNAME, index);
	}
	
	public static void searchWithEnter(String text) throws InterruptedException {
		fillIn(SEARCH_TEXT_FIELD_CLASSNAME, text);
		Thread.sleep(1000);
		pressKey(SEARCH_TEXT_FIELD_CLASSNAME, Keys.ENTER);
	}

	public static void searchWithButton(String text) throws InterruptedException {
		fillIn(SEARCH_TEXT_FIELD_CLASSNAME, text);
		Thread.sleep(1000);
		click(SEARCH_BTN_CLASSNAME);
	}
	
	public static void elementVisibility(String className) {
		find(className);
	}
	

	
	
}
