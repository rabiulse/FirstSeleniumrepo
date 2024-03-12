package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Base.BaseTest;

public class inventoryPageObject extends LoginPageObject {

	LoginPageObject loginPage =new LoginPageObject();
	
	//private   WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
	
	public void addtoCart()
	{
		System.out.println("Click on the Backpack");
		WebElement backpack=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		if (backpack.isDisplayed())
		{
			
		  backpack.click();
		  
		 
		} else 
		{
			System.out.println("Backpack is not Displayed");
		}
		
		WebElement afterClickAdd = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
		String getTextOnAddTocart= afterClickAdd.getText();
		System.out.println("Get Text on cart:"+ getTextOnAddTocart);
		Assert.assertEquals("Remove", getTextOnAddTocart);
		
     }
	
	public void removeCart()
	{
		System.out.println("Click on the remove button");
		WebElement Removecart=driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
		if (Removecart.isDisplayed())
		{
			
			Removecart.click();
		  
		 
		} else 
		{
			System.out.println("removeCart is not Displayed");
		}
		
		WebElement afterClickRemove = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		String getTextafterRemove= afterClickRemove.getText();
		System.out.println("Get Text on cart:"+ getTextafterRemove);
		Assert.assertEquals("Add to cart", getTextafterRemove);
		
     }
	
	public void dropdown(int i)
	{
		WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select dropDown = new Select(dropdownElement);
	// Click on the 1 index dropdown value
		dropDown.selectByIndex(i);
		
	}
	
	public String getSelectedOption()
	{
		WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select dropDown = new Select(dropdownElement);
		String selectedOption = dropDown.getFirstSelectedOption().getText();
		System.out.println("Get Selected Option:"+ selectedOption);
		//Assert.assertEquals(selectedOption, null)
		return selectedOption;
	
	
	}
	
	
	
}
