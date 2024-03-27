package DemoMaven.DemoMavenId;

import java.io.IOException;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.CsvDataProviders;
import PageObject.LoginPageObject;

public class NegativeLogInTests extends Base.TestUtilities {

	@Test(priority = 1, dataProvider = "csvReader", dataProviderClass = CsvDataProviders.class)
	public void negativeLogInTest(Map<String, String> testData) throws InterruptedException, IOException {
		// getting the Data from CSV file
		String no = testData.get("no");
		String username = testData.get("username");
		String password = testData.get("password");
		String expectedErrorMessage = testData.get("expectedMessage");
		String description = testData.get("description");

		LoginPageObject login = new LoginPageObject();
		System.out.println("Starting negativeLogInTest #" + no + " for " + description);

		login.lunchUrl();

		login.clickOnAuthenticationLink();

		// execute negative login
		login.negativeLogIn(username, password);

		// wait for error message
		// loginPage.waitForErrorMessage();
		String message = login.geterrormessage();

		// Verification
		Assert.assertTrue(message.contains(expectedErrorMessage), "Message doesn't contain expected text.");
		login.TearDown();
	}
}
