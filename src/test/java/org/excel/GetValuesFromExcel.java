package org.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetValuesFromExcel {
	public static void main(String[] args) throws IOException {
		FileInputStream stream = new FileInputStream(
				"C:\\\\Users\\\\Mustafa\\\\eclipse-workspace\\\\FrameworkClass\\\\Excel\\\\Sample1.xlsx");

		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
//		System.out.println(cell);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();
				switch (type) {
				case STRING:
					String value = cell.getStringCellValue();
					System.out.println(value);
					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat dateFormat =  new SimpleDateFormat("dd-MMM-yyyy");
						String format = dateFormat.format(date);
						System.out.println(format);
					} else {
						double cellValue = cell.getNumericCellValue();
						BigDecimal bigDecimal = BigDecimal.valueOf(cellValue);
						String string = bigDecimal.toString();
						System.out.println(string);

					}

				default:
					break;
				}

			}

		}

	}
}
