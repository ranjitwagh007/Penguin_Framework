package openMRS_Page_Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_Locator {

	WebDriver driver = null;

	public Home_Page_Locator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='apps']/a")
	private List<WebElement> homeOptions;

	public List<WebElement> getHomeOptions() {
		return homeOptions;
	}

}
