package zoopla.uk.stefdefination;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.classfile.Utility;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.utility;
import zoopla.uk.baseclass.SuperClass;
import zoopla.uk.pagefactory.DataPagefactory;

public class OutlineStepDefination extends SuperClass {
	 DataPagefactory df;
	 

	@Given("^as auser i can open any  browser$")
	public void as_auser_i_can_open_any_browser() throws Throwable   {
		
		logger.info("***********> as a user i can open any  browser >**********");
	 SuperClass.initalization();
	 df=PageFactory.initElements(driver, DataPagefactory.class); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// Selenium.speed(5000);//All the element
	}

	@Given("^As a user i can enter the \"([^\"]*)\" and go to the login page$")
	public void as_a_user_i_can_enter_the_and_go_to_the_login_page(String url) throws Throwable  {
		logger.info("***********> As a user i can enter the url >**********");
	 driver.get(url);
	 System.out.println("i am wait for 5 second");
	Thread.sleep(5000); // unconditional synchronization
	 //This is only one element or object
	 
	    }

	@When("^As a user i can enter as \"([^\"]*)\" and pasword \"([^\"]*)\"$")
	public void as_a_user_i_can_enter_as_and_pasword(String username, String pwd)  {
		logger.info("***********> As a user i can enter user and password >**********");
		
		utility.waitForElement(df.getEnterusername());
		df.getEnterusername().sendKeys(username);
	logger.info("***********> As a user i can enter user and password >**********");
	df.getEnterpassword().sendKeys(pwd);
	    
	}

	@When("^Click on login$")
	public void click_on_login()  {
		logger.info("***********> As a user i can Click on login button >**********");
		
		utility.waitForElement(df.getClicklogin());
		df.getClicklogin().click();
	    }

	@When("^Homepage should be \"([^\"]*)\"$")
	public void homepage_should_be(String homeTitle)  {
		logger.info("***********> As a user i can verify the Home page >**********");
	 if(driver.getPageSource().contains("Login was unsuccessful")) {
		 System.out.println("My test is failed");
		 driver.quit();
	 }
	 else {
		 Assert.assertEquals("Dashboard /nopCommerce administration", homeTitle);
		 System.out.println("Homepage validation is pass");
	 }
	}

	@When("^As a user i can click on logout link$")
	public void as_a_user_i_can_click_on_logout_link()  {
		logger.info("***********> As a user i can click on logout >**********");
	 utility.waitForElement(df.getClicklogout());
	 df.getClicklogout().click();
	    
	}

	@Then("^login page title should be \"([^\"]*)\"$")
	public void login_page_title_should_be(String loginTitle)  {
		logger.info("***********> As a user i can see page Title >**********");
		 if(driver.getPageSource().contains("Login was unsuccessful")) {
			 System.out.println("My test is failed");
			 driver.quit();
		 }
		 else {
			 Assert.assertEquals("Your store login", loginTitle);
			 System.out.println("Login Page is pass");
		 }
	    
	}
}
