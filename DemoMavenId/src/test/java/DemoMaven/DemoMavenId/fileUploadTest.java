package DemoMaven.DemoMavenId;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseTest;
import Base.TestUtilities;
import PageObject.fileUploadPageObject;

public class fileUploadTest extends TestUtilities {

	@Test
	public void fileUploadTest() throws IOException {
		System.out.println("Starting Test ");
		BaseTest base = new BaseTest();
		fileUploadPageObject fileupload = new fileUploadPageObject();
		base.lunchUrl();
		fileupload.openfileUpload();
		base.TearDown();
	}
}