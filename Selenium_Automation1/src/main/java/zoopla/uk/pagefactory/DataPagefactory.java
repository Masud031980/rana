package zoopla.uk.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zoopla.uk.baseclass.SuperClass;

public class DataPagefactory extends SuperClass{
	
 public	DataPagefactory(){
		PageFactory.initElements(driver, this);
	}
    @FindBy(id ="Email")
    @CacheLookup
    private WebElement enterusername;
    
	public WebElement getEnterusername() {
		enterusername.clear();
		return enterusername;
	}
	@FindBy(id ="Password")
    @CacheLookup
    private WebElement enterpassword;

	public WebElement getEnterpassword() {
		enterpassword.clear();
		return enterpassword;
	}
	@FindBy(xpath="//*[@value='Log in']")
    @CacheLookup
    private WebElement clicklogin;

	public WebElement getClicklogin() {
		return clicklogin;
	}
	@FindBy(linkText="Logout")
    @CacheLookup
    private WebElement clicklogout;

	public WebElement getClicklogout() {
		return clicklogout;
	}
}
