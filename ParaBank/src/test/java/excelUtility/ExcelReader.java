package excelUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	public ExcelReader(String filepath) throws IOException {
		// TODO Auto-generated constructor stub
		FileInputStream fis;
		fis=new FileInputStream(filepath);
		workbook=new XSSFWorkbook(fis);
	}
	public String getStringData(int sheetnumber,int row,int col) {
		sheet=workbook.getSheetAt(sheetnumber);
		String data=sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	public int getIntData(int sheetnumber, int row,int col) {
		sheet=workbook.getSheetAt(sheetnumber);
		int data=(int)sheet.getRow(row).getCell(col).getNumericCellValue();
		return data;
	}
	public int rowCount(int sheetnumber) {
		int rowcount=workbook.getSheetAt(sheetnumber).getLastRowNum();
		return rowcount;
	}
	public int colCount(int sheetnumber) {
		int colCount=workbook.getSheetAt(sheetnumber).getRow(0).getLastCellNum();
		return colCount;
	}
}
