package DemoMaven.DemoMavenId;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseTest;
import PageObject.LoginPageObject;
import PageObject.inventoryPageObject;
import PageObject.logoutPageObject;

public class InventaryTest extends logoutPageObject {

	@Test

	public void InventaryTest() throws IOException {

		// LoginPageObject b =new LoginPageObject();
		inventoryPageObject inventary = new inventoryPageObject();
		logoutPageObject logoutPage = new logoutPageObject();
		System.out.println("Starting Test ");
		BaseTest base = new BaseTest();
		base.lunchUrl();
		LoginPageObject loginPage = new LoginPageObject();
		System.out.println("Test for enter User name ");
		loginPage.enterUsername();
		loginPage.enterPassword();
		// loginPage.SignIn();
		loginPage.verifylogIn();
		inventary.addtoCart();
		inventary.removeCart();
		inventary.dropdown(3);
		inventary.getSelectedOption();
		logoutPage.clickOnthreeDots();
		logoutPage.clickLogOut();
		base.TearDown();
	}

}
