package DemoMaven.DemoMavenId;

import java.util.List;


import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Base.TestUtilities;
import PageObject.jserrorPage;

public class JSErrorTests extends jserrorPage {

	@Test
	public void jsErrorTest() {
		//log.info("Starting jsErrorTest");
		SoftAssert softAssert = new SoftAssert();
		TestUtilities testu=new TestUtilities();
		// Open JSErrorPage
		//jserrorPage jSErrorPage = new jserrorPage();
		//jSErrorPage.openPage();
		
		openjserrorURL();

		// Get logs
		List<LogEntry> logs = testu.getBrowserLogs();

		// Verifying there are no JavaScript errors in console
		for (LogEntry logEntry : logs) {
			if (logEntry.getLevel().toString().equals("SEVERE")) {
				softAssert.fail("Severe error: " + logEntry.getMessage());
			}
		}
		softAssert.assertAll();
	}
}