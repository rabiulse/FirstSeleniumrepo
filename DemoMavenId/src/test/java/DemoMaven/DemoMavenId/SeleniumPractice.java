package DemoMaven.DemoMavenId;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.Properties;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumPractice {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		// setup();
		// TearDown();

		// handleNotification();
		// implecitWait();
		// checkboxexample();

		readdatafromPropertiesfile();
		// fileUploadTest();
		// explicitWait();
		// FluentWaitPractise();
		// javascriptexecutor();
		// downloadfile();

		// No Such element exception
		// System.out.println(driver.findElement(By.xpath("//input[@value='LoginX']")).isDisplayed());
		// driver.findElement(By.xpath("//input[@value='LoginX']"));
		// No such window exception
		// driver.switchTo().window("ABSDf");

		// No such frame Exceptiom

		// driver.switchTo().frame("asd");

		// No alert present Exception

		// driver.switchTo().alert();

		// invalid selector exception

		// driver.findElement(By.xpath("//input[@value='Login']"));

		// no such session exception

		// driver.findElement(By.xpath("//input[@value='Login']"));
	}

	@Test
	public static void fileUploadTest() throws InterruptedException {

		System.out.println("file upload Test the browser ");
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement uploadbutton = driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
		// uploadbutton.click();// click the upload button

		// enter the file path onto the file-selection input field
		uploadbutton.sendKeys("C:\\Users\\rabiu\\Downloads\\Fee Receipt.pdf");

		// check the "I accept the terms of service" check box
		driver.findElement(By.id("terms")).click();

		// click the "UploadFile" button
		driver.findElement(By.name("send")).click();

		// validation pf Test:
		Thread.sleep(5000);
		String getTextString = driver.findElement(By.xpath("//h3[@id='res']")).getText().replaceAll("\\s", "");

		System.out.println("get Test value: " + getTextString);
		Assert.assertEquals(getTextString, "1filehasbeensuccessfullyuploaded.");
		// String Actualtext = "1 file ";
		// boolean result = getTextString.equalsIgnoreCase(Actualtext);

		// Assert.assertTrue(result);

		driver.quit();

	}

	public static void setup() {
		System.out.println("Create the browser ");
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		// driver.get("https://omayo.blogspot.com/");
		driver.navigate().to("https://omayo.blogspot.com/");

		// https://www.justdial.com/
		// driver.get("https://omayo.blogspot.com/p/page7.html");

	}

	public static void readdatafromPropertiesfile() throws IOException

	{
		Properties prop = new Properties();
		File file = new File("src\\test\\resources\\data.properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		String url = prop.getProperty("url");
		System.out.println("get url:" + prop.getProperty("url"));
		String Password = prop.getProperty("Password");
		System.out.println("get Password:" + prop.getProperty("Password"));

		// Adding new test data in the property file:

		FileOutputStream fos = new FileOutputStream(file);

		prop.setProperty("TestData1", "3456783");
		prop.store(fos, "This is the example of added data");

		String TestData = prop.getProperty("TestData");
		System.out.println(TestData);

	}

	public static void checkboxexample() {
		System.out.println("check box example- ");
		WebElement checkboxexample = driver.findElement(By.xpath("//*[@id=\"HTML33\"]/div[1]/input[2]"));

		boolean resut = checkboxexample.isSelected();

		Assert.assertTrue(resut);
		// Assert.assertFalse(resut);
		if (resut == true) {
			System.out.println("It is selected");

		}

		else {

			System.out.println("It is NOT selected");
		}

	}

	public static void handleNotification() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification");
		// option.setAcceptInsecureCerts(false);
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.justdial.com/");
		driver.manage().window().maximize();

	}

	public static void implecitWait() {
		/*
		 * implicitly wait is dynamic wait - it will wait until the element is visible
		 * or clickable if the element is visible then it will not wait that particular
		 * time
		 */

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.className("dropbtn")).click();

		driver.findElement(By.linkText("Facebook")).click();
		String titlename = driver.getTitle();
		System.out.println("Title name is : " + titlename);
		Assert.assertEquals("Facebook – log in or sign up", titlename);

	}

	public static void explicitWait() throws InterruptedException {
		/*- Instead of waiting for all the Web Elements in the automation script, Explicit
		wait will wait only for the specific web element
		 * WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element =
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		element.click();
		 */

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		synchronized (driver) {

			driver.wait(5000);
		}

		driver.findElement(By.className("dropbtn")).click();
		// WebElement facebook = wait.until(ExpectedConditions.visi
		WebElement facebook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		WebElement facebook1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Test")));
		facebook.click();
		String titlename = driver.getTitle();
		System.out.println("Title name is : " + titlename);
		// added 5 second wait time here..

		Assert.assertEquals("Facebook – log in or sign up", titlename);
		// Assert.assertTrue(facebook1.isSelected());

		synchronized (driver) {

			driver.wait(5000);
		}

		Actions action = new Actions(driver);
		action.sendKeys(Keys.F5);

	}

	public static void FluentWaitPractise() {
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		driver.findElement(By.className("dropbtn")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement facebookbutton = wait.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.linkText("Facebook"));
			}
		});
		facebookbutton.click();

		String titlename = driver.getTitle();
		System.out.println("Title name is : " + titlename);
		Assert.assertEquals("Facebook – log in or sign up", titlename);

	}

	public static void javascriptexecutor() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchbox = driver
				.findElement(By.xpath("//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[1]/input"));
		searchbox.click();

		// searchbox.sendKeys("Testrabiul");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Testrabiul1'", searchbox);

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);

		/*
		 * / searchbox.clear(); // Get attribute example WebElement button2 =
		 * driver.findElement(By.id("but2")); String attributevalue =
		 * button2.getAttribute("type"); System.out.println("Attribute value : " +
		 * attributevalue);
		 * 
		 * WebElement searchbutton = driver .findElement(By.xpath(
		 * "//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[2]/input"));
		 * searchbutton.click();
		 * 
		 * WebElement searchResult =
		 * driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]")); String getText =
		 * searchResult.getText();
		 * 
		 * System.out.println("Search result : " + getText);
		 */

	}

	void databaseconnection() throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("Select * from employees where id=3;");

		while (resultSet.next()) {

			int value = resultSet.getInt("phonenumber");

			System.out.println(resultSet.getInt("id"));
			System.out.println(resultSet.getString("name"));
			System.out.println(resultSet.getString("place"));
			System.out.println(resultSet.getInt("experience"));

		}

	}

	public static void TearDown() {

		driver.quit();
		System.out.println("Closing the driver");

	}

}