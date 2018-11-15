package com.lijin.test5;

//extends连接B.java
public class C extends B
{
	static
	{
		System.out.println("-------子类的静态块------");
	}

	C()
	{
		//super();//隐式的有个super()
		this("100"); //this()和super()都必须在第一行,this()和super()不能并列
		
		System.out.println("子类构造函数");
	  
	}
	C(int a)
	{
		super(a);
	}
	C(String c)
	{
	    super(10);
	}
	{
		System.out.println("-------子类的构造块------");
	}

	public static void main(String[] args)
	{
		//直接new 父类
		//B b = new B();
		
		//直接new 子类  子类的构造一定依赖父类的构造
		C   c   = new C();
		
		//子类的构造一定依赖父类的构造
		//super(参数列表) 访问父类 提供的构造函数 必须在第一行
		//this(参数列表) 访问本类的构造函数

	}

}
