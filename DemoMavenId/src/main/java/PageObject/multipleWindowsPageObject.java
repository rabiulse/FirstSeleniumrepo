package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base.BaseTest;

public class multipleWindowsPageObject extends BaseTest {
	BaseTest base = new BaseTest();

	public void clickOnMultipleWindowandVerifytheNewtab() {
		System.out.println("Click on Multiple Window");
		WebElement multipleWindow = driver.findElement(By.xpath("//a[normalize-space()='Multiple Windows']"));
		if (multipleWindow.isDisplayed()) {
			multipleWindow.click();

			// String getcurrentURL= driver.getCurrentUrl();
			// System.out.println(" current Page URL :" +getcurrentURL );

			// String Title = driver.getTitle();

			// System.out.println("Title of the current Page- :" +Title );

			// Assert.assertEquals(getcurrentURL,
			// "https://the-internet.herokuapp.com/windows/new");

		} else {
			System.out.println("clickOnJavaScriptAlert was not clicked");
		}

	}

	/** Find page with title "New Window" and switch to it */

	public void clickOnNewWindowtab() {
		System.out.println("Click on NewWindowTab");
		WebElement clickonNewTab = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
		if (clickonNewTab.isDisplayed()) {
			clickonNewTab.click();

			base.switchToWindowWithTitle("New Window");
			String getcurrentURL = driver.getCurrentUrl();
			System.out.println(" current  Page URL  :" + getcurrentURL);
			String PageSourse = driver.getPageSource();
			System.out.println("Title of the current Sourse - :" + PageSourse);

			Assert.assertEquals(getcurrentURL, "https://the-internet.herokuapp.com/windows/new");
			Assert.assertTrue(PageSourse.contains("New Window"), "New page source doesn't contain expected text");

		} else {
			System.out.println("clickOnJavaScriptAlert was not clicked");
		}

	}

}
