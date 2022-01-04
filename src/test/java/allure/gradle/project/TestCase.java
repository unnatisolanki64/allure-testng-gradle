package allure.gradle.project;

import org.testng.annotations.Test;

public class TestCase extends BaseTest {
	
	@Test
	public void validateBasicFields() {
		this.getDriver().navigate().to("https://www.guru99.com/");
	}
}
