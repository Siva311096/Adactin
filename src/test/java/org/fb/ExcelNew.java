package org.fb;

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
import org.jsoup.helper.DataUtil;

public class ExcelNew {
public static void main(String[] args) throws IOException {
File file = new File("C:\\Users\\win 10\\eclipse-workspace\\SampleeMavennnn\\excel\\Book2.xlsx");
	
	FileInputStream stream = new FileInputStream(file);
	
	Workbook workbook= new XSSFWorkbook(stream);
	
	Sheet sheet = workbook.getSheet("Sheet1");
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			
			switch (cellType) {
			case STRING:
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat dateFormat =new SimpleDateFormat("dd-MMM-yy");
					String format = dateFormat.format(date);
					System.out.println(format);
					
				} else {
					double d = cell.getNumericCellValue();
					BigDecimal b = BigDecimal.valueOf(d);
					String name = b.toString();
					System.out.println(name);
				}
				break;

			default:
				break;
			}
			
	
}
}
}
}