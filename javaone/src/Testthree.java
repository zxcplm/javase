
public class Testthree
{
   //Ա������
   String name;
   
   //Ա������
   double salary;
   
   
   //ʵ�ּ�н
   void addsalary()
   {
	   //���ӵ�Ǯ��
	   double addsal=100;
	   
	   //��ʹ�þֲ��������ֲ�����Ҫ��ֵ
	   //���� ���� ����+����
	   salary=salary + addsal;
	   
	   System.out.println("���Ա������"+name+",����"+addsal+"����Ϊ"+salary);
	   
   }
   
   //��ڷ���
   public static void main(String[] args)
{      
	   //ʵ��������
	   Testthree s1= new Testthree();
	   s1.name="���";
	   s1.salary= 1000;
	   
	   //������������ļ�н
	   s1.addsalary();
	   
	   Testthree s2= new Testthree();
	   s2.name="�";
	   s2.salary= 1000;
	   
	   System.out.println(s2.name+"����Ϊ"+s2.salary);
	   s2.addsalary();
}
  
}
