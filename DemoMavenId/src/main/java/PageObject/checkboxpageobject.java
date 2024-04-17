package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base.BaseTest;

public class checkboxpageobject extends BaseTest {

	public void clickOncheckBox() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement checkboxlink = driver.findElement(By.linkText("Checkboxes"));
		if (checkboxlink.isDisplayed()) {
			// checkboxlink.click();
			js.executeScript("arguments[0].click();", checkboxlink);
			String title = driver.getTitle();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			System.out.println("title" + title);
		}

	}

	public void verifyCheckboxstatus() {
		WebElement checkboxstatus = driver.findElement(By.xpath("//div[@id='content']//input[2]"));
		Assert.assertEquals(true, checkboxstatus.isSelected());

	}

	public void perfromclickonCheckbox() {
		WebElement checkbox1 = driver.findElement(By.xpath("//div[@id='content']//input[1]"));
		Assert.assertEquals(false, checkbox1.isSelected());
		if (!checkbox1.isSelected()) {
			checkbox1.click();

		}

		Assert.assertEquals(true, checkbox1.isSelected());

	}// perform the click action on check box:

}
