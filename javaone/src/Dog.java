
public class Dog
{
	//������ɫ
	String Color;
	
	//���еĹ���ϲ���Թ�ͷ���������óɾ�̬
	//��̬����Ҳ�����෽��
	public static void eat()
	{
		System.out.println("����ϲ���Թ�ͷ");
	}
	
	//ʵ��������ʵ������һ������   setColor����ֵ
	public void setColor(String Color)
	{
		//ÿ��������ɫ��ÿ��������һ��
		this.Color=Color;
	}
	//getColor��ȡֵ
	public String getColor()
	{
		return this.Color;
	}

}
