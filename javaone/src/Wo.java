
//��̬�����;�̬����������������ģ�
//�������ǰѾ�̬���������������
//���ǰѾ�̬���������෽��
//���ǶԾ�̬�����;�̬�����ķ��ʹ���:
//1.����.��̬������
//2.����.��̬������   

//this�ؼ����Ǵ��������ǰ���󣬲��ܹ��ھ�̬������ʹ�á�

public class Wo
{
	//��ڷ���
	public static void main(String[] args)
	{
		Dog  dog1 =  new Dog();
		dog1.setColor("��ɫ");
		//���Թ�ͷ�������������
		Dog.eat();
		
		//���ӵ� Dog.java
		System.out.println(dog1.getColor());
		
		System.out.println("---------------");
		Dog  dog2=  new Dog();
		dog2.setColor("���ɫ");
		Dog.eat();
		
		System.out.println(dog2.getColor());

	}

}
