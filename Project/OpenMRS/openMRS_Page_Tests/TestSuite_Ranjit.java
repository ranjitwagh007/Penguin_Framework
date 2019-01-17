package openMRS_Page_Tests;

import org.testng.annotations.Test;

import OpenMRS.PropertyReader;
import base_Architecture.BaseClass;
import openMRS_Page_Actions.Home_Page_Action;
import openMRS_Page_Actions.Login_Page_Action;
import openMRS_Page_Actions.System_Administration_Page_Action;
import openMRS_Page_Actions.System_Info_Page_Action;

public class TestSuite_Ranjit extends BaseClass {
	@Test(description = "Validating OpenMRS Information,name & value")
	public void MarsTC1() throws InterruptedException {
		
		Login_Page_Action loginPA = new Login_Page_Action(driver);
		Home_Page_Action homePA = loginPA.succesfulLogin(PropertyReader.getValue("ui.application.username"),
				PropertyReader.getValue("ui.application.password"));
		System_Administration_Page_Action systemPA = homePA
				.selectHomeOption(PropertyReader.getValue("home.option.systemAdministration"));
		System_Info_Page_Action sysInfoPA = systemPA
				.selectAdminOption(PropertyReader.getValue("system.option.systemInformation"));
		sysInfoPA = new System_Info_Page_Action(driver);
		sysInfoPA.verifyOption(PropertyReader.getValue("systemInfo.heading.OpenMRS"),
				PropertyReader.getValue("OpenMRS.option.name"), PropertyReader.getValue("OpenMRS.option.value"));

	}

	@Test(description = "Validating Operating System Information,name & value")
	public void MarsTC2() throws InterruptedException {

		Login_Page_Action loginPA = new Login_Page_Action(driver);
		Home_Page_Action homePA = loginPA.succesfulLogin(PropertyReader.getValue("ui.application.username"),
				PropertyReader.getValue("ui.application.password"));
		System_Administration_Page_Action systemPA = homePA
				.selectHomeOption(PropertyReader.getValue("home.option.systemAdministration"));
		System_Info_Page_Action sysInfoPA = systemPA.selectAdminOption("system.option.systemInformation");
		sysInfoPA = new System_Info_Page_Action(driver);
		sysInfoPA.verifyOption(PropertyReader.getValue("systemInfo.heading.OperatingSystem"),
				PropertyReader.getValue("OperatingSystem.option.name"),
				PropertyReader.getValue("OperatingSystem.option.value"));

	}

	@Test(description = "Validating Java Runtime Information,name & value")
	public void MarsTC3() throws InterruptedException {

		Login_Page_Action loginPA = new Login_Page_Action(driver);
		Home_Page_Action homePA = loginPA.succesfulLogin(PropertyReader.getValue("ui.application.username"),
				PropertyReader.getValue("ui.application.password"));
		System_Administration_Page_Action systemPA = homePA
				.selectHomeOption(PropertyReader.getValue("home.option.systemAdministration"));
		System_Info_Page_Action sysInfoPA = systemPA.selectAdminOption("system.option.systemInformation");
		sysInfoPA = new System_Info_Page_Action(driver);
		sysInfoPA.verifyOption(PropertyReader.getValue("systemInfo.heading.JavaRuntime"),
				PropertyReader.getValue("JavaRuntime.option.name"),
				PropertyReader.getValue("JavaRuntime.option.value"));

	}

	@Test(description = "Validating User System Information,name & value")
	public void MarsTC4() throws InterruptedException {

		Login_Page_Action loginPA = new Login_Page_Action(driver);
		Home_Page_Action homePA = loginPA.succesfulLogin(PropertyReader.getValue("ui.application.username"),
				PropertyReader.getValue("ui.application.password"));
		System_Administration_Page_Action systemPA = homePA
				.selectHomeOption(PropertyReader.getValue("home.option.systemAdministration"));
		System_Info_Page_Action sysInfoPA = systemPA.selectAdminOption("system.option.systemInformation");
		sysInfoPA = new System_Info_Page_Action(driver);
		sysInfoPA.verifyOption(PropertyReader.getValue("systemInfo.heading.UserSystem"),
				PropertyReader.getValue("UserSystem.option.name"), PropertyReader.getValue("UserSystem.option.value"));

	}

	@Test(description = "Validating Memory Information,name & value")
	public void MarsTC5() throws InterruptedException {

		Login_Page_Action loginPA = new Login_Page_Action(driver);
		Home_Page_Action homePA = loginPA.succesfulLogin(PropertyReader.getValue("ui.application.username"),
				PropertyReader.getValue("ui.application.password"));
		System_Administration_Page_Action systemPA = homePA
				.selectHomeOption(PropertyReader.getValue("home.option.systemAdministration"));
		System_Info_Page_Action sysInfoPA = systemPA.selectAdminOption("system.option.systemInformation");
		sysInfoPA = new System_Info_Page_Action(driver);
		sysInfoPA.verifyOption(PropertyReader.getValue("systemInfo.heading.Memory"),
				PropertyReader.getValue("Memory.option.name"), PropertyReader.getValue("Memory.option.value"));

	}

	@Test(description = "Validating Database Information,name & value")
	public void MarsTC6() throws InterruptedException {

		Login_Page_Action loginPA = new Login_Page_Action(driver);
		Home_Page_Action homePA = loginPA.succesfulLogin(PropertyReader.getValue("ui.application.username"),
				PropertyReader.getValue("ui.application.password"));
		System_Administration_Page_Action systemPA = homePA
				.selectHomeOption(PropertyReader.getValue("home.option.systemAdministration"));
		System_Info_Page_Action sysInfoPA = systemPA.selectAdminOption("system.option.systemInformation");
		sysInfoPA = new System_Info_Page_Action(driver);
		sysInfoPA.verifyOption(PropertyReader.getValue("systemInfo.heading.Database"),
				PropertyReader.getValue("Database.option.name"), PropertyReader.getValue("Database.option.value"));

	}
}
