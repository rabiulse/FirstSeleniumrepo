package DemoMaven.DemoMavenId;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class DataProviderDemo {

	@Test(dataProvider = "Test")

	public void loginTest(String username, String password) {

		System.out.println("Username is : " + username + " and Passord is :" + password);
	}

	// data supplier method
	@DataProvider(name = "Test")
	public Object[][] datasupplier() {

		Object[][] testdata = { { "rabi1", "1234" }, { "rabi2", "456" }, { "Rabi2", "345" }, { "sdfg", "sfg" } };
		return testdata;
	}

}
