package com.lijin.test3;

//�����com.lijin.test.Ch1
import com.lijin.test.Ch1;

public class Ch0
{
	public static void main(String[] args)
	{
		Ch0 c=new Ch0();
		System.out.println(c.hashCode());
		
		Ch0 c1=new Ch0();
		//c��c1�Ƚϵ��ǵ�ַ   equals�Ƚϵ��ǵ�ַ
		System.out.println(c.equals(c1));//false
		//java��==�Ƚϵ��ǵ�ַ
		System.out.println(c==c1);//false
		
		System.out.println("------------");
		
		//String�Ǹ��������ͣ������:1.���Բ�new;2.String ���equals �Ƚϵ���ֵ
		String  s1 = new String("123");
		String  s2 = new String("123");
		//String ���equals �Ƚϵ���ֵ
		System.out.println(s1.equals(s2));//true
		//java��==�Ƚϵ��ǵ�ַ
		System.out.println(s1==s2);//false
		
		System.out.println("------------");
		
		StringBuffer  sb1 =  new StringBuffer("123");
		StringBuffer  sb2 =  new StringBuffer("123");
		// equals�Ƚϵ��ǵ�ַ       StringBuffer����String
		System.out.println(sb1.equals(sb2));//false
		
		System.out.println("------------");
		
		//�����com.lijin.test.Ch1
		Ch1  m1 = new Ch1();
		Ch1  m2= new Ch1();
		System.out.println(m1.equals(m2));
		
	}

}
