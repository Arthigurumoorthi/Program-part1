package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver d;
	long starttime;
	long endtime;
	@BeforeSuite
	public void launchbrower() {
		starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Driver\\chromedriver.exe");
		d = new ChromeDriver();
		}
   
	@Test(priority=0)
	public void opengoogle() {
		d.get("https://www.google.co.in");
		}
	
	@Test(priority=1)
	public void openbing() {
		d.get("https://www.bing.com");
		}
    
	@Test(priority=2)
	public void opengmail() {
		d.get("https://www.gmail.com");
		}
		
	    @AfterSuite
		public void exitbrower() {
	    	//d.quit();
	    	endtime = System.currentTimeMillis();
			long totaltime = endtime-starttime;
			System.out.println("Total time taken"+totaltime);
			
		}
}

