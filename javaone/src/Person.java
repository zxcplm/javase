
//������������1.��װ
//1.��װ  �����е�����˽�е�����private���������ܹ�ֱ�ӷ������е�
//˽�еı�����������ݷ��ʵİ�ȫ�ԣ���ô�����ܷ������е�˽�е�������?
//�����е�˽�е����Խ��з���������(set/get|������������ĸ��д)
//ͨ�����������ж����ݵķ��ʣ�ͨ���������Ƕ������ߣ����ݽ��а�ȫ���ơ�

public class Person
{
	// ���� ʵ������ �Ǿ�̬����
	private String name;
	
	// ���� ʵ������ �Ǿ�̬����
	private int age;
	
	// �������� �����������ĸ�����ģ������������ж����һ������
	// ��������Person���
	// ��̬���� �����
	static String cityname;
	
	// ��java����ͨ��set��get�������������ݷ��ʣ�
	// ������ݷ��ʵİ�ȫ��,
	// �����ķ������η�������Ϊpublic ���� ��
	//����ֵ    set
	public void setAge(int age)
	{
		if (age>0 && age <=300)
		{
			// this��ʾ���ǵ�ǰ����,˭�������������this����˭
			this.age=age;
		}
		else{
			
			System.out.println("������䲻����");
			
		}
	}
	
	//��ȡֵ   get
	public int getAge()
	{
		if (this.age > 0 && this.age <= 450)
		{
			// this��ʾ���ǵ�ǰ����,˭�������������this����˭
			return this.age;
		}
		else
		{
			return 0;

		}
	}
	
	public void setName(String name)
	{

		this.name = name;
	}

	public String getName()
	{

		return this.name;
	}
	
	//��ں���
	//public static void main(String[] args)
	//{
	    //��ʵ�������ķ��ʣ����Ƿ���ֵ��������ֵ
	    //�������ȴ��������Ķ���
	    //Person��������������ģ��
		//Person p1=new Person();
		//System.out.println("����Ϊ:"+p1.name+",����Ϊ:"+p1.age);
		
	    //��ֵ������ֵ
		//p1.name="���";
	
		//p1.age=21;
		
		//System.out.println("����Ϊ:"+p1.name+",����Ϊ:"+p1.age);
		
		//p1.cityname="�Ͼ���";
		
		//System.out.println("����Ϊ:"+p1.name+",����Ϊ:"+p1.age+",��ַΪ:"+p1.cityname);
		
		//��̬����Ҳ���������     ��person�����ַ��Ϊ ��ҵ    �������������.��̬������
		//person.cityname="ʯͷ��";		
		//System.out.println("����Ϊ:"+p1.name+",����Ϊ:"+p1.age+",��ַΪ:"+p1.cityname);
		
		//cityname="��ҵ";
		//System.out.println("����Ϊ:"+p1.name+",����Ϊ:"+p1.age+",��ַΪ:"+p1.cityname);
		
		//person p2=new person();
		//System.out.println("����Ϊ:"+p2.name+",����Ϊ:"+p2.age+",��ַΪ:"+p2.cityname);
		
		//�������͸�ֵ,ʵ���ϰ�p1�ĵ�ַ��ֵ��p2
		//p2=p1;
		//System.out.println("����Ϊ:"+p2.name+",����Ϊ:"+p2.age+",��ַΪ:"+p2.cityname);
	//}

}
