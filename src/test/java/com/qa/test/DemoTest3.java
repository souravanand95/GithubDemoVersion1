package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest3 {

	@Test
	public void sum()
	{
		System.out.println("ADDITION");
		int a=20;
		int b=10;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void substract()
	{
		System.out.println("SUBSTRACTION");
		int a=20;
		int b=10;
		Assert.assertEquals(10, a-b);
	}
	
	@Test
	public void multiply()
	{
		System.out.println("MULTIPLICATION");
		int a=20;
		int b=10;
		Assert.assertEquals(200, a*b) ;
	}
	
	@Test
	public void division()
	{
		System.out.println("DIVISION");
		int a=20;
		int b=10;
		Assert.assertEquals(2, a/b);
	}
}
