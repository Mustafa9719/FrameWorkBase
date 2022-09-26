package org.pom;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage extends BaseClass {
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstName;
	@FindBy(id = "last_name")
	private WebElement lastName;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement cardNum;
	@FindBy(id = "cc_type")
	private WebElement cardType;
	@FindBy(id = "cc_exp_month")
	private WebElement cardMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement cardYear;
	@FindBy(id = "cc_cvv")
	private WebElement cvvNum;
	@FindBy(id = "book_now")
	private WebElement btnBook;
	@FindBy(id="order_no")
	private WebElement orderId;

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNum() {
		return cardNum;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardMonth() {
		return cardMonth;
	}

	public WebElement getCardYear() {
		return cardYear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}

	public void bookPage(String text1, String text2, String text3, String num1, String text4, String num2, String num3,
			String num4) throws InterruptedException, IOException {
		elementPassValue(getFirstName(), text1);
		elementPassValue(getLastName(), text2);
		elementPassValue(getAddress(), text3);
		elementPassValue(getCardNum(), num1);
		selectOptionByText(getCardType(), text4);
		selectOptionByText(getCardMonth(), num2);
		Thread.sleep(3000);
		selectOptionByText(getCardYear(), num3);
		elementPassValue(getCvvNum(), num4);
		elementClick(getBtnBook());
		Thread.sleep(7000);
		String value = getValue(getOrderId());
		insertDataIncell("Adactin", 1, 10, value);
	}
}
