package org.add;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Junit extends Class2{
	
	@BeforeClass
	public static void browsersetup() {
		getdriver();
		geturl("https://adactinhotelapp.com/");
		tomaximize();
	}
	
	
	//@Test
	//public void testcase() throws IOException {
	//	WebElement username = findelementbyid("username");
		//String string = getstringcellvalue("sheet2", 0, 1);
	//	type(username, string);
	//	String gettextfrmsite  = getattribute(username);
		
	 //  Assert.assertEquals("verifyusername",string, gettextfrmsite);
	/*	}
	@Test
	public void testcase2() throws IOException {
		WebElement pass = findelementbyid("password");
		String string1 = getstringcellvalue("sheet2", 0, 1);
		type(pass, string1);
		String getpassfromsite = getattribute(pass);
		Assert.assertEquals("verifypassword" ,string1, getpassfromsite);

	}*/
	
	
	@Test
	public void testcase3() throws IOException {
	WebElement element = findelementbyid("username");
	String string3 = getstringcellvalue("sheet2", 0, 0);
	type(element, string3);
	WebElement element1 = findelementbyid("password");
	String string4 = getstringcellvalue("sheet2", 0, 1);
	type(element1, string4);
	WebElement element2 = findelementbyid("login");
	element2.click();
	String title = getTitle();
	boolean contains = title.contains("Search Hotel");
	Assert.assertTrue("verifytitle",contains);
	
	
	//Assert.assertEquals(expected, actual);
	
		

	}
	



}
