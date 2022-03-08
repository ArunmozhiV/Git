package test.ng;

import java.io.IOException;

import org.add.Class2;
import org.junit.Test;
import org.pom.SearchHotel;
import org.testng.annotations.BeforeClass;


	public class Integrations2 extends Class2 {
		@BeforeClass
		private void Beforeclass() {
	        getdriver();
	        geturl("https://adactinhotelapp.com/");
	        tomaximize();
	        
	      }
		
	@Test
	private void searchhotel() throws IOException {
		TestNg q = new TestNg();
		q.login(getstringcellvalue("sheet2", 0, 0), getstringcellvalue("sheet2", 0, 1));

		SelectHotel slt=new SelectHotel();
		slt.selecthotel();
		
		SearchHotel search=new SearchHotel();
		search.searchhotel(getstringcellvalue("sheet2", 0, 9), getstringcellvalue("sheet2", 0, 10), getstringcellvalue("sheet2", 0, 11), getstringcellvalue("sheet2", 0, 12), getnumericcell("sheet2", 0, 13), getnumericcell("sheet2", 0, 14));
		
		


		
		
		
		
	}

}
