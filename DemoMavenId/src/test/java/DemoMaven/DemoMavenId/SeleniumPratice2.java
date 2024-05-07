package DemoMaven.DemoMavenId;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumPratice2 {
	static WebDriver driver;

	@Test(priority = 1)
	public void TestnAssetTest() {
		int a = 9;
		int b = 8;
		Assert.assertFalse(a < b, "Test is not passed");
		System.out.println("TestnAssetTest");

	}

	@Test(priority = 3)
	public void applicationURLtest() {

		System.out.println("Application URL open");
	}

	@Test(priority = 4)
	public void LoginTest() {

		System.out.println("LoginTest");
	}

	@Test(priority = 2)
	public void HomePage() {

		System.out.println("HomePage");
	}

	@Test(enabled = false)
	public void pressKeyWithActions() {
		System.out.println("Create the browser ");
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://omayo.blogspot.com/");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.F5).build().perform();
		driver.quit();

	}

	@Test(enabled = false)
	public void workwithcookies() {

		System.out.println("workwithcookies");
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/cookie/selenium_aut.php");

		// create file named Cookies to store Login Information
		File file = new File("Cookies.data");
		try {
			// Delete old file if exists
			file.delete();
			file.createNewFile();
			FileWriter fileWrite = new FileWriter(file);
			BufferedWriter Bwrite = new BufferedWriter(fileWrite);
			// loop for getting the cookie information

			// loop for getting the cookie information
			for (Cookie ck : driver.manage().getCookies()) {
				Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
						+ ck.getExpiry() + ";" + ck.isSecure()));
				Bwrite.newLine();
			}
			Bwrite.close();
			fileWrite.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		driver.manage().deleteAllCookies();
		driver.close();

	}

	@Test(enabled = true)
	public void workingwithjavascript() throws InterruptedException {
		System.out.println("workingwithjavascript ");
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments(("headless"));
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://omayo.blogspot.com/");
		// driver.navigate().back();
		WebElement texarea = driver.findElement(By.xpath("//*[@id='ta1']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Testrabiul1'", texarea);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		// Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,100)");
		// Thread.sleep(500);

		driver.close();
	}

	@Test(enabled = false)
	public void takeScreenshot() throws Exception {
		System.out.println("takeScreenshot ");
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://omayo.blogspot.com/");
		String destinationpath = "C:\\\\Users\\\\rabiu\\\\git\\\\repository\\\\DemoMavenId\\\\src\\\\test\\\\resources\\\\files//test3.png";
		this.takeSnapShot(driver, destinationpath);
		driver.close();
	}

	private void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File(fileWithPath);
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}

}
