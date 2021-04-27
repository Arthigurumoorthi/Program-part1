package search;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class AddProduct {
	String[][] data= null;
//	public WritableSheet writablesh;
//	public WritableWorkbook workbookcopy;
	
	
	
	@DataProvider(name="loginData")
		public String[][] dataprovide() throws RowsExceededException, BiffException, WriteException, IOException{
		data=getExceldata();
		return data;
			
		}
	public String[][] getExceldata() throws BiffException, IOException{
		FileInputStream excel = new FileInputStream("‪C:\\Users\\admin\\Desktop\\Testdatas.xls");
		Workbook book = Workbook.getWorkbook(excel);
		Sheet s1 = book.getSheet(0);
		int rows = s1.getRows();
		int column = s1.getColumns();
		
		//FileOutputStream outfile = new FileOutputStream("‪C:\\Users\\admin\\Desktop\\Testdatas.xls");
		//System.out.println("file");
		//workbookcopy = Workbook.createWorkbook(outfile);
		//System.out.println("file two");
		//writablesh = workbookcopy.createSheet("Query_data", 0);
		//System.out.println("file three");
		
		String testdata[][] = new String[rows-1][column];
		for(int i=1; i<rows; i++) {
			for(int j=0; j<column;j++) {
				testdata[i-1][j] = s1.getCell(j, i).getContents();
//				Label one = new Label(i,j,testdata[i-1][j]);
//				Label two = new Label(4,0,"Result");
//				writablesh.addCell(one);
//				writablesh.addCell(two);
			}}
		return testdata;
	}
				
//public void writeaResult() {	
//	try {
//		workbookcopy.write();
//	}catch(IOException e) {
//		e.printStackTrace();
//	}
//	try {
//		workbookcopy.close();
//	}catch(WriteException e) {
//		e.printStackTrace();
//	}catch(IOException e) {
//		e.printStackTrace();
//	}
//}
	@Test(dataProvider = "loginData")
public void Logining(String user, String passwrd) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.amazon.in/");
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.manage().window().maximize();
     WebElement signin = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']"));
     signin.click();
     WebElement Username = driver.findElement(By.id("ap_email"));
     Username.sendKeys(user);
     WebElement cnt = driver.findElement(By.id("continue"));
     cnt.click();
     WebElement Password = driver.findElement(By.id("ap_password"));
     Password.sendKeys(passwrd);
     
     WebElement LoginButton = driver.findElement(By.id("signInSubmit"));
     LoginButton.click();	 
   
}
}
