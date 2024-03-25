package DemoMaven.DemoMavenId;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseTest;
import PageObject.LoginPageObject;

public class NegativeTest extends LoginPageObject {

	@Test
	public void FirstTest() throws IOException {
		LoginPageObject b = new LoginPageObject();
		System.out.println("Starting Test ");
		BaseTest base = new BaseTest();
		base.lunchUrl();
		LoginPageObject loginPage = new LoginPageObject();
		System.out.println("Test for enter User name ");
		loginPage.enterUsername();
		loginPage.enterWrongePassword();
		loginPage.SignIn();
		loginPage.getTextForWrongPass();
		base.TearDown();
	}

}