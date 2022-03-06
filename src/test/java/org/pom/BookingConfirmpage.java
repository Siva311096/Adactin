package org.pom;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmpage extends BaseClass {
	public BookingConfirmpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="order_no")
	private WebElement txtOrderNo;

	@FindBy(xpath="//a[@href=\"BookedItinerary.php\"]")
	private WebElement clkBooked;
	
	

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}



	public WebElement getClkBooked() {
		return clkBooked;
	}



	public void bookingConfirm() throws Exception  {
		sleep(10000);
		String orderNo = getAttributeValue(txtOrderNo);
		//System.out.println(attributeValue);
		writeData("Sheet1", 1, 9, orderNo);
		sleep(5000);
		clkBtn(getClkBooked());
		
	}
	
	
	
	
	
	
}
