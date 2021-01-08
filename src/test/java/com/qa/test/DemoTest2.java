package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {

	@Test
	public void plus()
	{
		System.out.println("ADDITION");
		int a=20;
		int b=10;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void minus()
	{
		System.out.println("SUBSTRACTION");
		int a=20;
		int b=10;
		Assert.assertEquals(10, a-b);
	}
	
	@Test
	public void into()
	{
		System.out.println("MULTIPLICATION");
		int a=20;
		int b=10;
		Assert.assertEquals(200, a*b) ;
	}
	
	@Test
	public void by()
	{
		System.out.println("DIVISION");
		int a=20;
		int b=10;
		Assert.assertEquals(2, a/b);
	}
}
