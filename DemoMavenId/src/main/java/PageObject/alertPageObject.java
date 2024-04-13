package PageObject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Base.BaseTest;

public class alertPageObject extends BaseTest {

	// private WebElement
	// javaScriptAlert=driver.findElement(By.xpath("//a[normalize-space()='JavaScript
	// Alerts']"));
	// private By javaScriptAlert = By.xpath("//a[normalize-space()='JavaScript
	// Alerts']");
	// private WebElement
	// ClickForJsAlert=driver.findElement(By.xpath("//button[normalize-space()='Click
	// for JS Alert']"));
	// private WebElement
	// validateResult=driver.findElement(By.xpath("//*[@id=\"result\"]"));

	public void clickOnJavaScriptAlert() {
		System.out.println("Click on JavaScriptAlert");
		WebElement javaScriptAlert = driver.findElement(By.xpath("//a[normalize-space()='JavaScript Alerts']"));
		if (javaScriptAlert.isDisplayed()) {

			javaScriptAlert.click();
			String getcurrentURL = driver.getCurrentUrl();
			System.out.println(" current  Page URL  :" + getcurrentURL);

			String Title = driver.getTitle();

			System.out.println("Title of the current Page- :" + Title);

		} else {
			System.out.println("clickOnJavaScriptAlert was not clicked");
		}

	}

	public void clickForJsAlertandvalidateMessage() {
		System.out.println("Click on JS alert");
		WebElement ClickForJsAlert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		if (ClickForJsAlert.isDisplayed()) {

			ClickForJsAlert.click();

		} else {
			System.out.println("clickOnJavaScriptAlert was not clicked");
		}
		this.getalertMessageFromJsAlert();
		this.ClickONOKButton();
		System.out.println("Validate the Result once click on JS alert");
		this.validateResult();

	}

	// Switch to alert and gets its message

	private String getalertMessageFromJsAlert() {
		Alert alert = SwitchToAlert();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		String getmessage = alert.getText();
		System.out.println("Get alert message on Jsalert Pop window: " + getmessage);
		Assert.assertEquals("I am a JS Alert", getmessage);
		return getmessage;

	}

//Switch to Alert and click on Ok Button
	private void ClickONOKButton() {
		Alert alert = SwitchToAlert();
		alert.accept();

	}

	private void validateResult() {
		WebElement validateResult = driver.findElement(By.xpath("//*[@id=\"result\"]"));
		String getresultText = validateResult.getText();
		System.out.println("Text on Result page :  " + getresultText);
		Assert.assertEquals("You successfully clicked an alert", getresultText);
	}
}
