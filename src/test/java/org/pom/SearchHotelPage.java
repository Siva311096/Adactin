package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="location")
	private WebElement dDnLocation;
	
	@FindBy (id="hotels")
	private WebElement dDnHotel;
	
	@FindBy (id="room_type")
	private WebElement dDnRoomType;
	
	@FindBy (id="room_nos")
	private WebElement dDnRoomNos;
	
	@FindBy (id="adult_room")
	private WebElement dDnAdultRoom;
	
	@FindBy (id="child_room")
	private WebElement dDnChildrenRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;
	
	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotel() {
		return dDnHotel;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNos() {
		return dDnRoomNos;
	}

	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}

	public WebElement getdDnChildrenRoom() {
		return dDnChildrenRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}	
	
	public void SearchHotel(String location, String hotel, String roomType, String roomNos, String adultRoom, String childrenRoom) {
		dDnByText(getdDnLocation(), location);
		dDnByText(getdDnHotel(), hotel);
		dDnByText(getdDnRoomType(), roomType);
		dDnByText(getdDnRoomNos(), roomNos);
		dDnByText(getdDnAdultRoom(), adultRoom);
		dDnByText(getdDnChildrenRoom(), childrenRoom);
		clkBtn(getBtnSubmit());
			
	}
	
	
	
	

}
