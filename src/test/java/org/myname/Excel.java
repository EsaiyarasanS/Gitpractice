package org.myname;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {
public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\gopika\\eclipse-workspace\\Fwcnew\\Excel\\logindetails.xlsx");
	FileInputStream Stream = new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(Stream);
	Sheet sheet = workbook.getSheet("sheet1");
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i); 
	for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
		Cell cell = row.getCell(j);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			String value = cell.getStringCellValue();
			System.out.println(value);
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
	SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-YY");
			String format = dateFormat.format(dateCellValue);
			System.out.println(format);
			}else {
			double value2 = cell.getNumericCellValue();
			BigDecimal b = BigDecimal.valueOf(value2);
			String valueOf = String.valueOf(b);
			System.out.println(valueOf);
			}
			break;	
      default:
			break;
		}
	}
	}
}}
	

	


