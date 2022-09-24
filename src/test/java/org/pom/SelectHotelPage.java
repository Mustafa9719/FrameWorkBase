package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass{
	public SelectHotelPage() {
PageFactory.initElements(driver, this);
	}
	@FindBy(id="Submit")
	private WebElement btnRadio;
	public WebElement getBtnRadio() {
		return btnRadio;
	}
	public void selectHotel() {
		elementClick(getBtnRadio());
	}

}
