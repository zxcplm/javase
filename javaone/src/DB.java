
public class DB
{
	String host;
	String username;
	String userpwd;
	String url;
	
	public void diaplay()
	{
		System.out.println("---------display()--------");
	}
	
	//���캯��
    //���캯������:�����е����Խ��г�ʼ����ֵ
	public DB(String host,String username,String userpwd,String url)
	{
		this.host=host;
		this.username=username;
		this.userpwd=userpwd;
		this.url=url;
		
		System.out.println("-------�����в�����DB�Ĺ��캯��--------");
		
	}
	
	DB()
	{
		System.out.println("-------�����в�����DB�Ĺ��캯��--------");
	}
	
	//ʵ�����������ǹ��췽��
	int DB()
	{
		return 0;
	}
	
	public static void main(String[] args)
	{
		//1.һ���������û���ṩ�κεĹ��캯����java����������ʽ�Զ��ṩһ��û�в����Ĺ��캯������������ʹ�á�
    	//2.���һ�������ṩ�˹��캯�������������������������캯����
    	
		//��������
    	
    	//���һ�����ж�����캯������ô�͸����������ṩ�˶�����ʻ��ơ�
    	
    	//������캯���γ�������---->ͬһ������������ͬ��ʵ�ֽ����
		
        //DB  db  = new DB("127.0.0.1","student","student","jdbc");
    	
    	DB  db1 = new DB();
        //db.DB();
    	
    	
    	//db.display();
	}

}
