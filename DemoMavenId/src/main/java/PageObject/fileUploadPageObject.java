package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base.BaseTest;

public class fileUploadPageObject extends BaseTest {

	public void openfileUpload() {
		System.out.println("Click on file Upload link: ");

		WebElement fileupload = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[18]/a"));
		if (fileupload.isDisplayed()) {
			fileupload.click();
			String getcurrentURL = driver.getCurrentUrl();
			System.out.println(" current  Page URL  :" + getcurrentURL);
			Assert.assertEquals("http://the-internet.herokuapp.com/upload", getcurrentURL);

		} else {
			System.out.println("clickOnJavaScriptAlert was not clicked");
		}

	}

	public void fileupload() throws InterruptedException {
		WebElement fileupload1 = driver.findElement(By.xpath("//*[@id='drag-drop-upload']"));

		if (fileupload1.isDisplayed()) {
			fileupload1.click();

			fileupload1.sendKeys(
					"C:\\Users\\rabiu\\git\\repository\\DemoMavenId\\src\\test\\resources\\files\\textfile.txt");

			Thread.sleep(5000);

		}

	}

}
