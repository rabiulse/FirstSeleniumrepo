package DemoMaven.DemoMavenId;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class advanceSeleniumfeatures {
	static WebDriver driver;

	@Test(enabled = true)
	public void opennewwindow() {
		System.out.println("Create the browser ");
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://omayo.blogspot.com/");
		driver.get("https://www.google.com/");
		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.WINDOW);

		// Opens BrowserStack homepage in the newly opened window
		driver.navigate().to("https://www.browserstack.com/");
		String gettile = driver.getTitle();
		System.out.println("get titile : " + gettile);
		driver.quit();

	}

	@Test(enabled = false)
	public void opennewTab() {
		System.out.println("Create the browser ");
		Reporter.log("Browser Opened");

		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Browser Maximized");
		// driver.navigate().to("https://omayo.blogspot.com/");
		driver.get("https://www.google.com/");
		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.TAB);
		Reporter.log("Browser Maximized");

		// Opens BrowserStack homepage in the newly opened window
		driver.navigate().to("https://www.browserstack.com/");
		driver.close();

	}

	@Test(enabled = false)
	public void popupAuthentication() {
		System.out.println("Create the browser ");
		Reporter.log("Browser Opened");

		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Browser Maximized");
		driver.get("https://admin:admin@the-internet.herokuapp.com");
		driver.getTitle();
		Reporter.log("Tilte name" + driver.getTitle());
		driver.close();

		Reporter.log("Browser Closed:");

	}

}
