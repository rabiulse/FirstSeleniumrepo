package Base;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class captureScreenshot {

	public static void captureScreenshotM(WebDriver driver, String testName) {

		try {

			TakesScreenshot ts = (TakesScreenshot) driver;

			File source = ts.getScreenshotAs(OutputType.FILE);
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			File destination = new File("./Screenshots/" + testName + "_" + timestamp + ".png");

			FileUtils.copyFile(source, destination);

			System.out.println("Screenshot saved: " + destination.getAbsolutePath());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
