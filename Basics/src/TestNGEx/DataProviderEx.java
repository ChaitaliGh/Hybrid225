package TestNGEx;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderEx {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println(n);
	  System.out.println(s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
 
 /*returntype of dataProvider is two dimentional array of Object 
  Here method f() is executed twice that is for two different objects mentioned in dataProvider.
  
  */
  }
  
}
