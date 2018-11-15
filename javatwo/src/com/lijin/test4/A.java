package com.lijin.test4;

//为什么要继承？继承的作用是什么？ 减少重复代码
//开始的 ， 第一个
public class A
{
	//姓名
	String name;
	
	//年龄
	int age;
	
	public void setname(String name)
	{
		//this表示当前对象，表示谁调用this就代表谁
		this.name=name;
	}
	public String getname()
	{
		return this.name;
	}

}
