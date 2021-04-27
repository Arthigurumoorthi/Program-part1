package script;

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

public class Jxlformat {
	String [][] data=null;
	WebDriver d;
	
	@DataProvider(name = "Loginpage")
	public String[][] Logindataprovider() throws BiffException, IOException {
		data = Excelsheet();
		//Need to return data using data provider
		return data;
	}
		
	public String[][] Excelsheet() throws BiffException, IOException {
			//class 
			FileInputStream excel = new FileInputStream("C:\\Users\\admin\\Documents\\testdata.xls");
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
		
	@Test(dataProvider = "Loginpage")
	public void loginwithbothcrt(String Username, String Password) {
		d.manage().window().maximize();
		d.get("http://brm.tremplintech.in/web_pages/login.aspx");
		
		WebElement us= d.findElement(By.id("txt_unam"));
		us.sendKeys(Username);
		WebElement pw = d.findElement(By.id("txt_pass"));
		pw.sendKeys(Password);
		
		WebElement Login= d.findElement(By.id("Button3"));
		Login.click();
		
}
    @AfterTest
	public void after() {
		d.quit();
	}
}
