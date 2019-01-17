package openMRS_Page_Actions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common_Functions.WebElementCommon;
import openMRS_Page_Locators.SysInfo_Page_Locator;

public class System_Info_Page_Action {
	WebDriver driver = null;
	SysInfo_Page_Locator sysInfoPA = null;

	public System_Info_Page_Action(WebDriver driver) {
		this.driver = driver;
		sysInfoPA = new SysInfo_Page_Locator(driver);

	}

	public String verifyHeader() {
		return sysInfoPA.getHeading().getText();
	}

	public boolean verifyOption(String moduleHeading, String moduleName, String moduleValue) {
		List<WebElement> moduleHeadings = sysInfoPA.getModuleHeadings();
		List<WebElement> moduleNames = sysInfoPA.getModuleNameOptions();
		List<WebElement> moduleValues = sysInfoPA.getModuleValueOptions();
		for (WebElement module : moduleHeadings) {
			if (WebElementCommon.webElementPresent(module)) {
				assertEquals(module.getText(), moduleHeading);
				for (WebElement names : moduleNames)
					if (WebElementCommon.webElementPresent(names)) {
						assertEquals(names.getText(), moduleName);
						for (WebElement values : moduleValues) {
							if (WebElementCommon.webElementPresent(values)) {
								assertEquals(values.getText(), moduleValue);

							}
						}

					}

			}

		}
		return true;
	}
}
