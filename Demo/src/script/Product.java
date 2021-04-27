package script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Product {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement find = d.findElement(By.id("searchDropdownBox"));
		Select select = new Select(find);
		/*select.selectByIndex(0);*/
		
		List<WebElement> ListOfOptions= select.getOptions();
		int size = ListOfOptions.size();
		System.out.println("No of elements:" + size);
		
		for (int i = 0; i<ListOfOptions.size(); i++) {
			String ListTheItems = ListOfOptions.get(i).getText();
			System.out.println(ListTheItems);
			
			find.sendKeys("Beauty");
			d.findElement(By.id("twotabsearchtextbox")).sendKeys("lipsticks");
			d.findElement(By.xpath("//input[@type='submit']")).click();
			d.findElement(By.xpath("//*[@data-asin='B00N6YEI6O']")).click();
			
		}

	}

}
