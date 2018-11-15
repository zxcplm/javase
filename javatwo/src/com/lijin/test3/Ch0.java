package com.lijin.test3;

//导入包com.lijin.test.Ch1
import com.lijin.test.Ch1;

public class Ch0
{
	public static void main(String[] args)
	{
		Ch0 c=new Ch0();
		System.out.println(c.hashCode());
		
		Ch0 c1=new Ch0();
		//c和c1比较的是地址   equals比较的是地址
		System.out.println(c.equals(c1));//false
		//java中==比较的是地址
		System.out.println(c==c1);//false
		
		System.out.println("------------");
		
		//String是个引用类型，特殊点:1.可以不new;2.String 类的equals 比较的是值
		String  s1 = new String("123");
		String  s2 = new String("123");
		//String 类的equals 比较的是值
		System.out.println(s1.equals(s2));//true
		//java中==比较的是地址
		System.out.println(s1==s2);//false
		
		System.out.println("------------");
		
		StringBuffer  sb1 =  new StringBuffer("123");
		StringBuffer  sb2 =  new StringBuffer("123");
		// equals比较的是地址       StringBuffer不是String
		System.out.println(sb1.equals(sb2));//false
		
		System.out.println("------------");
		
		//导入包com.lijin.test.Ch1
		Ch1  m1 = new Ch1();
		Ch1  m2= new Ch1();
		System.out.println(m1.equals(m2));
		
	}

}
