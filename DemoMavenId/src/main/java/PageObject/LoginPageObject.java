package PageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base.BaseTest;

public class LoginPageObject<username> extends BaseTest {

	BaseTest base = new BaseTest();

	@Override
	public void lunchUrl() throws IOException {
		base.lunchUrl();
	}

//Click on Form Authentication link

	public void clickOnAuthenticationLink() {

		WebElement clickOnAuth = driver.findElement(By.linkText("Form Authentication"));
		clickOnAuth.click();

	}

	public void negativeLogIn(String username, String password) throws InterruptedException {
		WebElement usernameTextBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement passwordtextBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement SignIn = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
		usernameTextBox.sendKeys(username);
		passwordtextBox.sendKeys(password);

		SignIn.click();
		Thread.sleep(1000);

	}

	/** Wait for error message to be visible on the page */
	public String geterrormessage() {
		WebElement errorMessageLocator = driver.findElement(By.id("flash"));
		String errormessage = errorMessageLocator.getText();
		return errormessage;
	}

	public void enterUsername() {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
	}

	public void enterPassword() {
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
	}

	public void SignIn() {
		WebElement Signin = driver.findElement(By.xpath("//input[@id='login-button']"));
		Signin.click();
	}

	public void verifylogIn() {

		this.SignIn();
		String getCurrentUrl = driver.getCurrentUrl();
		System.out.println("The title name: " + getCurrentUrl);
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", getCurrentUrl);

	}

	public void enterWrongePassword() {
		WebElement passwordw = driver.findElement(By.xpath("//input[@id='password']"));
		passwordw.sendKeys("secret_sauce2");
	}

	public void getTextForWrongPass() {

		WebElement getTestForWrongPass = driver
				.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]"));
		String getText = getTestForWrongPass.getText();
		System.out.println("Error Message " + getText);
		Assert.assertEquals(getText, "Epic sadface: Username and password do not match any user in this service");
	}

}
