package openMRS_Page_Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SysInfo_Page_Locator {

	WebDriver driver = null;

	public SysInfo_Page_Locator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()='System Information']")
	private WebElement heading;

	public WebElement getHeading() {
		return heading;
	}

	@FindBy(xpath = "//div[@class='panel-body']/h2")
	private List<WebElement> moduleHeadings;

	public List<WebElement> getModuleHeadings() {
		return moduleHeadings;
	}

	@FindBy(xpath = "//table[@class='layout display responsive-table']//tbody/tr/td[not(img)][2]")
	private List<WebElement> moduleValueOptions;

	public List<WebElement> getModuleValueOptions() {
		return moduleValueOptions;
	}

	@FindBy(xpath = "//table[@class='layout display responsive-table']//tbody/tr/td[not(img)][1]")
	private List<WebElement> moduleNameOptions;

	public List<WebElement> getModuleNameOptions() {
		return moduleNameOptions;
	}

}
