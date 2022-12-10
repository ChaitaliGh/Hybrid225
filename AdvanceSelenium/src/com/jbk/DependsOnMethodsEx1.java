package com.jbk;
import org.testng.annotations.Test;

public class DependsOnMethodsEx1 {

	@Test
	public void logIn() {
		System.out.println("log in");
	}
	
	@Test(dependsOnMethods="logIn")
	public void dash() {
		System.out.println("dash");
		
	}
	
	@Test(dependsOnMethods="dash")
	public void user() {
		System.out.println("user");
	}
	
/*	Here the sequence of execution is ,First compiler will go to dash() based upon alphabetical order(ASCII
  value) then it will find that dash method is dependent on login method then first login method will get
  executed & then compiler will reach to dash method then again it will find that it is dependent on login 
  then it will check the status of login() and if its status is passed then dash() will get executed.
  
  Then compiler will reach to user method and will find that it is dependent on dash() , as status of dash() 
  is passed then it will execute user method. 
  In this way , the sequence of execution is 
  login
  dash
  user
  
	
*/	
}
