package Base;

import java.util.List;

import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.testng.annotations.DataProvider;


public class TestUtilities extends BaseTest {

	// STATIC SLEEP 
	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@DataProvider(name="files")
	protected static Object[][] files() {
		return new Object[][] {
			{1,"NewHtml.html"},
			{2,"jolly_ScreenShot.png"},
			{3,"textfile.txt"}
		};
	}
	
	/** Get logs from browser console */
	public List<LogEntry> getBrowserLogs() {
		LogEntries log = driver.manage().logs().get("browser");
		List<LogEntry> logList = log.getAll();
		return logList;
	}
}