package PageObject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base.BaseTest;

public class keyPressPageObject extends BaseTest {

	
	public void openKeyPress()
	{
		System.out.println("Click on OpenKeyPress");
		WebElement OpenKeyPress=driver.findElement(By.xpath("//a[normalize-space()='Key Presses']"));
		if (OpenKeyPress.isDisplayed())
		{			
			OpenKeyPress.click();
			String getcurrentURL= driver.getCurrentUrl();
			System.out.println(" current  Page URL  :" +getcurrentURL );
			Assert.assertEquals("https://the-internet.herokuapp.com/key_presses", getcurrentURL);
		 
		} else 
		{
			System.out.println("clickOnJavaScriptAlert was not clicked");
		}
						
     }
	
	public void pressKey(Keys key)
	{		
		System.out.println("enter the key press");
		WebElement keyPressLocator=driver.findElement(By.xpath("//*[@id=\"target\"]"));
		keyPressLocator.sendKeys(key);
	
		
	}
	
	public String getResultText() {
		WebElement resultTextLocator =driver.findElement(By.id("result"));
		String result = resultTextLocator.getText();
		System.out.println(" result is  :" + result );
		Assert.assertEquals("You entered: SPACE", result);
		return result;
	}
	
}
