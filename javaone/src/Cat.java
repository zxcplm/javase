
public class Cat
{
	//è������
	private String name;
	
	//è����ɫ      ��ɫ�� String
	private String color;
	
	public void showCat()
	{
		//this��ʾ��ǰ���󣬱�ʾ��˭����this�ʹ���˭
		System.out.println("����Ϊ"+this.name+",��ɫΪ"+this.color);
	}
	
	//this����ʹ���ھ�̬����
    //public static  void  show()
    //{
    //	System.out.println(this.name+",��ɫΪ:"+this.color);
    //}
	
	//��ں���
	public static void main(String[] args)
	{
		Cat c1 = new Cat();
		c1.name="С��";
		c1.color="��ɫ";
		
		//c1.showCat()�� public void showCat()
		c1.showCat();
		
		System.out.println("---------------");
		
		Cat c2 = new Cat();
		c2.name="���";
		c2.color="��ɫ";
		
		//c2.showCat()�� public void showCat()
		c2.showCat();
		//this�ǲ������ھ�̬������
	}

}
