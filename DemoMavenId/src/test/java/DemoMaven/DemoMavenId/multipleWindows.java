package DemoMaven.DemoMavenId;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseTest;
import PageObject.multipleWindowsPageObject;

@Test
public class multipleWindows extends multipleWindowsPageObject {

	public void MultipleWindows() throws IOException {

		System.out.println("Starting Test ");
		BaseTest base = new BaseTest();
		multipleWindows multipleWindow = new multipleWindows();
		base.lunchUrl();
		multipleWindow.clickOnMultipleWindowandVerifytheNewtab();
		multipleWindow.clickOnNewWindowtab();
		base.TearDown();
	}

}