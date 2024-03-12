package PageObject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BaseTest;

public class jserrorPage extends BaseTest {
	
	private String pageUrl = "http://the-internet.herokuapp.com/javascript_error";
	

	/** Open JSErrorPage with it's url */
	public void openPage() {
		driver.get(pageUrl);
	}

}
