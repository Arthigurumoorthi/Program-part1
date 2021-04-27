package script;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Hellooooo {

	

	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.amazon.com/");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
    TakesScreenshot screen = (TakesScreenshot) d;
	File file = screen.getScreenshotAs(OutputType.FILE);
	File demo = new File("E:\\screens.png");
	FileHandler.copy(file, demo);
	
	Robot robot = new Robot();
	Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rectangle = new Rectangle(size);
	BufferedImage source = robot.createScreenCapture(rectangle);
	
	File were = new File("E:\\fullscreens.png");
	ImageIO.write(source, "png", were);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
