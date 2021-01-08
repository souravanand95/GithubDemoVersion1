package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {

	@Test
	public void plus()
	{
		System.out.println("PLUS");
		int a=20;
		int b=10;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void minus()
	{
		System.out.println("MINUS");
		int a=20;
		int b=10;
		Assert.assertEquals(10, a-b);
	}
	
	@Test
	public void into()
	{
		System.out.println("INTO");
		int a=20;
		int b=10;
		Assert.assertEquals(200, a*b) ;
	}
	
	@Test
	public void by()
	{
		System.out.println("BY");
		int a=20;
		int b=10;
		Assert.assertEquals(2, a/b);
	}
}
