
package org.pom;

import java.io.IOException;

import org.add.Class2;
import org.junit.After;

import org.junit.Before;
import org.junit.Test;

public class Integration extends Class2 {
	@Before
	public void Beforeclass() {
		getdriver();
		geturl("https://adactinhotelapp.com/");
		tomaximize();
		}
	/*@After
	public void afterclass() {
		quit();

	}*/
	@Test
	public void PomIntegrations() throws IOException {
		PomIntegrations q=new PomIntegrations();
		q.login(getstringcellvalue("sheet2", 0, 0), getstringcellvalue("sheet2", 0, 1));
		
		SearchHotel s= new SearchHotel();
		s.searchhotel(getstringcellvalue("sheet2", 0, 9), getstringcellvalue("sheet2", 0, 10), getstringcellvalue("sheet2", 0, 11), getstringcellvalue("sheet2", 0, 12), getnumericcell("sheet2", 0, 13), getnumericcell("sheet2", 0, 14));
		
		SelectHotel s1=new SelectHotel();
		s1.selecthotel();
		
		BookHotel s2=new BookHotel();
		s2.bookhotel(getstringcellvalue("sheet2", 0, 2), getstringcellvalue("sheet2", 0, 3), getstringcellvalue("sheet2", 0, 4), getnumericcellstring("sheet2", 0, 5), getstringcellvalue("sheet2", 0, 15), getstringcellvalue("sheet2", 0, 16), getnumericcell("sheet2", 0, 17), getnumericcellstring("sheet2", 0, 6));
		
		CancelPage s3=new CancelPage();
		s3.cancelpage();
		accept();
		}
	
	
	
	
	

}
