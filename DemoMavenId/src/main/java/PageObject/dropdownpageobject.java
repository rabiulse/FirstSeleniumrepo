package PageObject;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base.BaseTest;

public class dropdownpageobject extends BaseTest {

	public void clickondropdownpageobject() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement dropdwn = driver.findElement(By.linkText("Dropdown"));
		Assert.assertEquals(true, dropdwn.isDisplayed());
		if (dropdwn.isDisplayed()) {

			js.executeScript("arguments[0].click();", dropdwn);
			String title = driver.getTitle();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			System.out.println("title" + title);
		} else {
			System.out.println("not click the dropdown");
		}

	}

	public void getalldropdownvalue() {
		List<WebElement> dropdown = driver.findElements(By.xpath("//*[@id=\"dropdown\"]"));

		Iterator<WebElement> itr = dropdown.iterator();

		while (itr.hasNext()) {
			String text = itr.next().getText();
			System.out.println(text);

		}

	}

}
