package org.pom;

import org.add.Class2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends Class2{
	
	public BookHotel() {
		PageFactory.initElements(driver, this);
			}
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccnum;

	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccexpmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccexpyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cccvv;
	
	@FindBy(id="book_now")
	private WebElement booknow;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCccvv() {
		return cccvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	public void bookhotel(String firstname, String lastname,String address,String ccnum,String cctype,String ccexpmonth,int ccexpyear,String cccvv) {
		type(getFirstname(), firstname);
		type(getLastname(), lastname);
	    type(getAddress(), address);
	    type(getCcnum(), ccnum);
        selectoptionbytext(getCctype(), cctype);
        selectoptionbytext(getCcexpmonth(), ccexpmonth);
        selectoptionbyindex(getCcexpyear(), ccexpyear);
        type(getCccvv(), cccvv);
     click(booknow);
	}
	}
