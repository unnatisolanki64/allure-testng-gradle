package allure.gradle.project;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverConfiguration {

	public static WebDriver getWebDriver() throws MalformedURLException {
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(getChromeOptions());
		return driver;
	}

	private static ChromeOptions getChromeOptions() {
		ChromeOptions chromeBrowser = new ChromeOptions();
		chromeBrowser.addArguments("--no-sandbox");
		chromeBrowser.addArguments("--disable-dev-shm-usage");
		// chromeBrowser.addArguments("--headless");
		chromeBrowser.addArguments("start-maximized");
		return chromeBrowser;
	}
}
