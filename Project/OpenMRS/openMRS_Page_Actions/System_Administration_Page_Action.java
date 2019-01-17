package openMRS_Page_Actions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common_Functions.WebButton;
import common_Functions.WebElementCommon;
import openMRS_Page_Locators.SysAdmin_Page_Locator;

public class System_Administration_Page_Action {

	WebDriver driver = null;
	SysAdmin_Page_Locator sysAdminPA = null;

	public System_Administration_Page_Action(WebDriver driver) {
		this.driver = driver;
		sysAdminPA = new SysAdmin_Page_Locator(driver);
	}

	public System_Info_Page_Action selectAdminOption(String optionName) {
		System_Info_Page_Action systemInfoPA = null;
		List<WebElement> options = sysAdminPA.getSysAdminOptions();
		for (WebElement options1 : options) {
			if (WebElementCommon.webElementPresent(options1) && WebElementCommon.webElementClickble(options1)) {
				if (options1.getText().equals(optionName)) {
					WebButton.clickBtn(options1);
					systemInfoPA = new System_Info_Page_Action(driver);
				}
			}

		}
		return systemInfoPA;
	}

}
