package test.ng;

import java.io.IOException;

import org.add.Class2;
import org.junit.Test;
import org.testng.annotations.BeforeClass;

public class Integrations1 extends Class2 {
	@BeforeClass
	private void Beforeclass() {
        getdriver();
        geturl("https://adactinhotelapp.com/");
        tomaximize();
        
      }
	
@Test
private void SelectHotel() throws IOException {
	TestNg q = new TestNg();
	q.login(getstringcellvalue("sheet2", 0, 0), getstringcellvalue("sheet2", 0, 1));

	SelectHotel slt=new SelectHotel();
	slt.selecthotel();
	
}

}
