package com.jbk;
import org.testng.annotations.Test;

public class GroupsEx {
	
	@Test(groups="regression")
	public void a() {
		System.out.println("a");
	}
	
	@Test(groups="regression")
	public void b() {
		System.out.println("b");
	}
	
	@Test
	public void c() {
		System.out.println("c");
	}
	
	@Test
	public void d() {
		System.out.println("d");
	}
	

}
