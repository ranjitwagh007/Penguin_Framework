package openMRS_Page_Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Locator {
	WebDriver driver = null;

	public Login_Page_Locator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement userName;

	public WebElement getUserID() {
		return userName;
	}

	@FindBy(id = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//ul[@id='sessionLocation']/li")
	private List<WebElement> locationOptions;

	public List<WebElement> getLocationOptions() {
		return locationOptions;
	}

	@FindBy(id = "loginButton")
	private WebElement loginBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}
}
