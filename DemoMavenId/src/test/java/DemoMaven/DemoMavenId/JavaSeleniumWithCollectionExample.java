package DemoMaven.DemoMavenId;

import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class JavaSeleniumWithCollectionExample {

	public static WebDriver driver;

	public static void setup() {

		System.out.println("Create the browser ");
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		// driver.get("http://the-internet.herokuapp.com/dropdown");
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");

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
				By.xpath("//*[contains(text(),'KRBL Ltd.')]/parent::td/ancestor :: tr/preceding-sibling::tr"));

		Iterator<WebElement> itr = mutiplewebelement.iterator();

		String value = "";
		int i = 0;
		HashMap<String, String> elementValues = new HashMap<String, String>();
		while (itr.hasNext()) {
			WebElement element = itr.next();// return the next web element of TD table row
			value = element.getText();// get text value of TD WebElement.
			System.out.println("Element Value are: " + value);
			// elementValues.put("element" + i, value);
			elementValues.put("Element" + i, value);
			i++;

		}
		System.out.println("Element Value are: " + elementValues);

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

	private static void workondropdownonIndex() throws InterruptedException {

		WebElement dropdownwebelement = driver.findElement(By.xpath("//*[@id='dropdown']"));

		Select Dropdown = new Select(dropdownwebelement);

		Dropdown.selectByIndex(2);
		Thread.sleep(1000);
		Dropdown.selectByValue("1");
		Thread.sleep(1000);
		Dropdown.selectByVisibleText("Option 2");
		Thread.sleep(1000);

	}

	public static void main(String arg[]) throws InterruptedException {

		// application="https://money.rediff.com/gainers/bse/daily/groupa";
		setup();
		usagesofcollectionofxpath();
		// workondropdown();
		// workondropdownonIndex();
		tearDriver();

	}

}
