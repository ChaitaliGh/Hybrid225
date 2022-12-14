package com.listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class DemoTest {

	@Test
	public void test01() {
		System.out.println("test01");
		Assert.assertEquals(1, 0);
	}
	@Test
	public void test02() {
		System.out.println("test02");
		Assert.assertEquals(1, 1);
	
	}
	@Test
	public void test03() {
		System.out.println("test03");
		throw new SkipException("Test case skipped");
	}
	
}
