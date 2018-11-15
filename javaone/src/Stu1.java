
public class Stu1
{
	//分数为10
	int score=10;
	
	
	
	public static void main(String[] args)
	{
		//初始变量为10
		Stu1 s1=new Stu1();
		System.out.println("1---->"+s1.score);//10
		
		//初始变量为10
		Stu1 s2=new Stu1();		
		System.out.println("2---->"+s2.score);//10
		
		//s3和s2指向相同堆，所以s3=s2=10
		Stu1 s3=s2;
		
		//s1赋值给s2  
		s2=s1;
		//s1和s2指向相同堆，所以s1=s2=20
		s2.score=20;
		System.out.println("3---->"+s2.score);//20
		
		System.out.println("4---->"+s3.score);//10
	}

}
