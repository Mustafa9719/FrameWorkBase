package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement locationName;
	@FindBy(id = "hotels")
	private WebElement hotelName;
	@FindBy(id = "room_type")
	private WebElement roomType;
	@FindBy(id = "room_nos")
	private WebElement roomNum;
	@FindBy(id = "datepick_in")
	private WebElement checkInDate;
	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;
	@FindBy(id = "adult_room")
	private WebElement adultCount;
	@FindBy(id = "child_room")
	private WebElement childCount;
	@FindBy(id = "Submit")
	private WebElement click;

	public WebElement getLocationName() {
		return locationName;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNum() {
		return roomNum;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultCount() {
		return adultCount;
	}

	public WebElement getChildCount() {
		return childCount;
	}

	public void searchHotel(String text1, String text2, String text3, String text4, String date1, String date2,
			String text5, String text6) {
		selectOptionByText(getLocationName(), text1);
		selectOptionByText(getHotelName(), text2);
		selectOptionByText(getRoomType(), text3);
		selectOptionByText(getRoomNum(), text4);
		elementPassValue(getCheckInDate(), date1);
		elementPassValue(getCheckOutDate(), date2);
		selectOptionByText(getAdultCount(), text5);
		selectOptionByText(getChildCount(), text6);
		elementClick(click);
	}

}
