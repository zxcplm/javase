
public class Stu2
{
	double salary=1000;
	
	String name;
	
	String show()
	{
		String name="���";
		
		//����ֵ���ص�s1��
		return name;
	}
	String show1()
	{
		String name="���";
		
		//this��ʾ��ǰ���󣬱�ʾ��˭����this�ʹ���˭     this��ʾ����main�����е�s1
		return this.name;
	}
	
	
	
	public static void main(String[] args)
	{
		//��ʼ����salary=1000  name��ֵ ,����Ϊnull
		Stu2 s1=new Stu2();
		System.out.println(s1.salary+","+s1.name);//1000.0,null
		
		//��ʼ����salary=1000  name��ֵ ,����Ϊnull
		Stu2 s2=new Stu2();
		System.out.println(s2.salary+","+s2.name);//1000.0,null
		
		//�ֲ�����Ҫ���ʵ�ֵ,����Ҫ���ʷ���
		String str1=s1.show();
		System.out.println(str1);//���
		
		//s1��nameֵΪ �   this����ֵ��Ϊ  �
		s1.name="�";
		String str2=s1.show1();
		System.out.println(str2);//�
		
		System.out.println("-----------------");
		
		//s3=s2 s2nameֵΪnull ����s3Ϊnull
		String  str3=s2.show1();
		System.out.println(str3);//null
		
		
		
	}

}
