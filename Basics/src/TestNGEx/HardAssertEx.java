package TestNGEx;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {
  @Test
  public void test1() {
	  System.out.println("1");
	  Assert.assertEquals(1,3,"Test case");
	  //above we have mentioned same method name but arguments are different so it is a ex of method overloading
	  System.out.println("2");
	  Assert.assertEquals(2, 2);
	  System.out.println("3");
	  
	  //here assertaEquals()method is static so we are calling it using Class name
  }
}
