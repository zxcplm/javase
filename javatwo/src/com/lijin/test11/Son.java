package com.lijin.test11;

public class Son extends Base
{
	Son()
	{
		a=3;		
		b=4;
		
	}
	public void addA()
	{
		a += 6;
	}
	public static void addB()
	{
		b += 7;
	}
	public static void main(String[] args)
	{
		Son  son = new Son();
		System.out.println(son.a+","+son.b);
		
		System.out.println("--------------------------------");// 3,4
		
		//son��ֵ��base
		Base base=son;
		//����ĳ�Ա������������̳У���ͬӵ��
		System.out.println(base.a+","+base.b);//3,4
		
        System.out.println("--------------------------------");
		
		base.addA();
		System.out.println(son.a+","+son.b);//9,4    a=3+6=9
		
		System.out.println("--------------------------------");
		
		//��̬����Ҳ�����෽�����������ĸ��࣬���������ĸ��������Ծ��������ĸ���̬������
		//���������Ķ�����������
		base.addB();
		System.out.println(son.a+","+son.b);// 9,9  b=4+5=9
		
	}

}
