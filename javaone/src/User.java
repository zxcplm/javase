
public class User
{
  private  static  int  a=10;
	
	private int  b=20;

	static
	{
		
		//��̬���п���ֱ��ʹ�þ�̬����
		a=20;
		
		//��̬���в��ܹ�ֱ��ʹ��ʵ������
		b=30;
		
		//��̬���з���ʵ����������ô��?
		User  u = new User();
		u.b=30;
		
		System.out.println("��̬�����");
	}
	
	User()
	{
		System.out.println("���캯��");
	}
	public  void  show()
	{
		System.out.println("����ʵ������show()");
	}
	public  static  void  check()
	{
		a=40;
		b=90;
		User  u = new User();
		u.b=30;
		System.out.println("���Ǿ�̬����check()");
	}
	
	{
		System.out.println("��������2--------");
	}
	{
		System.out.println("��������1***");
	}
	//��ں���
	public static void main(String[] args)
	{
		
		//�����������:
		//1.main��������ڣ�����˳��ִ��
		//2.��̬������ǿ϶�����ִ�У���ִֻ��һ��,����Ҫ���á�
		//3.���մ����˳��ִ�У���������ʱ����������������
		//��������������飬��ִ�й��췽����
		//4.���ʹ��򣬾�̬��;�̬��������ֱ�ӷ��ʾ�̬������
		//���ܹ�ֱ�ӷ���ʵ�����������Ҫ����ʵ������������
		//���ȴ��������Ķ��󣬲��ܷ���ʵ��������
		
		//����һ������  1.����������ִ�У����캯����ִ�С�
		//2.������������Ŷ���Ĵ�������ִ�С�
		//User  u = new User();
		//System.out.println("------------------------");
		//User  u1 = new User();
		
		
		//��̬����������ִ��,����ִֻ��һ�Ρ�
		User.check();
		//User  u = new User();
		//User  u1 = new User();
		
	}

}
