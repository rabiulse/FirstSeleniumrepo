package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

//@Listeners({Base.TestListner.class})

public class BaseTest {

	public static WebDriver driver;

	public void lunchUrl() throws IOException {
		// final org.apache.logging.log4j.Logger logger = LogManager.getLogger();
		System.out.println("Create the browser ");
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Properties prop = new Properties();
		// File file = new File("src\\test\\resources\\data.properties");
		// FileInputStream fis = new FileInputStream(file);
		// prop.load(fis);

		driver.get("http://the-internet.herokuapp.com/");
		// driver.get(prop.getProperty("url"));
		// String URL = getdataFromPropertyFile("URL");
		// driver.get(URL);

		String TitleName = driver.getTitle();
		System.out.println("The title name: " + TitleName);
		Assert.assertEquals(TitleName, "The Internet");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	public String getdataFromPropertyFile(String value) throws IOException {
		Properties prop = new Properties();
		File file = new File("src\\test\\resources\\data.properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		// System prop = null;
		// driver.get("http://the-internet.herokuapp.com/");
		String url = prop.getProperty(value);
		return url;

	}

	public void openjserrorURL() {
		System.out.println("Create the browser ");
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/javascript_error");

	}

	public void TearDown() {

		System.out.println("Closing the browser ");
		driver.quit();
	}

	// wait for sometime and switch to alert button

	protected Alert SwitchToAlert() {

		return driver.switchTo().alert();

	}

	public void switchToWindowWithTitle(String getCurrentPageTitle) {
		// Switching to new window
		String firstWindow = driver.getWindowHandle();
		System.out.println("parent window handle: " + firstWindow);

		Set<String> allWindows = driver.getWindowHandles();// get the all window handle in the current open browser.
		Iterator<String> windowsIterator = allWindows.iterator();//
		System.out.println("parent window handle: " + allWindows);

		while (windowsIterator.hasNext()) {
			String windowHandle = windowsIterator.next().toString();

			if (!windowHandle.equals(firstWindow)) {
				driver.switchTo().window(windowHandle);
				if (getCurrentPageTitle().equals(getCurrentPageTitle)) {
					System.out.println("getCurrentPageTitle is : " + getCurrentPageTitle);
					break;
				}
			}
		}
	}

	/** Get title of current page */
	public String getCurrentPageTitle() {
		return driver.getTitle();

	}

	public void switchToframe() {
		// driver.switchTo().frame(null);

	}

	/** Press Key using Actions class */
	public void pressKeyWithActions(Keys key) {
		// log.info("Pressing " + key.name() + " using Actions class");
		Actions action = new Actions(driver);
		action.sendKeys(key).build().perform();

	}

}
