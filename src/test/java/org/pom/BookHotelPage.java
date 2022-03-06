package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCCNum;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCcCvv;
	
	@FindBy (id="cc_type")
	private WebElement dDnCcType;
	
	@FindBy (id="cc_exp_month")
	private WebElement dDnCcExpMonth;
	
	@FindBy (id="cc_exp_year")
	private WebElement dDnCcExpYear;
	
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCCNum() {
		return txtCCNum;
	}

	public WebElement getTxtCcCvv() {
		return txtCcCvv;
	}

	public WebElement getdDnCcType() {
		return dDnCcType;
	}

	public WebElement getdDnCcExpMonth() {
		return dDnCcExpMonth;
	}

	public WebElement getdDnCcExpYear() {
		return dDnCcExpYear;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	@FindBy(id="book_now")
	private WebElement btnBookNow;
		
	public void BookHotel(String firstName, String lastName, String address, String cCNum, String cCType, String cCExpMon, String cCExpYear, String cCCvv) throws Exception {		
		insertValues(getTxtFirstName(), firstName);
		insertValues(getTxtLastName(), lastName);
		insertValues(getTxtAddress(), address);
		insertValues(getTxtCCNum(), cCNum);
		dDnByText(getdDnCcType(), cCType);
		dDnByText(getdDnCcExpMonth(), cCExpMon);
		dDnByText(getdDnCcExpYear(), cCExpYear);
		insertValues(getTxtCcCvv(), cCCvv);
		clkBtn(getBtnBookNow());
		sleep(7000);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
