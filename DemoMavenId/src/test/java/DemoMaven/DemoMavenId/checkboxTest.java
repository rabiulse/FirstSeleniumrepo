package DemoMaven.DemoMavenId;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseTest;
import Base.Log;
import Base.TestUtilities;
import PageObject.newwelcomePageObject;

public class checkboxTest extends TestUtilities {

	@Test
	public void IframeTest() throws IOException {

		Log.info("CheckboxTest");
		BaseTest base = new BaseTest();
		newwelcomePageObject welcome = new newwelcomePageObject();
		base.lunchUrl();
		welcome.clickOncheckBox();
		sleep(12);
		base.TearDown();
	}

}