package DemoMaven.DemoMavenId;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseTest;
import Base.Log;
import Base.TestUtilities;
import PageObject.IframPageObject;

public class IframeTest extends TestUtilities {

	@Test
	public void IframeTest() throws IOException {

		System.out.println("Starting Test ");
		BaseTest base = new BaseTest();
		IframPageObject Iframe = new IframPageObject();
		base.lunchUrl();
		Iframe.ClickOnIframeEditor();
		Log.info("Testinformation: ");
		Iframe.verifyTextonIframe();
		sleep(12);
		base.TearDown();
	}

}