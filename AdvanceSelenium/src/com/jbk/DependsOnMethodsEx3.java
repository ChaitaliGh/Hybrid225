package com.jbk;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsEx3 {
	
@Test
    public  void login() {
	System.out.println("login");
	Assert.assertEquals(1, 1);
}

	@Test(dependsOnMethods="login")
	public void dash() {
		System.out.println("dash");
		Assert.assertEquals(1, 2);
	}
	
	@Test(dependsOnMethods="dash")
	public void user() {
		System.out.println("user");
	}
	
	
	/*Here compiler will go go dash based on ascii value and find that is depends on login() so it will 
	 * execute login() then it will reach to dash and print dash ,after that assertion fails so this method will 
	 * fail. Then compiler will go to user() and find it depends on dash() but as dash is failed so User() 
	 * will be skipped
     */

}
