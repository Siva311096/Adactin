package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement clkRadioButton;
	
	@FindBy(id="continue")
	private WebElement btnContinue;
	
	public WebElement getClkRadioButton() {
		return clkRadioButton;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	public void selectHotel() {
		clkBtn(getClkRadioButton());
		clkBtn(getBtnContinue());
	}


}
