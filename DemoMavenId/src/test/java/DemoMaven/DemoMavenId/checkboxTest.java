package DemoMaven.DemoMavenId;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseTest;
import Base.Log;
import Base.TestUtilities;
import PageObject.checkboxpageobject;

public class checkboxTest extends TestUtilities {

	@Test
	public void checkboxTest() throws IOException, InterruptedException {

		Log.info("CheckboxTest");
		BaseTest base = new BaseTest();
		checkboxpageobject checkboxexample = new checkboxpageobject();
		base.lunchUrl();
		checkboxexample.clickOncheckBox();
		checkboxexample.verifyCheckboxstatus();
		checkboxexample.perfromclickonCheckbox();
		sleep(12);
		base.TearDown();
	}

}