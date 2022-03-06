package org.fb;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

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

public class GreensCart {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenscart.in/#/login?returnUrl=%2F");
		Thread.sleep(8000);
		WebElement findElement = driver.findElement(By.xpath("//input[@value='Register']"));
		findElement.click();
		WebElement dDnMonth = driver.findElement(By.id("month"));
		Select select = new Select(dDnMonth);
		List<WebElement> li = select.getOptions();
		
		
		File file = new File("C:\\\\Users\\\\win 10\\\\eclipse-workspace\\\\SampleeMavennnn\\\\src\\\\excel\\\\BookNew.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		
		for (int i = 0; i < li.size(); i++) {
			WebElement element = li.get(i);
			String text = element.getText();
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
			System.out.println(text);
			
		}
		
		FileOutputStream o = new FileOutputStream(file);
		workbook.write(o);
		
		
		
		
		
		
		
		
		
	}

}
