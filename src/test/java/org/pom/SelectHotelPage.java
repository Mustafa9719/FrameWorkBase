package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass{
	public SelectHotelPage() {
PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement btnRadio;
	public WebElement getBtnRadio() {
		return btnRadio;
	}
	@FindBy(id="continue")
	private WebElement btnContinue;
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public void selectHotel() {
		elementClick(getBtnRadio());
		elementClick(getBtnContinue());
	}

}
