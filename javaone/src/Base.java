
public class Base
{
	String name;

	Base()
	{

	}

	Base(String name)
	{
		// ���캯����ʼ����ֵ
		this.name = name;
	}

	public static void add(int a, int b)
	{
		System.out.println(a + b);

	}

	public  String add(int a, String b)
	{
		return a + b;
	}

	public static void main(String[] args)
	{
		// ���캯�����Ǻʹ�������һ��ִ�У�����ʽ�ģ��Զ��ĺ�new�����������
		Base b1 = new Base();
		System.out.println(b1.name);

		Base b2 = new Base("����");
		System.out.println(b2.name);
		
		b1.add(10, 20);
	}

}
