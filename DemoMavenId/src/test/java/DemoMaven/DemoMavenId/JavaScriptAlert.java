package DemoMaven.DemoMavenId;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Base.BaseTest;
import PageObject.alertPageObject;


public class JavaScriptAlert extends alertPageObject {
	
	
	@Test
    public  void AlertTest() {
		
		System.out.println("Starting Test ");
		BaseTest base =new BaseTest();	
		alertPageObject alertPage = new alertPageObject();
		base.lunchUrl();
		alertPage.clickOnJavaScriptAlert();
		alertPage.clickForJsAlertandvalidateMessage();
		base.TearDown();		
    }	
	
}