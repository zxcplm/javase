
public class Stu3
{
	int a=5;
	
	boolean flag;
	
	static int c;
	
	static
	{
		c=20;
	}
	
	int  getA()
	{
		int a=30;
		return a;
	}
	
	int  getA(int a)//a=10 重载 int a-->main中的int a
	{
		a=8;
		//return a;
		return  this.a;
	}
	
	public static void main(String[] args)
	{
		int a=10;
		
		Stu3 s1=new Stu3();
		System.out.println(s1.c);//0
		//s1.a-->全局变量   flag-->false  c-->局部变量
		System.out.println(s1.a+","+s1.flag+","+a);//5,false,10
		
        System.out.println(s1.getA(a));//30
		
        Stu3  s2  = new Stu3();
		System.out.println(s2.a+","+s2.flag+","+a);//5,false,10
		
		s2.a=10;
		System.out.println(s2.getA(a)+","+s1.getA(100));//10,30
		
		s1.c=300;
		System.out.println(s2.c);//20
	}

}
