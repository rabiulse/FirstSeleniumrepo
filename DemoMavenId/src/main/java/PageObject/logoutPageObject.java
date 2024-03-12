package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base.BaseTest;

public class logoutPageObject extends inventoryPageObject {

	inventoryPageObject logoutPage =new inventoryPageObject();
	
	public void clickOnthreeDots()
	{
		System.out.println("Click on three Dots");
		WebElement threeDots=driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
		if (threeDots.isDisplayed())
		{
			
			threeDots.click();
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
			
		 
		} else 
		{
			System.out.println("Three Dots was not clicked");
		}
						
     }
	
	public void clickLogOut()
	{
		System.out.println("Click on Logout");
		
		 
		WebElement Logout=driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
	
		if (Logout.isDisplayed())
		{
			Logout.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
	}
	
	
	
	
}
