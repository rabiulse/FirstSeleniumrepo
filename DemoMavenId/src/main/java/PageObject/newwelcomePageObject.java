package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseTest;

public class newwelcomePageObject extends BaseTest {

	public void clickOncheckBox() {
		WebElement checkboxlink = driver.findElement(By.xpath("//div[@Id='content']//li[6]"));
		checkboxlink.click();
	}

	public boolean verifyCheckboxstatus() {
		WebElement checkboxstatus = driver.findElement(By.xpath("//div[@id='content']//input[2]"));

		if (checkboxstatus.isSelected()) {
			return true;
		} else {
			return false;
		}

	}

	// perform the click action on check box:

}
