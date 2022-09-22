package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;

public class HotelBooking {
	public void booking() throws Exception {
		BaseClass baseClass = new BaseClass();
		baseClass.driverChromeWebDriver();
		baseClass.loadUrl("https://adactinhotelapp.com/");
		WebElement element = baseClass.elementFindElementById("username");
		baseClass.elementPassValue(element, "MohamedMustafa97");
		WebElement element2 = baseClass.elementFindElementById("password");
		baseClass.elementPassValue(element2, "Mustafa97");
		WebElement element3 = baseClass.elementFindElementById("login");
		baseClass.elementClick(element3);
		Thread.sleep(3000);
		WebElement element4 = baseClass.elementFindElementById("location");
		String readValueFromExcel = baseClass.readValueFromExcel("Adactin", 1, 2);
		baseClass.selectOptionByText(element4, readValueFromExcel);
		WebElement element5 = baseClass.elementFindElementById("hotels");
		String readValueFromExcel1 = baseClass.readValueFromExcel("Adactin", 1, 3);
		baseClass.selectOptionByText(element5, readValueFromExcel1);
		WebElement element6 = baseClass.elementFindElementById("room_type");
		String readValueFromExcel2 = baseClass.readValueFromExcel("Adactin", 1, 4);
		baseClass.selectOptionByText(element6, readValueFromExcel2);
		WebElement element7 = baseClass.elementFindElementById("room_nos");
		String readValueFromExcel3 = baseClass.readValueFromExcel("Adactin", 1, 5);
		baseClass.selectOptionByText(element7, readValueFromExcel3);
		WebElement element8 = baseClass.elementFindElementById("datepick_in");
		String readValueFromExcel4 = baseClass.readValueFromExcel("Adactin", 1, 6);
		baseClass.elementPassValue(element8, readValueFromExcel4);
		WebElement element9 = baseClass.elementFindElementById("datepick_out");
		String readValueFromExcel5 = baseClass.readValueFromExcel("Adactin", 1, 7);
		baseClass.elementPassValue(element9, readValueFromExcel5);
		WebElement element10 = baseClass.elementFindElementById("adult_room");
		String readValueFromExcel6 = baseClass.readValueFromExcel("Adactin", 1, 8);
		baseClass.selectOptionByText(element10, readValueFromExcel6);
		WebElement element11 = baseClass.elementFindElementById("child_room");
		String readValueFromExcel7 = baseClass.readValueFromExcel("Adactin", 1, 9);
		baseClass.selectOptionByText(element11, readValueFromExcel7);
		WebElement element12 = baseClass.elementFindElementById("Submit");
		baseClass.elementClick(element12);
		WebElement element13 = baseClass.elementFindElementById("radiobutton_0");
		baseClass.elementClick(element13);
		WebElement element14 = baseClass.elementFindElementById("continue");
		baseClass.elementClick(element14);
		Thread.sleep(3000);
		WebElement element15 = baseClass.elementFindElementById("first_name");
		String readValueFromExcel8 = baseClass.readValueFromExcel("Adactin", 1, 11);
		baseClass.elementPassValue(element15, readValueFromExcel8);
		WebElement element16 = baseClass.elementFindElementById("last_name");
		String readValueFromExcel9 = baseClass.readValueFromExcel("Adactin", 1, 12);
		baseClass.elementPassValue(element16, readValueFromExcel9);
		WebElement element17 = baseClass.elementFindElementById("address");
		String readValueFromExcel10 = baseClass.readValueFromExcel("Adactin", 1, 13);
		baseClass.elementPassValue(element17, readValueFromExcel10);
		WebElement element18 = baseClass.elementFindElementById("cc_num");
		String readValueFromExcel11 = baseClass.readValueFromExcel("Adactin", 1, 14);
		baseClass.elementPassValue(element18, readValueFromExcel11);
		WebElement element23 = baseClass.elementFindElementById("cc_type");
		String readValueFromExcel15 = baseClass.readValueFromExcel("Adactin", 1, 15);
		baseClass.selectOptionByText(element23, readValueFromExcel15);
		WebElement element19 = baseClass.elementFindElementById("cc_exp_month");
		String readValueFromExcel12 = baseClass.readValueFromExcel("Adactin", 1, 16);
		baseClass.selectOptionByText(element19, readValueFromExcel12);
		Thread.sleep(3000);
		WebElement element20 = baseClass.elementFindElementById("cc_exp_year");
		String readValueFromExcel13 = baseClass.readValueFromExcel("Adactin", 1, 17);
		baseClass.selectOptionByText(element20, readValueFromExcel13);
		WebElement element21 = baseClass.elementFindElementById("cc_cvv");
		String readValueFromExcel14 = baseClass.readValueFromExcel("Adactin", 1, 18);
		baseClass.elementPassValue(element21, readValueFromExcel14);
		WebElement element22 = baseClass.elementFindElementById("book_now");
		baseClass.elementClick(element22);
		Thread.sleep(7000);
		WebElement element24 = baseClass.elementFindElementById("order_no");
		String value = baseClass.getValue(element24);
		System.out.println(value);
		baseClass.insertDataIncell("Adactin", 1, 10, value);

	}

	public static void main(String[] args) throws Exception {
		HotelBooking hb = new HotelBooking();
		hb.booking();
	}

}
