package com.lijin.test5;

//extends����B.java
public class C extends B
{
	static
	{
		System.out.println("-------����ľ�̬��------");
	}

	C()
	{
		//super();//��ʽ���и�super()
		this("100"); //this()��super()�������ڵ�һ��,this()��super()���ܲ���
		
		System.out.println("���๹�캯��");
	  
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
		System.out.println("-------����Ĺ����------");
	}

	public static void main(String[] args)
	{
		//ֱ��new ����
		//B b = new B();
		
		//ֱ��new ����  ����Ĺ���һ����������Ĺ���
		C   c   = new C();
		
		//����Ĺ���һ����������Ĺ���
		//super(�����б�) ���ʸ��� �ṩ�Ĺ��캯�� �����ڵ�һ��
		//this(�����б�) ���ʱ���Ĺ��캯��

	}

}
