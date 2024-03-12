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
import Base.TestUtilities;
import PageObject.IframPageObject;
import PageObject.alertPageObject;
import PageObject.multipleWindowsPageObject;
import PageObject.IframPageObject;

public class IframeTest extends TestUtilities {
	

	@Test
    public  void IframeTest() {
		
		System.out.println("Starting Test ");
		BaseTest base =new BaseTest();	
		IframPageObject Iframe = new IframPageObject();
		base.lunchUrl();
		Iframe.ClickOnIframeEditor();
		Iframe.verifyTextonIframe();
		sleep(12);
		base.TearDown();		
    }	
	
}