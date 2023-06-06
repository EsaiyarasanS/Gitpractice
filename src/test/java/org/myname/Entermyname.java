package org.myname;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Entermyname {
@Test
public void booking() throws IOException {
	File file = new File("C:\\Users\\gopika\\eclipse-workspace\\Fwcnew\\Excel\\login details.xlsx");
	FileInputStream fileInputStream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(fileInputStream);
	org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("SheetName");
	Row row = sheet.getRow(1);
	Cell cell = row.createCell(12);
	cell.setCellValue("name");
	FileOutputStream fs=new FileOutputStream(file);
	workbook.write(fs);
	
}}

