package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
  
	
  
  @Test
	public void opengoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Driver\\chromedriver.exe");
		WebDriver	d = new ChromeDriver();
		d.get("https://www.google.co.in");
		d.quit();
	}
	@Test
	public void openbing() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Driver\\chromedriver.exe");
		WebDriver	d = new ChromeDriver();
		d.get("https://www.bing.com");
		d.quit();
	}
}

