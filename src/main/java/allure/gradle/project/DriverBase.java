package allure.gradle.project;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverBase {
	
	private static ThreadLocal<WebDriver> driverManager = new InheritableThreadLocal<WebDriver>();

	public static WebDriver getThreadLocalDriver() {
		WebDriver driver = driverManager.get();
		if (driver == null) {
			throw new RuntimeException(
					"Driver is not available for current thread. Please call createThreadLocalWebDriver() to initlize it.");
		}
		return driver;
	}

	public static void setThreadLocalWebDriver(final WebDriver driver) {
		driverManager.set(driver);
	}

	public static void createThreadLocalWebDriver() {
		WebDriver driver = null;

		try {
			driver = DriverConfiguration.getWebDriver();
		} catch (MalformedURLException e) {
			System.err.print(e);
		}
		if (driver == null) {
			throw new RuntimeException(
					"Driver is not available for current thread. Please call createThreadLocalWebDriver() to initlize it.");
		}
		driverManager.set(driver);
	}

	public static boolean isRemoteExecution() {
		return getThreadLocalDriver().getClass().isAssignableFrom(RemoteWebDriver.class);
	}

}
