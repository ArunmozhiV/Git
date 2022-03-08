package test.ng;

import java.io.IOException;

import org.add.Class2;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Integrations extends Class2{
	
	@BeforeClass
	private void Beforeclass() {
        getdriver();
        geturl("https://adactinhotelapp.com/");
        tomaximize();
        
      }
@Test
	private void login() throws IOException {
		TestNg q = new TestNg();
		q.login(getstringcellvalue("sheet2", 0, 0), getstringcellvalue("sheet2", 0, 1));

	}
	
	

}
