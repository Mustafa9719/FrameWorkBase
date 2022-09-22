package org.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownExcel {
	public static void main(String[] args) throws IOException, Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		WebElement element = driver.findElement(By.id("country-list"));
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		Workbook workbook = new XSSFWorkbook();
		File file = new File("C:\\Users\\Mustafa\\eclipse-workspace\\FrameworkClass\\Excel\\New Workbook.xlsx");
		
		Sheet sheet = workbook.createSheet("CountryList");
		// Row row = sheet.createRow(0);
		// Cell cell = row.createCell(0);
		// cell.setCellValue("COUNTRY LIST");
		
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			
			Row createRow = sheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(text);
			
			FileOutputStream fos =new FileOutputStream(file);
			workbook.write(fos);
			

			}

	}

}
