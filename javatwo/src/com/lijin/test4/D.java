package com.lijin.test4;

//间接继承A  extends表示连接A
public class D extends A
{
	//工资
    double salary;
	
	public void  setSalary(double salary)
	{
		//this表示当前对象，表示谁调用this就代表谁
		this.salary=salary;
	}

}
