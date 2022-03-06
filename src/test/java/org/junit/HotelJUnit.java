package org.junit;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelJUnit extends BaseClass {
	//recheck assertion
	static WebDriver driver;
	BaseClass baseClass=new BaseClass();

	@BeforeClass
	public static void beforeClass() {
		browserLaunch();
		url("http://adactinhotelapp.com/");
		maxWindow();
	}
	
	@AfterClass
	public static void afterClass() {
		closeAllWindows();
	}
	
	@Before
	public void beforeMethod() throws Exception {
//	TakesScreenshot screenshot=(TakesScreenshot)driver;
//	File s = screenshot.getScreenshotAs(OutputType.FILE);
//	File d = new File("C:\\Users\\win 10\\Desktop\\Screenshot\\before.png");
//	FileUtils.copyFile(s, d);
//	
	}
	
	@After
	public void afterMethod() throws Exception {
//			TakesScreenshot screenshot=(TakesScreenshot)driver;
//			File s = screenshot.getScreenshotAs(OutputType.FILE);
//			File d = new File("C:\\Users\\win 10\\Desktop\\Screenshot\\after.png");
//			FileUtils.copyFile(s, d);
	}
	
	@Test
	public void test() throws Exception {		
		WebElement txtUser = findLocatorById("username");
		String userName = getData("Sheet1", 1, 0);
		insertValues(txtUser, userName);
		WebElement txtPass =findLocatorById("password");
		String passWord = getData("Sheet1", 1, 1);
		insertValues(txtPass, passWord);
		WebElement btnClick = findLocatorById("login");
		clkBtn(btnClick);
		
//		WebElement txtWelcome = findLocatorByXpath("//td[text()='Welcome to Adactin Group of Hotels']");
//		String welcomeOnePage = getText(txtWelcome);
//		String page1 = getData("Sheet1", 1, 12);
//		boolean b = welcomeOnePage.contains(page1);
//		Assert.assertTrue("successfully gone to 1st page", b);
//		sleep(5000);
		
		WebElement dDnLocation = findLocatorById("location");
		dDnByIndex(dDnLocation, 1);
		WebElement dDnHotel = findLocatorById("hotels");
		dDnByIndex(dDnHotel, 1);
		WebElement dDnRoomType = findLocatorById("room_type");
		dDnByIndex(dDnRoomType, 1);
		WebElement dDnRoomNos = findLocatorById("room_nos");
		dDnByIndex(dDnRoomNos, 1);
		WebElement dDnAdultRoom = findLocatorById("adult_room");
		dDnByIndex(dDnAdultRoom, 1);
		WebElement dDnChildRoom = findLocatorById("child_room");
		dDnByIndex(dDnChildRoom, 1);
		WebElement btnSubmit = findLocatorById("Submit");
		clkBtn(btnSubmit);
		
		sleep(5000);

		WebElement clkChechBox = findLocatorById("radiobutton_0");
		clkBtn(clkChechBox);
		WebElement btnContinue = findLocatorById("continue");
		clkBtn(btnContinue);
		
		sleep(5000);
		
		WebElement txtFirstName = findLocatorById("first_name");
		String firstName = getData("sheet1", 1, 4);
		insertValues(txtFirstName, firstName);
		WebElement txtLastName = findLocatorById("last_name");
		String lastName = getData("Sheet1", 1, 5);
		insertValues(txtLastName, lastName);
		WebElement txtAddress = findLocatorById("address");
		String address = getData("Sheet1", 1, 6);
		insertValues(txtAddress, address);
		WebElement txtCVV = findLocatorById("cc_num");
		String ccNum = getData("Sheet1", 1, 7);
		insertValues(txtCVV, ccNum);
		WebElement dDnCCType = findLocatorById("cc_type");
		dDnByIndex(dDnCCType, 1);
		WebElement dDnCCExpMonth = findLocatorById("cc_exp_month");
		dDnByIndex(dDnCCExpMonth, 5);
		WebElement dDnCCExpYear = findLocatorById("cc_exp_year");
		dDnByIndex(dDnCCExpYear, 12);
		WebElement txtCCCvvNo = findLocatorById("cc_cvv");
		String CCCvvNo = getData("Sheet1", 1, 8);
		insertValues(txtCCCvvNo, CCCvvNo);
		WebElement btnBook = findLocatorById("book_now");
		clkBtn(btnBook);
		
		sleep(5000);
		
		WebElement txtOrderNo = findLocatorById("order_no");
		String OrderNo = getAttributeValue(txtOrderNo);
		writeData("Sheet1", 1, 10, OrderNo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	
	

}
