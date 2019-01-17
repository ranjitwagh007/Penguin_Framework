package openMRS_Page_Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SysAdmin_Page_Locator {

	WebDriver driver = null;

	public SysAdmin_Page_Locator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='tasks']/a")
	private List<WebElement> sysAdminOptions;

	public List<WebElement> getSysAdminOptions() {
		return sysAdminOptions;
	}

}
