package DemoMaven.DemoMavenId;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Base.BaseTest;
import PageObject.JavaScriptAlertsPage;
import PageObject.WelcomePageObject;
import PageObject.alertPageObject;


public class JavaScriptAlertUdemy extends JavaScriptAlertsPage {
	
	
	

	public JavaScriptAlertUdemy(WebDriver driver, Logger log) {
		super(driver, log);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void jsAlertTest() {
		
		BaseTest base =new BaseTest();
		base.lunchUrl();
		
		log.info("Starting jsAlertTest");

		// open main page
		WelcomePageObject welcomePage = new WelcomePageObject(driver,log);
		//welcomePage.openPage();

		// Click on JavaScript Alerts link
		JavaScriptAlertsPage alertsPage = welcomePage.clickJavaScriptAlertsLink();

		// Click JS Alert button
		alertsPage.openJSAlert();

		
		// Get alert text
		String alertMessage = alertsPage.getAlertText();

		// Click OK button
		alertsPage.acceptAlert();

		// Get Results text
		String result = alertsPage.getResultText();
	
		// Verifications
		// 1 - Alert text is expected
		Assert.assertTrue(alertMessage.equals("I am a JS Alert"),
				"Alert message is not expected. \nShould be 'I am a JS Alert', but it is '" + alertMessage + "'");

		// 2 - Result text is expected
		Assert.assertTrue(result.equals("You successfuly clicked an alert"),
				"result is not expected. \nShould be 'You successfuly clicked an alert', but it is '" + result + "'");
	}
	
}