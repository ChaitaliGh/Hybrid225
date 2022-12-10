package com.jbk;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsEx2 {
	
	@Test
	public void logIn() {
		System.out.println("log in");
		Assert.assertEquals(1, 2);
	}
	
	@Test(dependsOnMethods="logIn")
	public void dash() {
		System.out.println("dash");
		
	}
	
	@Test(dependsOnMethods="dash")
	public void user() {
		System.out.println("user");
	}
	
/* here	compiler will go to dash() based on ascii value and find that it depends on login(), so it will execute
log in ,so log in will get print but the assertion fails so this method will also fail and due to this dash() 
will be skipped'
Then compiler will move to user() and as the dash()is skipped so this method will also be skipped





*/
	}
