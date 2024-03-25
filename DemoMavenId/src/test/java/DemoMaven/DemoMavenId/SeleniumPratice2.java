package DemoMaven.DemoMavenId;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumPratice2 {

	@Test(priority = 4)
	public void TestnAssetTest() {
		int a = 9;
		int b = 8;
		Assert.assertFalse(a < b, "Test is not passed");
		System.out.println("TestnAssetTest");

	}

	@Test(priority = 3)
	public void applicationURLtest() {

		System.out.println("Application URL open");
	}

	@Test(priority = 1)
	public void LoginTest() {

		System.out.println("LoginTest");
	}

	@Test(priority = 2)
	public void HomePage() {

		System.out.println("HomePage");
	}

}