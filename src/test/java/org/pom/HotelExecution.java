package org.pom;

import org.base.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class HotelExecution extends BaseClass {
	
	@BeforeClass
	public static void beforeClass() {
		browserLaunch();;
		url("http://adactinhotelapp.com/");
		maxWindow();
	}

	@AfterClass
	public static void afterclass() {
		//closeAllWindows();
	}	
	@Test
	public void Hotel() throws Exception {
		//loginpage
		LoginPage loginPage = new LoginPage();
		String userName = getData("Sheet1", 1, 0);
		String passWord = getData("Sheet1", 1, 1);		
		loginPage.login(userName, passWord);
		//loginPage.login("Siva3110", "Siva@1996");
		
		//search hotels
		SearchHotelPage searchHotelPage = new SearchHotelPage();
		
		String location = getData("Sheet1", 6, 0);
		String hotel = getData("Sheet1", 6, 1);
		String roomType = getData("Sheet1", 6, 2);
		String roomNos = getData("Sheet1", 6, 3);
		String adultRoom = getData("Sheet1", 6, 4);
		String childrenRoom = getData("Sheet1", 6, 5);
		searchHotelPage.SearchHotel(location, hotel, roomType, roomNos, adultRoom, childrenRoom);
		//searchHotelPage.SearchHotel("Sydney", "Hotel Creek", "Standard", "2 - Two", "2 - Two", "2 - Two");
		
		//select hotel
		SelectHotelPage selectHotelPage=new SelectHotelPage();
		selectHotelPage.selectHotel();
		
		//bookhotel
		BookHotelPage bookHotelPage=new BookHotelPage();
		String firstName = getData("sheet1", 1, 4);
		String lastName = getData("Sheet1", 1, 5);
		String address = getData("Sheet1", 1, 6);
		String cCNum = getData("Sheet1", 1, 7);
		String cCType = getData("Sheet1", 6, 6);
		String cCExpMon = getData("Sheet1", 6, 7);
		//String cCExpYear = getData("Sheet1", 6, 8);
		String cCCvv = getData("Sheet1", 1, 8);
		//bookHotelPage.BookHotel(firstName, lastName, address, cCNum, cCType, cCExpMon, cCExpYear, cCCvv);
		//bookHotelPage.BookHotel("Siva", "Avis", "Chennai", "8888888888888898", "American Express", "December", "2022", "8888");
		bookHotelPage.BookHotel(firstName, lastName, lastName, cCNum, cCType, cCExpMon, "2022", cCCvv);
		sleep(2000);
		
		//bookingconfirm
		BookingConfirmpage bookingConfirm = new BookingConfirmpage();
		bookingConfirm.bookingConfirm();
		
		//cancelbooking
		CancelBookingPage cancelBookingPage = new CancelBookingPage();
		cancelBookingPage.CancelBooking();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
