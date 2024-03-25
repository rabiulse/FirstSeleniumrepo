package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Base.BaseTest;
import Base.Log;

public class IframPageObject extends BaseTest {
	BaseTest base = new BaseTest();

	public void ClickOnIframeEditor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("Click on Multiple Window");

		// WebElement IframeEditor=driver.findElement(By.xpath("//li[44]"));
		WebElement IframeEditor = driver.findElement(By.linkText("WYSIWYG Editor"));
		if (IframeEditor.isDisplayed()) {

			// IframeEditor.click();
			// js.executeScript(null, null);

			js.executeScript("arguments[0].click();", IframeEditor);
			// js.executeScript("document.getElementById('user_submit').click();");
			// js.executeScript("document.getElementByXpath('//*[@id=\"content\"]/ul/li[44]/a').click();");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			String getcurrentURL = driver.getCurrentUrl();
			System.out.println(" current  Page URL  :" + getcurrentURL);

			String Title = driver.getTitle();

			System.out.println("Title of the current Page- :" + Title);

			// Assert.assertEquals(getcurrentURL,
			// "https://the-internet.herokuapp.com/windows");

		} else {
			System.out.println("clickOnJavaScriptAlert was not clicked");
		}

	}

	public void verifyTextonIframe() {
		driver.switchTo().frame(0);

		this.verifyText();

	}

	private void verifyText() {
		WebElement TextAreaonIfame = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
		String Textvalue = TextAreaonIfame.getText();
		Log.info("value on Test in Iframe" + Textvalue);
		Log.fatal("fatal error message" + Textvalue);
		System.out.println("Value on Text On Iframe: " + Textvalue);

	}
}
