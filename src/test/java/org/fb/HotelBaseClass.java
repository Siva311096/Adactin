package org.fb;

import javax.management.BadAttributeValueExpException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;

public class HotelBaseClass {
	
public static void main(String[] args) throws Exception {
	BaseClass baseClass=new BaseClass();
	baseClass.browserLaunch();
	baseClass.url("http://adactinhotelapp.com/");
	
	baseClass.sleep(2000);
	
	WebElement txtUser = baseClass.findLocatorById("username");
	String userName = baseClass.getData("Sheet1", 1, 0);
	baseClass.insertValues(txtUser, userName);
	WebElement txtPass = baseClass.findLocatorById("password");
	String passWord = baseClass.getData("Sheet1", 1, 1);
	baseClass.insertValues(txtPass, passWord);
	WebElement btnClick = baseClass.findLocatorById("login");
	baseClass.clkBtn(btnClick);
	
	baseClass.sleep(5000);
	
	WebElement dDnLocation = baseClass.findLocatorById("location");
	baseClass.dDnByIndex(dDnLocation, 1);
	WebElement dDnHotel = baseClass.findLocatorById("hotels");
	baseClass.dDnByIndex(dDnHotel, 1);
	WebElement dDnRoomType = baseClass.findLocatorById("room_type");
	baseClass.dDnByIndex(dDnRoomType, 1);
	WebElement dDnRoomNos = baseClass.findLocatorById("room_nos");
	baseClass.dDnByIndex(dDnRoomNos, 1);
//	WebElement txtCheckIn = baseClass.findLocatorById("datepick_in");
//	baseClass.clearData(txtCheckIn);
//	String checkIn = baseClass.getData("Sheet1", 1, 2);
//	baseClass.insertValues(txtCheckIn, checkIn);
//	WebElement txtCheckOut = baseClass.findLocatorById("datepick_out");
//	baseClass.clearData(txtCheckOut);
//	String checkOut = baseClass.getData("Sheet1", 1, 3);
//	baseClass.insertValues(txtCheckOut, checkOut);
	WebElement dDnAdultRoom = baseClass.findLocatorById("adult_room");
	baseClass.dDnByIndex(dDnAdultRoom, 1);
	WebElement dDnChildRoom = baseClass.findLocatorById("child_room");
	baseClass.dDnByIndex(dDnChildRoom, 1);
	WebElement btnSubmit = baseClass.findLocatorById("Submit");
	baseClass.clkBtn(btnSubmit);
	
	baseClass.sleep(5000);
	
	
	WebElement clkChechBox = baseClass.findLocatorById("radiobutton_0");
	baseClass.clkBtn(clkChechBox);
	WebElement btnContinue = baseClass.findLocatorById("continue");
	baseClass.clkBtn(btnContinue);
	
	baseClass.sleep(5000);
	
	
	WebElement txtFirstName = baseClass.findLocatorById("first_name");
	String firstName = baseClass.getData("sheet1", 1, 4);
	baseClass.insertValues(txtFirstName, firstName);
	WebElement txtLastName = baseClass.findLocatorById("last_name");
	String lastName = baseClass.getData("Sheet1", 1, 5);
	baseClass.insertValues(txtLastName, lastName);
	WebElement txtAddress = baseClass.findLocatorById("address");
	String address = baseClass.getData("Sheet1", 1, 6);
	baseClass.insertValues(txtAddress, address);
	WebElement txtCVV = baseClass.findLocatorById("cc_num");
	String ccNum = baseClass.getData("Sheet1", 1, 7);
	baseClass.insertValues(txtCVV, ccNum);
	WebElement dDnCCType = baseClass.findLocatorById("cc_type");
	baseClass.dDnByIndex(dDnCCType, 1);
	WebElement dDnCCExpMonth = baseClass.findLocatorById("cc_exp_month");
	baseClass.dDnByIndex(dDnCCExpMonth, 5);
	WebElement dDnCCExpYear = baseClass.findLocatorById("cc_exp_year");
	baseClass.dDnByIndex(dDnCCExpYear, 12);
	WebElement txtCCCvvNo = baseClass.findLocatorById("cc_cvv");
	String CCCvvNo = baseClass.getData("Sheet1", 1, 8);
	baseClass.insertValues(txtCCCvvNo, CCCvvNo);
	WebElement btnBook = baseClass.findLocatorById("book_now");
	baseClass.clkBtn(btnBook);
	
	baseClass.sleep(5000);
	
	
	WebElement txtOrderNo = baseClass.findLocatorById("order_no");
	String OrderNo = baseClass.getAttributeValue(txtOrderNo);
	baseClass.writeData("Sheet1", 1, 10, OrderNo);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
