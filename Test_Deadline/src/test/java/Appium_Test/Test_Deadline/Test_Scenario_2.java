package Appium_Test.Test_Deadline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_Scenario_2 extends Appium_First {
	String val1 ;
	String val2 ;
	String val3 ;
	String val4;
	String val5 ;
	String val6 ;
	String val7;
	String val8 ;
	String val9 ;
	String val10 ;
	String val11 ;
	String val12;
	String val13 ;
	
	@Test
	public void Test_Demo_2() throws InterruptedException, IOException{
		
		FileInputStream fs = new FileInputStream("C:\\Users\\shaha\\OneDrive\\Desktop\\InputDaata.xlsx");
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Row row = sheet.getRow(0);
		Row row1 = sheet.getRow(1);
		Row row2 = sheet.getRow(2);
		Row row3 = sheet.getRow(3);
		Row row4 = sheet.getRow(4);
		Row row5 = sheet.getRow(5);
		Row row6 = sheet.getRow(6);
		Row row7 = sheet.getRow(7);
		Row row8 = sheet.getRow(8);
		Row row9 = sheet.getRow(9);
		Row row10 = sheet.getRow(10);
		Row row11 = sheet.getRow(11);
		Row row12 = sheet.getRow(12);
		
		Cell cell = row.getCell(0);
		
		
		 val1 =  sheet.getRow(0).getCell(0).toString();
		 val2 =  sheet.getRow(1).getCell(0).toString();
		 val3 =  sheet.getRow(2).getCell(0).toString();
		 val4 =  sheet.getRow(3).getCell(0).toString();
		 val5 =  sheet.getRow(4).getCell(0).toString();
		 val6 =  sheet.getRow(5).getCell(0).toString();
		 val7 =  sheet.getRow(6).getCell(0).toString();
		 val8 =  sheet.getRow(7).getCell(0).toString();
		 val9 =  sheet.getRow(8).getCell(0).toString();
		 val10 =  sheet.getRow(9).getCell(0).toString();
		 val11 =  sheet.getRow(10).getCell(0).toString();
		 val12 =  sheet.getRow(11).getCell(0).toString();
		 val13 =  sheet.getRow(12).getCell(0).toString();
		
		
	
		//System.out.println(sheet.getRow(1).getCell(0));
		
	
	
		//System.out.println(sheet.getRow(2).getCell(0));
		
	
	
	//System.out.println(sheet.getRow(3).getCell(0));
		
		
		
		
	}
	
}
