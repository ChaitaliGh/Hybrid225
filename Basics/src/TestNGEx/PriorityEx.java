package TestNGEx;

import org.testng.annotations.Test;

public class PriorityEx {
	@Test
	public void B() {
		System.out.println("B");
	}
	
	@Test(priority=5)
	public void A() {
		System.out.println("A");
	
	}
	@Test(priority=2)
	public void C() {
		System.out.println("C");
		
	}
	@Test(priority=-1)
	public void c() {
		System.out.println("c");
	
		
	}
	
	@Test
	public void a() {
		System.out.println("a");
		
	}
	
	@Test
	public void b() {
		System.out.println("b");
	}
	

}
