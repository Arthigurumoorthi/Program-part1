package script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class POI {
	static List<String> username=new ArrayList<String>();
	static List<String> password=new ArrayList<String>();
	
	
	
	 public void readexcel() throws IOException{
		 FileInputStream book = new FileInputStream("C:\\Users\\admin\\Desktop\\TestData.xlsx");
		 Workbook data = new XSSFWorkbook(book);
		 Sheet sheet = data.getSheetAt(0);//index
		 Iterator<Row> row =sheet.iterator();
		 while(row.hasNext()){
			Row rowvalue= row.next();
			Iterator<Cell> column =rowvalue.iterator();
			int i=2;
			while(column.hasNext()) {
				if(i%2==0) {
//					Cell UserName=column.next();
//					Cell PassWord=column.next();
					username.add(column.next().toString());
					password.add(row.next().toString());
				}
				else {
					
				}
				i++;
				
			}
		 }
	 }
	 public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
              POI usingPoi= new POI();
              usingPoi.readexcel();
              System.out.println("username List"+username);
              System.out.println("username List"+password);
              
	}
	 

}
