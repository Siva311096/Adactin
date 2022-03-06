package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver  driver;
	
	//write data in excel
	public void writeData(String sheetName, int rowNo, int cellNo, String data) throws IOException {
		File file = new File("C:\\Users\\win 10\\eclipse-workspace\\SampleeMavennnn\\excel\\Hotel.xlsx");
		FileInputStream stream = new  FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(data);
		
		FileOutputStream stream2=new FileOutputStream(file);
		workbook.write(stream2);
		
	}	
	
	
	//getdata from excel
	public String getData(String sheetName, int rowNo, int cellNo) throws IOException {
		String res=null;
		File file = new File("C:\\Users\\win 10\\eclipse-workspace\\SampleeMavennnn\\excel\\Hotel.xlsx");
		FileInputStream stream = new  FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			res  = cell.getStringCellValue();	
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat dateFormat =new SimpleDateFormat("dd/MM/yyyy");
				res = dateFormat.format(date);
				
			} else {
				double d = cell.getNumericCellValue();
				BigDecimal b = BigDecimal.valueOf(d);
				res = b.toString();
			}
			break;
		default:
			break;
			
		}
		return res;

	}
	
	
	//1 load url 
	public static void url(String url) {
		driver.get(url);
			}
	//2 maximise the window
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	public void insertValues(WebElement element, String value) {
		element.sendKeys(value);
	}
	//4 click the button
	public void clkBtn(WebElement element) {
		element.click();
	}
	
	//5 accept the alert
	public void okAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();	
	}
	//8 dismiss the alert
	public void cancelAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();	
	}
	//9 get the text
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	//10.1 get attribute value==============99% used
	public String  getAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	//10.2 get attribute value================rest 1%
//		public String getAttribe1(WebElement element,String attributeName) {
//			String text = element.getAttribute(attributeName);
//			return text;
//		}
	//11 close all window
	public static void closeAllWindows() {
		driver.quit();
	}
	//12 close current window
		public void closeCurrentWindow() {
			driver.close();
		}
	//13 get title
		public String getTitle() {
			String title = driver.getTitle();
			return title;
		}
	//14 get entered url
		public String eneteredUrl() {
			String url = driver.getCurrentUrl();
			return url;
		}
	//15 dropdown  select by text
		public void dDnByText(WebElement element,String text ) {
Select select = new Select(element);
select.selectByVisibleText(text);
		}
	//16 dropdown  select by value
		public void dDnByattribute(WebElement element,String text ) {
			Select select = new Select(element);
			select.selectByValue(text);
				}
	//17 dropdown  select by index
		public void dDnByIndex(WebElement element,int index ) {
			Select select = new Select(element);
			select.selectByIndex(index);
					}
	//18 js txt
	//19 js clk
	//20 doubt
		public static void launchDriver() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	}
	//21 switch frame by index
		public void switchFrameByIndex(int index) {
			driver.switchTo().frame(index);
		}
	//21 switch frame by id
		public void switchFrameById(String id) {
				driver.switchTo().frame(id);
			}
	//22 switch frame by element
		public void switchFrameByWebElement(WebElement element) {
				driver.switchTo().frame(element);
			}
	//23 locator by id
		public WebElement  findLocatorById(String id) {
			WebElement element = driver.findElement(By.id(id));
			return element;
		}
	//24 locator by name
		public WebElement  findLocatorByName(String name) {
			WebElement element = driver.findElement(By.name(name));
			return element;
		}
	//25 locator by classname
		public WebElement  findLocatorByClassName(String name) {
			WebElement element = driver.findElement(By.className(name));
			return element;
			}
	//26 locator by xpath
		public WebElement  findLocatorByXpath(String name) {
			WebElement element = driver.findElement(By.xpath(name));
			return element;
			}
			
	//27 clear data
		public void clearData(WebElement element) {
			element.clear();
		}
	
	//28 sleep
		public void sleep(int time) throws Exception {
			Thread.sleep(time);
		}
		
	//29 launch browser
		public static void browserLaunch() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

	//30 cleardata
		public void clearText(WebElement element) {
			element.clear();
		}
		
	//screenshot
		public void screenshot(String imageName) throws Exception {
			TakesScreenshot screenshot=(TakesScreenshot)driver;
			File s = screenshot.getScreenshotAs(OutputType.FILE);
			File d = new File("C:\\Users\\win 10\\Desktop\\Screenshot\\"+imageName+".png");
			FileUtils.copyFile(s, d);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
