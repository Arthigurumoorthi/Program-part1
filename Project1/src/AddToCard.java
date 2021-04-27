import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class AddToCard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.makemytrip.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@placeholder='From']")).click();
driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
WebDriverWait wait=new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/div/input")))
driver.close();
	}

}
