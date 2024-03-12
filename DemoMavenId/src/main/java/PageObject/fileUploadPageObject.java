package PageObject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base.BaseTest;

public class fileUploadPageObject extends BaseTest {

	
	public void openfileUpload()
	{
		System.out.println("Click on file Upload link: ");
		WebElement fileupload=driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[18]/a"));
		if (fileupload.isDisplayed())
		{			
			fileupload.click();
			String getcurrentURL= driver.getCurrentUrl();
			System.out.println(" current  Page URL  :" +getcurrentURL );
			Assert.assertEquals("https://the-internet.herokuapp.com/upload", getcurrentURL);
		 
		} else 
		{
			System.out.println("clickOnJavaScriptAlert was not clicked");
		}
						
     }
	
	
}
