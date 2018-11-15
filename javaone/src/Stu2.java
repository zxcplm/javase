
public class Stu2
{
	double salary=1000;
	
	String name;
	
	String show()
	{
		String name="李进";
		
		//返回值返回到s1上
		return name;
	}
	String show1()
	{
		String name="李进";
		
		//this表示当前对象，表示，谁调用this就代表谁     this表示的是main函数中的s1
		return this.name;
	}
	
	
	
	public static void main(String[] args)
	{
		//初始变量salary=1000  name无值 ,所以为null
		Stu2 s1=new Stu2();
		System.out.println(s1.salary+","+s1.name);//1000.0,null
		
		//初始变量salary=1000  name无值 ,所以为null
		Stu2 s2=new Stu2();
		System.out.println(s2.salary+","+s2.name);//1000.0,null
		
		//局部变量要访问到值,首先要访问方法
		String str1=s1.show();
		System.out.println(str1);//李进
		
		//s1有name值为 李超   this调的值就为  李超
		s1.name="李超";
		String str2=s1.show1();
		System.out.println(str2);//李超
		
		System.out.println("-----------------");
		
		//s3=s2 s2name值为null 所以s3为null
		String  str3=s2.show1();
		System.out.println(str3);//null
		
		
		
	}

}
