package DemoMaven.DemoMavenId;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.BaseTest;
import PageObject.fileUploadPageObject;

public class fileUploadTest extends fileUploadPageObject {

	@Test
	public void fileUploadTest() throws IOException, InterruptedException {
		System.out.println("Starting Test ");
		BaseTest base = new BaseTest();
		fileUploadPageObject fileupload = new fileUploadPageObject();
		base.lunchUrl();
		fileupload.openfileUpload();
		fileupload.fileupload();
		base.TearDown();
	}
}