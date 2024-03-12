package DemoMaven.DemoMavenId;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Base.BaseTest;
import PageObject.IframPageObject;
import PageObject.alertPageObject;
import PageObject.fileUploadPageObject;
import PageObject.keyPressPageObject;
import PageObject.multipleWindowsPageObject;
import PageObject.IframPageObject;

public class fileUploadTest extends fileUploadPageObject {
	
	
	@Test
    public  void fileUploadTest() {		
		System.out.println("Starting Test ");
		BaseTest base =new BaseTest();	
		fileUploadPageObject fileupload = new fileUploadPageObject();
		base.lunchUrl();
		fileupload.openfileUpload();
		base.TearDown();		
    }		
}