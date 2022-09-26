package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPage extends BaseClass {
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement bookedId;
	@FindBy(id = "order_id_text")
	private WebElement idSearchBox;
	@FindBy(id = "search_hotel_id")
	private WebElement btnGo;
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement cancelCheckBox;
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement btnCancel;

	public WebElement getBookedId() {
		return bookedId;
	}

	public WebElement getIdSearchBox() {
		return idSearchBox;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	public WebElement getCancelCheckBox() {
		return cancelCheckBox;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public void cancelOrder(String text1) throws InterruptedException {

		elementClick(getBookedId());
		threadSleep(2000);
		elementPassValue(getIdSearchBox(), text1);
		elementClick(getBtnGo());
		threadSleep(2000);
		elementClick(getCancelCheckBox());
		elementClick(getBtnCancel());
		accept();

	}

}
