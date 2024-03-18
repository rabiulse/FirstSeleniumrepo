package DemoMaven.DemoMavenId;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Class of ReverseString
class JavaSeleniumWithCollectionExample {

	public static WebDriver driver;

	public static void setup() {

		System.out.println("Create the browser ");
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	private static void tearDriver() {

		System.out.println("Quit  the browser ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.quit();

	}

	public static void usagesofcollectionofxpath() {
		System.out.println("Starting the Test for : ");
		List<WebElement> mutiplewebelement = driver
				.findElements(By.xpath("//*[contains(text(),'KSB')]/parent::td/ancestor :: tr/preceding-sibling::tr"));

		Iterator<WebElement> itr = mutiplewebelement.iterator();

		String value = "";

		while (itr.hasNext()) {
			WebElement element = itr.next();
			value = element.getText();
			System.out.println("Element Value are: " + value);

		}
	}

	public static void main(String arg[]) {

		// application="https://money.rediff.com/gainers/bse/daily/groupa";
		setup();
		usagesofcollectionofxpath();
		tearDriver();

	}

}
