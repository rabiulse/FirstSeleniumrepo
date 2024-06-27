package DemoMaven.DemoMavenId;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class DataProviderDemo {

	@Test(dataProvider = "Test")

	public void loginTest(String username, String password, String password1) {

		System.out.println("Username is : " + username + " and Passord is :" + password + "Password1: " + password1);
		Reporter.log("Test Case executed successfully with username: " + username + "and Password: " + password);
	}

	// data supplier method
	@DataProvider(name = "Test")
	public Object[][] datasupplier() {

		Object[][] testdata = { { "rabi1", "1234", "456" }, { "rabi2", "456", "456" }, { "Rabi2", "345", "678" },
				{ "sdfg", "sfg", "567" } };
		return testdata;
	}

}
