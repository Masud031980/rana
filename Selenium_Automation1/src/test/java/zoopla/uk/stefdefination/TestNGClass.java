package zoopla.uk.stefdefination;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass {
WebDriver driver;	
	
	@BeforeTest
	public void getsalary1() {
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 //driver =new ChromeDriver();
		//System.out.println("I am running before test");
		
		 }
	//@Test//1
	//public void getsalary2() {
		//driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
		
		//driver.findElement(By.xpath("//a[@href='/signin/?page_after_login=%2F'][1]")).click();
		
	//	System.out.println("I am 1st test cases ");
		
		// }
	@Test//2
	public void getsalary4() {
		System.out.println("I am 2nd test cases");
	}
	@AfterTest
	public void getsalary3() {
		System.out.println("I am running After");
		
		 }

  /*public static void main(String[] args) {
	TestNGClass obj =new TestNGClass ();
	obj.getsalary();
	}*/
}
