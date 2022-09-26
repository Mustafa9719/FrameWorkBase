package org.pom;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

public class BookHotelPage extends BaseClass {

	@BeforeClass
	public static void beforeClass() {
		driverChromeWebDriver();
		loadUrl("https://adactinhotelapp.com/");
	}

	// @AfterClass
	// public static void afterClass() {
	// allWinClose();
	// }
	@Test
	public void bookin() throws IOException, InterruptedException {
		LoginPage loginPage = new LoginPage();
		loginPage.login(readValueFromExcel("Adactin", 1, 0), readValueFromExcel("Adactin", 1, 1));
		SearchHotelPage hotelPage = new SearchHotelPage();
		hotelPage.searchHotel(readValueFromExcel("Adactin", 1, 2), readValueFromExcel("Adactin", 1, 3),
				readValueFromExcel("Adactin", 1, 4), readValueFromExcel("Adactin", 1, 5),
				readValueFromExcel("Adactin", 1, 6), readValueFromExcel("Adactin", 1, 7),
				readValueFromExcel("Adactin", 1, 8), readValueFromExcel("Adactin", 1, 9));
		SelectHotelPage hotelPage2 = new SelectHotelPage();
		hotelPage2.selectHotel();
		BookingConfirmPage bookingConfirmPage = new BookingConfirmPage();
		bookingConfirmPage.bookPage(readValueFromExcel("Adactin", 1, 11), readValueFromExcel("Adactin", 1, 12),
				readValueFromExcel("Adactin", 1, 13), readValueFromExcel("Adactin", 1, 14),
				readValueFromExcel("Adactin", 1, 15), readValueFromExcel("Adactin", 1, 16),
				readValueFromExcel("Adactin", 1, 17), readValueFromExcel("Adactin", 1, 18));
		CancelBookingPage cancelBooking = new CancelBookingPage();
		cancelBooking.cancelOrder(readValueFromExcel("Adactin", 1, 10));
	}
}
