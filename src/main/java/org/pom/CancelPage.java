package org.pom;

import org.add.Class2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelPage extends Class2 {
	
	public CancelPage() {
		PageFactory.initElements(driver, this);
	}
          @FindBy(xpath="//a[@href='BookedItinerary.php']")
          private WebElement bookbtn;
          
          @FindBy(id="btn_id_555605")
          private WebElement clkcancel;

		public WebElement getBookbtn() {
			return bookbtn;
		}

		public WebElement getClkcancel() {
			return clkcancel;
		}
          
          public void cancelpage() {
        	 click(bookbtn);
        	  click(clkcancel);

		}

}
