package org.pom;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPage extends BaseClass {

	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_id_text")
	private WebElement txtOrderId;
	
	@FindBy(id="check_all")
	private WebElement clkAll;
	
	public WebElement getClkAll() {
		return clkAll;
	}

	@FindBy(id="search_hotel_id")
	private WebElement clkSearchHotel;
	
	@FindBy(name="cancelall")
	private WebElement btnCancel;

	public WebElement getTxtOrderId() {
		return txtOrderId;
	}

	public WebElement getClkSearchHotel() {
		return clkSearchHotel;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}
	
	public void CancelBooking() throws Exception {
		String orderId = getData("Sheet1", 1, 9);
		insertValues(getTxtOrderId(), orderId);
		clkBtn(clkSearchHotel);
		clkBtn(clkAll);
		
		//String orderId1 = getData("Sheet1", 1, 9);
		clkBtn(getBtnCancel());
		okAlert();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
