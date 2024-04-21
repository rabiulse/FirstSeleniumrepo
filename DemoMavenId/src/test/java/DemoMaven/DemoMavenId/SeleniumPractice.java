package DemoMaven.DemoMavenId;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.Duration;
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

public class SeleniumPractice {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		setup();
		// handleNotification();
		// implecitWait();
		checkboxexample();
		// explicitWait();
		// FluentWaitPractise();
		// javascriptexecutor();
		// downloadfile();
		TearDown();

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
		option.addArguments("-- disable-notification");
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

	public static void databaseConnection() throws SQLException {
		String Username = "root";
		String password = "root";
		String URLW = "jdbc://mysql://localhost:3306/databasename";
		Connection conn = DriverManager.getConnection(URLW, Username, password);

	}

	public static void TearDown() {

		driver.quit();
		System.out.println("Closing the driver");

	}

}