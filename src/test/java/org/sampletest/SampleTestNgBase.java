package org.sampletest;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestNgBase extends BaseClass {
	
	WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		browserLaunch();;
		url("http://adactinhotelapp.com/");
		maxWindow();
		
	}
	
	@Test 		//login page
	private void tc01() throws Exception {
		WebElement txtUser = findLocatorById("username");
		String name = getData("Sheet1", 1, 0);
		insertValues(txtUser, name);
		WebElement txtPass =findLocatorById("password");
		String pass = getData("Sheet1", 1, 1);
		insertValues(txtPass, pass);
		WebElement btnClick = findLocatorById("login");
		clkBtn(btnClick);
	}
	@Test //search hotel
	private void tc02() throws Exception {
		WebElement dDnLocation = findLocatorById("location");
		String location = getData("Sheet1", 6, 0);
		dDnByText(dDnLocation, location);
		WebElement dDnHotel = findLocatorById("hotels");
		String hotel = getData("Sheet1", 6, 1);
		dDnByText(dDnHotel, hotel);
		WebElement dDnRoomType = findLocatorById("room_type");
		String roomType = getData("Sheet1", 6, 2);
		dDnByText(dDnRoomType, roomType);		
		WebElement dDnRoomNos = findLocatorById("room_nos");
		String roomNos = getData("Sheet1", 6, 3);
		dDnByText(dDnRoomNos, roomNos);
		WebElement dDnAdultRoom = findLocatorById("adult_room");
		String adultRoom = getData("Sheet1", 6, 4);
		dDnByText(dDnAdultRoom, adultRoom);
		WebElement dDnChildRoom = findLocatorById("child_room");
		String childrenRoom = getData("Sheet1", 6, 5);
		dDnByText(dDnChildRoom, childrenRoom);
		WebElement btnSubmit = findLocatorById("Submit");
		clkBtn(btnSubmit);
	}
	
	@Test //select hotel
	private void tc03() {
		WebElement clkChechBox = findLocatorById("radiobutton_0");
		clkBtn(clkChechBox);
		WebElement btnContinue = findLocatorById("continue");
		clkBtn(btnContinue);
		
	}
	
	@Test //book hotel
	private void tc04() throws Exception {
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
		String cCType = getData("Sheet1", 6, 6);
		dDnByText(dDnCCType, cCType);
		WebElement dDnCCExpMonth = findLocatorById("cc_exp_month");
		String cCExpMon = getData("Sheet1", 6, 7);
		dDnByText(dDnCCExpMonth, cCExpMon);
		WebElement dDnCCExpYear = findLocatorById("cc_exp_year");
		//String cCExpYear = getData("Sheet1", 6, 8);
		dDnByattribute(dDnCCExpYear, "2022");
		WebElement txtCCCvvNo = findLocatorById("cc_cvv");
		String CCCvvNo = getData("Sheet1", 1, 8);
		insertValues(txtCCCvvNo, CCCvvNo);
		WebElement btnBook = findLocatorById("book_now");
		clkBtn(btnBook);
	}
	
	@Test // order id
	private void tc05() throws Exception {

		sleep(10000);
		WebElement txtOrderNo = findLocatorById("order_no");
		String OrderNo = getAttributeValue(txtOrderNo);
		System.out.println(OrderNo);
	}
	
	
}
