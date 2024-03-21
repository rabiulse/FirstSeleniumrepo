package DemoMaven.DemoMavenId;

import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class JavaSeleniumWithCollectionExample {

	public static WebDriver driver;

	public static void setup() {

		System.out.println("Create the browser ");
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.get("http://the-internet.herokuapp.com/dropdown");
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
		List<WebElement> mutiplewebelement = driver.findElements(
				By.xpath("//*[contains(text(),'Praj Industries')]/parent::td/ancestor :: tr/preceding-sibling::tr"));

		Iterator<WebElement> itr = mutiplewebelement.iterator();

		String value = "";
		int i = 0;
		HashMap<String, String> elementValues = new HashMap<String, String>();
		while (itr.hasNext()) {
			WebElement element = itr.next();// return the next web element of TD table row
			value = element.getText();// get text value of TD WebElement.
			System.out.println("Element Value are: " + value);
			elementValues.put("element" + i, value);
			i++;
		}
	}

	private static void workondropdown() {

		List<WebElement> dropdownwebelement = driver.findElements(By.xpath("//*[@id='dropdown']"));
		Iterator<WebElement> Itr = dropdownwebelement.iterator();
		String dropdownValue = "";
		while (Itr.hasNext()) {
			WebElement element = Itr.next();// Individual Web Element
			dropdownValue = element.getText();// Get the Text value of Individual Element
			System.out.println("Element Value are:\n " + dropdownValue);

		}

	}

	public static void main(String arg[]) {

		// application="https://money.rediff.com/gainers/bse/daily/groupa";
		setup();
		// usagesofcollectionofxpath();
		workondropdown();
		tearDriver();

	}

}
