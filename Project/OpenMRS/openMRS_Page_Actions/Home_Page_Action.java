package openMRS_Page_Actions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common_Functions.WebButton;
import common_Functions.WebElementCommon;
import openMRS_Page_Locators.Home_Page_Locator;

public class Home_Page_Action {
	WebDriver driver = null;
	Home_Page_Locator homePL = null;

	public Home_Page_Action(WebDriver driver) {
		this.driver = driver;
		homePL = new Home_Page_Locator(driver);
	}

	public String verifyTitle() {
		return driver.getTitle();
	}

	public System_Administration_Page_Action selectHomeOption(String optionName) {
		System_Administration_Page_Action systemPA = null;
		List<WebElement> options = homePL.getHomeOptions();
		for (WebElement options1 : options) {
			if (WebElementCommon.webElementPresent(options1) && WebElementCommon.webElementClickble(options1)) {
				if (options1.getText().equals(optionName)) {
					WebButton.clickBtn(options1);
					systemPA = new System_Administration_Page_Action(driver);
				}

			}
		}

		return systemPA;
	}
}
