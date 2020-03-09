package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelData {
	XSSFWorkbook wb;
	public excelData() throws IOException {
	
	File src= new File("./AppTestData/AppData.xlsx");
	FileInputStream excel=  new FileInputStream(src);
	
	wb= new XSSFWorkbook(excel);

}
	
	public String getdata(int sheetindex, int rowNumber, int colNumber) {
		
		String data= wb.getSheetAt(sheetindex).getRow(rowNumber).getCell(colNumber).getStringCellValue();
		return data;
	}
	
	public String getdata(String sheetname, int rowNumber, int colNumber) {
		
		String data= wb.getSheet(sheetname).getRow(rowNumber).getCell(colNumber).getStringCellValue();
		return data;
	}
	
	}