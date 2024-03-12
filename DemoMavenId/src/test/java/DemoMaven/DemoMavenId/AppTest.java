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
import PageObject.LoginPageObject;
import Pages.LogInPage;

public class AppTest extends LoginPageObject {
	
	

	@Test
    public  void FirstTest() {
		LoginPageObject b =new LoginPageObject();
		System.out.println("Starting Test ");
		BaseTest base =new BaseTest();	
		base.lunchUrl();
		LoginPageObject loginPage =new LoginPageObject();
		System.out.println("Test for enter User name ");
		loginPage.enterUsername();
		loginPage.enterPassword();
		//loginPage.SignIn();
		loginPage.verifylogIn();
		
		base.TearDown();		
    }
	
	
	
}