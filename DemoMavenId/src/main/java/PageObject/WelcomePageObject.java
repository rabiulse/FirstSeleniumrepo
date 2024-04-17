package PageObject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BaseTest;

public class WelcomePageObject extends BasePageObject {

	private String pageUrl = "http://the-internet.herokuapp.com/";
	private By javaScriptAlertsLinkLocator = By.linkText("JavaScript Alerts");

	public WelcomePageObject(WebDriver driver, Logger log) {
		super(driver, log);
	}

	BaseTest base = new BaseTest();

	/** Open WelcomePage with it's url */
	public void openPage() {
		log.info("Opening page: " + pageUrl);
		openUrl(pageUrl);
		log.info("Page opened!");
	}

	public JavaScriptAlertsPage clickJavaScriptAlertsLink() {
		log.info("Clicking JavaScript Alerts link on Welcome Page");
		click(javaScriptAlertsLinkLocator);
		return new JavaScriptAlertsPage(driver, log);
	}

	public void clickOncheckBox() {
		// WebElement checkboxlink = driver.findElement("re");

	}

}