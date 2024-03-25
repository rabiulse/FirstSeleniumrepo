package DemoMaven.DemoMavenId;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseTest;
import PageObject.alertPageObject;

public class JavaScriptAlert extends alertPageObject {

	@Test
	public void AlertTest() throws IOException {

		System.out.println("Starting Test ");
		BaseTest base = new BaseTest();
		alertPageObject alertPage = new alertPageObject();
		base.lunchUrl();
		alertPage.clickOnJavaScriptAlert();
		alertPage.clickForJsAlertandvalidateMessage();
		base.TearDown();
	}

}