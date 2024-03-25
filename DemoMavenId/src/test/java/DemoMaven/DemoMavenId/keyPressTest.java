package DemoMaven.DemoMavenId;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import Base.BaseTest;
import PageObject.keyPressPageObject;

public class keyPressTest extends keyPressPageObject {

	@Test
	public void KeyPressTest() throws IOException {

		System.out.println("Starting Test ");
		BaseTest base = new BaseTest();
		keyPressPageObject keypress = new keyPressPageObject();
		base.lunchUrl();
		keypress.openKeyPress();

		// Push keyboard key
		// keypress.pressKey(Keys.SPACE);
		base.pressKeyWithActions(Keys.ENTER);

		keypress.getResultText();
		base.TearDown();
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suits it is executed: ");
	}

}