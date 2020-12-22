package zoopla.uk.my.runner;

import org.openqa.selenium.WebDriver;

public class TestDataProvider {
	
	WebDriver driver;
	//@DataProvider (name="usernameAndPassword")
	public static Object[][] userData(){
		return new Object[][] {{"",""}};
		
	}

}
