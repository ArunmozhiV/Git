package org.pom;

import org.add.Class2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends Class2{
	
	public SearchHotel() {
PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="location")
	private WebElement locate;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="room_nos")
	private WebElement roomno;
	@FindBy(id="adult_room")
	private WebElement adultroom;
	@FindBy(id="child_room")
	private WebElement childroom;
	@FindBy(id="Submit")
	private WebElement clksearch;
	public WebElement getLocate() {
		return locate;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomno() {
		return roomno;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getClksearch() {
		return clksearch;
	}
	public void searchhotel(String locate, String hotel,String roomtype,String roomno,int adultroom,int childroom) {
	selectoptionbytext(getLocate(), locate);
	selectoptionbytext(getHotel(), hotel);
	selectoptionbytext(getRoomtype(), roomtype);
	selectoptionbytext(getRoomno(), roomno);
	selectoptionbyindex(getAdultroom(), adultroom);
	selectoptionbyindex(getChildroom(), childroom);
    click(getClksearch());
	
	
	
	
	

	}
	}
