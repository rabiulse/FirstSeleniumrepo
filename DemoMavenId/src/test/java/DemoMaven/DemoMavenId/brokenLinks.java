package DemoMaven.DemoMavenId;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String homePage = "https://google.com/";
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(homePage);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

			System.out.println(url);

			if (url == null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty" + url);
				continue;
			}

			if (!url.startsWith(homePage)) {
				System.out.println("URL belongs to another domain, skipping it." + url);
				continue;
			}

			try {
				// huc = (HttpURLConnection) (new URL(url).openConnection());

				URLConnection huc1 = (new URL(url).openConnection());

				((HttpURLConnection) huc1).setRequestMethod("HEAD");

				huc1.connect();

				respCode = ((HttpURLConnection) huc1).getResponseCode();

				if (respCode >= 400) {
					System.out.println(url + " is a broken link" + respCode);
				} else {
					System.out.println(url + " is a valid link+" + respCode);
				}

			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		driver.quit();

	}

}