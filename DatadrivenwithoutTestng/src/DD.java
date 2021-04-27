import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DD {
	String [][] data=null;
	WebDriver d;
	
	@DataProvider(name = "details")
	public String[][] Logindataprovider() throws BiffException, IOException {
		data = Excelsheet();
		//Need to return data using data provider
		return data;
	}
		
	public String[][] Excelsheet() throws BiffException, IOException {
			//class 
			FileInputStream excel = new FileInputStream("C:\\Users\\admin\\Documents\\employee Details.xls");
			Workbook book = Workbook.getWorkbook(excel);
			Sheet sheet = book.getSheet(0);
			int rows = sheet.getRows();
			int columns = sheet.getColumns();
			//2 dimension array
			String testdata[][]= new String[rows-1][columns];
			//iterate
			for(int i=1; i<rows; i++) {
				for(int j=0; j<columns; j++){
					//reading and getting
					     //to get content value
					testdata[i-1][j]=sheet.getCell(j, i).getContents();
					}}
	return testdata;
	}
		@BeforeTest
		public void before() {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Driver\\chromedriver.exe");
		d = new ChromeDriver();
		}
		
	@Test(dataProvider = "details")
	public void loginwithbothcrt(String FirstName, String LastName, String Add, String Email, String Phone) {
		d.manage().window().maximize();
		d.get("http://demo.automationtesting.in/register.html");
		
		WebElement fn = d.findElement(By.xpath("//input[@placeholder='First Name']"));
		fn.sendKeys(FirstName);
		WebElement ln=d.findElement(By.xpath("//input[@placeholder='Last Name']"));
		ln.sendKeys(LastName);
		WebElement AD = d.findElement(By.xpath("//*[@ng-model='Adress']"));
		AD.sendKeys(Add);
		WebElement dE = d.findElement(By.xpath("//*[@type='email']"));
		dE.sendKeys(Email);
		WebElement ff = d.findElement(By.xpath("//*[@ng-model='Phone']"));
		ff.sendKeys(Phone);
		
}
    @AfterTest
	public void after() {
		d.quit();
	}
}
