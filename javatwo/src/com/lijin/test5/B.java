package com.lijin.test5;

public class B
{
	static
	{
		System.out.println("*******父类的静态块******");
	}
	{
		System.out.println("*******父类的构造块******");
	}

	B(int a)
	{
		System.out.println("父类的构造函数");
	}

}
