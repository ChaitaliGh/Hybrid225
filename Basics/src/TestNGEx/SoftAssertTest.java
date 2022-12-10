package TestNGEx;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
 
	
	
	@Test
  public void Test1() {
		SoftAssert sf=new SoftAssert();
	  sf.assertEquals(1,1);
	  System.out.println("1");
	  sf.assertEquals(1, 2);
	  System.out.println("2");
	  sf.assertEquals(3,3);
	  System.out.println("3");
	  sf.assertAll();
	  sf.assertEquals(4,4);
	  System.out.println("4");
	  }
	
	@Test
	public void Test2() {
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(11, 11);
		System.out.println("11");
		sf.assertEquals(11,22);
		System.out.println("22");
		sf.assertEquals(33, 33);
		System.out.println("33");
		sf.assertAll();
	}
}
