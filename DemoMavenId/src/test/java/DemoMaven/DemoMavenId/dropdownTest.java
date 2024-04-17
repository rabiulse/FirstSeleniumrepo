package DemoMaven.DemoMavenId;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseTest;
import Base.Log;
import Base.TestUtilities;
import PageObject.dropdownpageobject;

public class dropdownTest extends TestUtilities {

	@Test
	public void dropdownTest() throws IOException, InterruptedException {

		Log.info("dropdownTest");
		BaseTest base = new BaseTest();
		dropdownpageobject dropdown = new dropdownpageobject();
		base.lunchUrl();
		dropdown.clickondropdownpageobject();
		dropdown.getalldropdownvalue();
		base.TearDown();
	}

}