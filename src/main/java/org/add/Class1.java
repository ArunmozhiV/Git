package org.add;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Class1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		Class2 base =new Class2();
		base.getdriver();
		base.geturl("https://adactinhotelapp.com/");
		base.tomaximize();
		WebElement element = base.findelementbyid("username");
		String username = base.baseclassdata("sheet2", 0, 0);
		base.type(element, username);

		WebElement password = base.findelementbyid("password");
		String userpassword = base.baseclassdata("sheet2", 0, 1);
		base.type(password, userpassword);

		WebElement btnlogin = base.findelementbyid("login");
		base.click(btnlogin);

		WebElement location = base.findelementbyid("location");
		String locateval = base.getstringcellvalue("sheet2", 0, 9);
		base.selectoptionbytext(location, locateval);
		
		WebElement hotels = base.findelementbyid("hotels");
		String selecthotel = base.getstringcellvalue("sheet2", 0, 10);
		base.selectoptionbytext(hotels, selecthotel);

		WebElement roomtype = base.findelementbyid("room_type");
		String selectroomtype = base.getstringcellvalue("sheet2", 0, 11);
		base.selectoptionbytext(roomtype, selectroomtype);
		
		WebElement roomno = base.findelementbyid("room_nos");
		String selectroomno = base.getstringcellvalue("sheet2", 0, 12);
		base.selectoptionbytext(roomno, selectroomno);
		
		WebElement adultroom = base.findelementbyid("adult_room");
		int selectadultroomno = base.getnumericcell("sheet2", 0, 13);
		base.selectoptionbyindex(adultroom, selectadultroomno);
		
		WebElement childroom = base.findelementbyid("child_room");
		int selectchildroom = base.getnumericcell("sheet2", 0, 14);
		base.selectoptionbyindex(childroom, selectchildroom);
		
		WebElement submitclick = base.findelementbyid("Submit");
		base.click(submitclick);

		WebElement radiobtn = base.findelementbyid("radiobutton_0");
		base.click(radiobtn);

		WebElement clkcontinue = base.findelementbyid("continue");
		base.click(clkcontinue);

		WebElement firstname = base.findelementbyclass("reg_input");
		String string = base.getstringcellvalue("sheet2", 0, 2);
		base.type(firstname, string);
		
		WebElement lastname = base.findelementbyname("last_name");
		String string1 = base.getstringcellvalue("sheet2", 0, 3);
		base.type(lastname, string1);
		
		WebElement address = base.findelementbyname("address");
		String string2 = base.getstringcellvalue("sheet2", 0, 4);
		base.type(address, string2);
		
		WebElement ccno = base.findelementbyid("cc_num");
		String string3 = base.baseclassdata("sheet2", 0, 5);
		base.type(ccno, string3);
		
		WebElement ccv = base.findelementbyid("cc_cvv");
		String string4 = base.baseclassdata("sheet2", 0, 6);
		base.type(ccv, string4);
		
		WebElement cctype = base.findelementbyid("cc_type");
		String string5 = base.getstringcellvalue("sheet2", 0, 15);
		base.selectoptionbytext(cctype, string5);
		
		WebElement expmonth = base.findelementbyid("cc_exp_month");
		String month = base.getstringcellvalue("sheet2", 0, 16);
	   base.selectoptionbytext(expmonth, month);
		
		WebElement expyear = base.findelementbyid("cc_exp_year");
		int year = base.getnumericcell("sheet2", 0, 17);
		base.selectoptionbyindex(expyear, year);
		
		WebElement booknow = base.findelementbyid("book_now");
		base.click(booknow);
		Thread.sleep(10000);
		WebElement orderno = base.findelementbyid("order_no");
        String string8 = base.getattribute(orderno);
        base.createcellvalue("sheet2", 0, 8, string8);

		}

}
