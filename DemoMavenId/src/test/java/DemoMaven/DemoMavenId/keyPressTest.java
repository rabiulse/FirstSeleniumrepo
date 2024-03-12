package DemoMaven.DemoMavenId;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Base.BaseTest;
import PageObject.IframPageObject;
import PageObject.alertPageObject;
import PageObject.keyPressPageObject;
import PageObject.multipleWindowsPageObject;
import PageObject.IframPageObject;

public class keyPressTest extends keyPressPageObject {
	
	
	@Test
    public  void KeyPressTest() {
		
		System.out.println("Starting Test ");
		BaseTest base =new BaseTest();	
		keyPressPageObject keypress = new keyPressPageObject();
		base.lunchUrl();
		keypress.openKeyPress();

		// Push keyboard key
		//keypress.pressKey(Keys.SPACE);
		base.pressKeyWithActions(Keys.SPACE);
		
		keypress.getResultText();
		base.TearDown();		
    }		
}