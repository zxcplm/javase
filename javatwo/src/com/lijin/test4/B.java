package com.lijin.test4;

//ֱ�Ӽ̳�A
public class B
{
	public static void main(String[] args)
	{
		//����C ���C�е�����
		C c=new C();
		c.setname("���");
		System.out.println(c.getname());
		//20.0f�����f ����Ϊc.java���ж���float�����Ժ���Ҫ��f
		c.setScore(20.0f);
		
		//����D ���D�е�����
		D d=new D();
		d.setname("�");
		System.out.println(d.getname());
		d.setSalary(20);
	}

}
