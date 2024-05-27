package DemoMaven.DemoMavenId;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Webtable {
	static WebDriver driver;
	/*
	 * 
	 * url-https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html first
	 * identify the table column: //table[@Id='customers']//th- table column /
	 * //table[@Id='customers']//tr- table row // // //table[@Id='customers']//td-
	 * table all data //table[@Id='customers']//tr//td[4]- fourth column value
	 * 
	 * //td[text()='Selenium']//preceding-sibling::td//input
	 * //td[text()='Ola']//following-sibling::td//a - anchor tab
	 */

	@Test
	public void webtableTest() {

		System.out.println("Create the browser ");
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");

		// work on column value

		List<WebElement> allcolumnHeader = driver.findElements(By.xpath("//table[@Id='customers']//th"));

		int columnSize = allcolumnHeader.size();

		Assert.assertEquals(columnSize, 5, "Column size is not match with expected");

		Reporter.log("columnSize : " + columnSize);

		for (WebElement ele : allcolumnHeader) {

			String colunheadervalue = ele.getText();
			boolean flag = false;
			if (colunheadervalue.contains("Contact")) {
				flag = true;
				Assert.assertEquals(colunheadervalue.contains("Contact"), flag, "expected Test is present:");
				break;
			}

		}
// All rows
		System.out.println("---------------------------");

		List<WebElement> allrows = driver.findElements(By.xpath("//table[@Id='customers']//tr"));

		Reporter.log("allrows : " + allrows.size());

		Assert.assertEquals(allrows.size(), 7);

		// All Data
		System.out.println("---------------------------");

		List<WebElement> alldata = driver.findElements(By.xpath("//table[@Id='customers']//td"));
		boolean status = false;
		for (WebElement data : alldata) {

			String tabledata = data.getText();
			Reporter.log("tabledata : " + tabledata);
			if (tabledata.contains("Amazon")) {
				status = true;
				break;

			}
		}

		Assert.assertTrue(status, "Contains does not match:");

		driver.close();

	}

}
