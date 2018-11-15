package com.lijin.test4;

//直接继承A
public class B
{
	public static void main(String[] args)
	{
		//定义C 获得C中的属性
		C c=new C();
		c.setname("李进");
		System.out.println(c.getname());
		//20.0f后面加f 是因为c.java中有定义float，所以后面要加f
		c.setScore(20.0f);
		
		//定义D 获得D中的属性
		D d=new D();
		d.setname("李超");
		System.out.println(d.getname());
		d.setSalary(20);
	}

}
