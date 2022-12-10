package TestNGEx;

import org.testng.annotations.Test;

public class DependOnMethod {
  
	
	
	@Test
  public void login() {
	  System.out.println("Log in");
  }
  
  @Test(dependsOnMethods="login")
  public void dashboard() {
	  System.out.println("Dashboard");
  }
  
  @Test(dependsOnMethods="dashboard")
  public void user() {
	  System.out.println("user");
  }
  
  
  
  }

