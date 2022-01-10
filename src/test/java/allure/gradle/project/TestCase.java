package allure.gradle.project;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class TestCase extends BaseTest {

	@Test
	@Description("This is the description of the test Scenario")
	@Epic("EPIC-001")
	@Feature("Feature ID: FEA-1")
	@Story("Story ID: STR-001")
	public void validateBasicFields() {
		this.getDriver().navigate().to("https://www.guru99.com/");
		assertPageDetails();
	}

	@Step("This is steps of the Test Scenario")
	private void assertPageDetails() {
		Assert.assertEquals(this.getDriver().getCurrentUrl(), "https://www.guru99.com/", "URL doesn't matched!");
	}

}
