package Base;

import java.time.Duration;
import java.util.Set;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;

public class BaseTest {

	public static WebDriver driver ;
	

	public void lunchUrl() {
		//final org.apache.logging.log4j.Logger logger = LogManager.getLogger();
		 System.out.println("Create the browser ");
		 System.setProperty("webdriver.chrome.drive", "C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
	        this.driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("http://the-internet.herokuapp.com/");
	        String TitleName=driver.getTitle();
	    	System.out.println("The title name: " + TitleName);
	    	Assert.assertEquals(TitleName, "The Internet");
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	    	
	}

/*public void lunchUrl2() {
	//final org.apache.logging.log4j.Logger logger = LogManager.getLogger();
	System.out.println("Create the browser ");
	 System.setProperty("webdriver.chrome.drive", "C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
        this.driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");
        String TitleName=driver.getTitle();
        //logger.info("The title name: " + TitleName);
    	System.out.println("The title name: " + TitleName);
    	Assert.assertEquals(TitleName, "The Internet");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    	WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
    	username.sendKeys("standard_user");
    	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
    	password.sendKeys("secret_sauce");
    	WebElement Signin=driver.findElement(By.xpath("//input[@id='login-button']"));
    	Signin.click();
    	
        String TitleName1=driver.getTitle();
        System.out.println("The title name: " + TitleName1);
        
        
    	
}*/
	
	public void openjserrorURL()
	{
		 System.out.println("Create the browser ");
		 System.setProperty("webdriver.chrome.drive", "C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
	        this.driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://the-internet.herokuapp.com/javascript_error");
		
	}

	public void TearDown() {

		System.out.println("Closing the browser ");
		driver.quit();
	}
	
	// wait for sometime and switch to alert button
	
	protected Alert SwitchToAlert()
	{
		
		return driver.switchTo().alert();	
		
	}
	
	public void switchToWindowWithTitle(String getCurrentPageTitle) {
		// Switching to new window
		String firstWindow = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();
	Iterator <String> windowsIterator = allWindows.iterator();

		while (windowsIterator.hasNext()) {
			String windowHandle = windowsIterator.next().toString();
			if (!windowHandle.equals(firstWindow)) {
				driver.switchTo().window(windowHandle);
				if (getCurrentPageTitle().equals(getCurrentPageTitle)) {
					break;
				}
			}
		}
	}
		
		/** Get title of current page */
		public String getCurrentPageTitle() {
			return driver.getTitle();
			
		}
		
		public void switchToframe()
		{
		//	driver.switchTo().frame(null);
			
		}
		
		/** Press Key using Actions class */
		public void pressKeyWithActions(Keys key) {
			//log.info("Pressing " + key.name() + " using Actions class");
			Actions action = new Actions(driver);
			action.sendKeys(key).build().perform();
			
		}
	
}
