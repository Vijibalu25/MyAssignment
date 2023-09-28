package week6.Day1.TestNGParameterization;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		
XSSFWorkbook wb = new XSSFWorkbook("data/CreateLeadData.xlsx");
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
//		XSSFRow row = sheet.getRow(2);
//		
//		XSSFCell cell = row.getCell(3);
//		System.out.println(cell);
		
		//to get the total number of rows
		int rowCount = sheet.getLastRowNum();
		System.out.println("The total number of rows :" +rowCount);
		
		//to get the total number of columns
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("The total no: of columns: " +columnCount);
		
		//iterate through loop
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue = row.getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
			}
		}
		
		

	}

	
}
