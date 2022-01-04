package allure.gradle.project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	@BeforeMethod
	public void baseMethodConfiguration() {
		DriverBase.createThreadLocalWebDriver();
	}
	
	protected WebDriver getDriver() {
		return DriverBase.getThreadLocalDriver();
	}
	
	@AfterMethod
	public void afterMethodConfiguration() {
		this.getDriver().close();
	}

}
