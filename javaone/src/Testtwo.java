
//����Ա����
public class Testtwo
{
	//Ա������ ��ʽ�������� ȫ��
	//ʵ��������ʵ����������ܷ��ʵı���
	String name;
	
	boolean flag;
	
	double money;
	
	//��Щ��������ɾ�̬��������Щ���������ʵ������
	//��̬����
	//�����ж��ٸ�ְ��
	static int count;
	
	//��λ����
	static String dname;
	
	//�������ؼ���   void,û�з���ֵ����������     ����ֵ��
	void empEat()
	{
		name="���";
	}
	//main�����Ǹ�����ķ�����ststic�ؼ��֣���̬���η���
	
	public static void main(String[] args)
	{
		//static�����ǲ��ܹ�ֱ��ʹ�����ȫ�ֱ���
		// name="����Т";
		System.out.println("1-->"+count);
		
		//��main�����У���ʵ�������ķ��ʣ��������ȴ�������
		
		//ʵ��������
		Testtwo o1 = new Testtwo();
		//String��Ĭ��ֵ�ǣ�null
		System.out.println(o1.name+","+o1.flag);
		
		
		o1.name="����÷";
		o1.money=20.000;
		o1.dname="��˹��";
		
		count++;
		
		
		
		Testtwo d1 = new Testtwo();
		//String��Ĭ��ֵ�ǣ�null
		System.out.println(d1.name+","+d1.flag);
		
		d1.name="�";
		d1.money=3000.00;
		
		count++;
		
		System.out.println("Ա������:"+count);
		
		o1.dname="���Ӱ�˹��";
		System.out.println(o1.name+"-->"+o1.name);
		System.out.println(d1.name+"-->"+d1.name);
		
	}

}
