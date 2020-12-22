package zoopla.uk.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zoopla.uk.baseclass.SuperClass;

public class MasterPageFactory extends SuperClass  {
public MasterPageFactory() {
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")
    private WebElement acceptCookies;
public WebElement getAcceptCookies() {
	return acceptCookies;
}
   @FindBy(xpath="//a[@href='/signin/?page_after_login=%2F'][1]")
   private WebElement clickOnSigninButton; 
public WebElement getClickOnSigninButton() {
	return clickOnSigninButton;
}
   
}
