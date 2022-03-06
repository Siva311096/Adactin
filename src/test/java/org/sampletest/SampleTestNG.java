package org.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestNG {

	WebDriver driver;
	
	@BeforeClass
	private void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		
	}
	
	@Parameters({"username","password"})
	@Test 		//login page
	private void tc01(String name, String pass) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(name);
		WebElement txtPassWord = driver.findElement(By.id("password"));
		txtPassWord.sendKeys(pass);
		WebElement btnlick = driver.findElement(By.id("login"));
		btnlick.click();
	}
	
	
@Parameters({"location","hotel","roomType","roomNos","adultRoom","childRoom"})
@Test	//search hotels
private void tc02(int location, int hotel, int roomType, int roomNos, int adultRoom, int childRoom) {
	WebElement dDbLocation = driver.findElement(By.id("location"));
	Select select = new Select(dDbLocation);
	select.selectByIndex(location);
	WebElement dDnHotel = driver.findElement(By.id("hotels"));
	Select select1 = new Select(dDnHotel);
	select1.selectByIndex(hotel);
	WebElement dDnRoom = driver.findElement(By.id("room_type"));
	Select select2 = new Select(dDnRoom);
	select2.selectByIndex(roomType);
	WebElement dDnRoomNo = driver.findElement(By.id("room_nos"));
	Select select3 = new Select(dDnRoomNo);
	select3.selectByIndex(roomNos);
	WebElement dDnAdults = driver.findElement(By.id("adult_room"));
	Select select4 = new Select(dDnAdults);
	select4.selectByIndex(adultRoom);
	WebElement dDnChild = driver.findElement(By.id("child_room"));
	Select select5 = new Select(dDnChild);
	select5.selectByIndex(childRoom);
	WebElement btnSubmit = driver.findElement(By.id("Submit"));
	btnSubmit.click();
}
@Test 	//select hotels
private void tc03() {
	WebElement clkSelect = driver.findElement(By.id("radiobutton_0"));
	clkSelect.click();
	WebElement btnContinue = driver.findElement(By.id("continue"));
	btnContinue.click();
}
@Parameters({"firstname","lastname","address","ccnum","creditType","expMonth","expMonth","cccvv"})
@Test //book hotel
private void tc04(String firstname, String lastname, String address, String ccnum, int creditType, int expMonth, int expYear, String cccvv) {
			WebElement txtFName = driver.findElement(By.id("first_name"));
			txtFName.sendKeys(firstname);
			WebElement txtLName = driver.findElement(By.id("last_name"));
			txtLName.sendKeys(lastname);
			WebElement txtAddress = driver.findElement(By.id("address"));
			txtAddress.sendKeys(address);
			WebElement txtCredit = driver.findElement(By.id("cc_num"));
			txtCredit.sendKeys(ccnum);
			WebElement dDnCreditType = driver.findElement(By.id("cc_type"));
			Select select6 = new Select(dDnCreditType);
			select6.selectByIndex(creditType);
			WebElement dDnMonth = driver.findElement(By.id("cc_exp_month"));
			Select select7 = new Select(dDnMonth);
			select7.selectByIndex(expMonth);
			WebElement dDnYear = driver.findElement(By.id("cc_exp_year"));
			Select select8 = new Select(dDnYear);
			select8.selectByIndex(expYear);		
			WebElement txtCVV = driver.findElement(By.id("cc_cvv"));
			txtCVV.sendKeys(cccvv);
			WebElement btnBook = driver.findElement(By.id("book_now"));
			btnBook.click();
}

@Test
private void tc05() throws Exception {
	Thread.sleep(5000);
	WebElement txtOrderNo = driver.findElement(By.id("order_no"));
	String OrderNo = txtOrderNo.getAttribute("value");
	System.out.println(OrderNo);
}

@AfterClass
private void afterClass() {
	driver.quit();
}







}
