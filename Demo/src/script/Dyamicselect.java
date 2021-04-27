package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyamicselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.makemytrip.com/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.findElement(By.id("fromCity")).click();
		d.findElement(By.id("react-autowhatever-1-section-0-item-4")).click();
		WebElement dom = d.findElement(By.id("toCity"));
		dom.sendKeys("Mumbai");
		dom.click();
	}

}








