package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	
	//two dimension array
	String [] [] data={
			{"sylix","admin"},
	        {"sylix1","admin1"},
	        {"sylix1","admin"},
	        {"sylix","admin1"}
	};
	
	@DataProvider(name = "Loginpage")
	public String[][] Logindataprovider() {
		//Need to return data using data provider
		return data;
		
		
	}
	
	@Test(dataProvider = "Loginpage")
	public void loginwithbothcrt(String Username, String Password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://brm.tremplintech.in/web_pages/login.aspx");
		
		WebElement us= d.findElement(By.id("txt_unam"));
		us.sendKeys(Username);
		WebElement pw = d.findElement(By.id("txt_pass"));
		pw.sendKeys(Password);
		
		WebElement Login= d.findElement(By.id("Button3"));
		Login.click();
		d.quit();
}}
