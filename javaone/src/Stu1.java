
public class Stu1
{
	//����Ϊ10
	int score=10;
	
	
	
	public static void main(String[] args)
	{
		//��ʼ����Ϊ10
		Stu1 s1=new Stu1();
		System.out.println("1---->"+s1.score);//10
		
		//��ʼ����Ϊ10
		Stu1 s2=new Stu1();		
		System.out.println("2---->"+s2.score);//10
		
		//s3��s2ָ����ͬ�ѣ�����s3=s2=10
		Stu1 s3=s2;
		
		//s1��ֵ��s2  
		s2=s1;
		//s1��s2ָ����ͬ�ѣ�����s1=s2=20
		s2.score=20;
		System.out.println("3---->"+s2.score);//20
		
		System.out.println("4---->"+s3.score);//10
	}

}
