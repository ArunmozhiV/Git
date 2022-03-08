package test.ng;

import org.add.Class2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends Class2 {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
			}
	
	
	@FindBy(id="radiobutton_0")
	private WebElement clkradianbtn;
	
	@FindBy(id="continue")
	private WebElement clkcontinue;

	public WebElement getClkradianbtn() {
		return clkradianbtn;
	}

	public WebElement getClkcontinue() {
		return clkcontinue;
	}
	
	public void selecthotel() {
	click(getClkradianbtn());
	click(getClkcontinue());
	
		
		

	}
	
	

}