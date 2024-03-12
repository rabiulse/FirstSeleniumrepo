package DemoMaven.DemoMavenId;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Base.BaseTest;
import Base.CsvDataProviders;
import PageObject.IframPageObject;
import PageObject.LoginPageObject;
import PageObject.alertPageObject;
import PageObject.multipleWindowsPageObject;
import PageObject.IframPageObject;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;


public class NegativeLogInTests extends Base.TestUtilities {

	
	@Test(priority = 1, dataProvider = "csvReader", dataProviderClass = CsvDataProviders.class)
	public void negativeLogInTest(Map<String, String> testData) throws InterruptedException {
		// Data
		String no = testData.get("no");
		String username  = testData.get("username");
		String password = testData.get("password");
		String expectedErrorMessage = testData.get("expectedMessage");
		String description = testData.get("description");
		
		LoginPageObject login = new LoginPageObject();
		System.out.println("Starting negativeLogInTest #" + no + " for " + description);
		//Logs.info("Starting negativeLogInTest #" + no + " for " + description);

		login.lunchUrl();
		// open main page
		//WelcomePage welcomePage = new WelcomePage(driver, log);
		//welcomePage.openPage();

		// Click on Form Authentication link
		//LoginPage loginPage = welcomePage.clickFormAuthenticationLink();
		login.clickOnAuthenticationLink();

		// execute negative login
		login.negativeLogIn(username, password);

		// wait for error message
		//loginPage.waitForErrorMessage();
		String message = login.geterrormessage();

		// Verification
		Assert.assertTrue(message.contains(expectedErrorMessage), "Message doesn't contain expected text.");
		login.TearDown();
	}
}
