
public class Testfour
{
  String name;
  
  double salary;
  
  void addsalary()
  {
	  double addsal=100;
	  
	  salary=salary+addsal;
	  
	  System.out.println("���Ա���Ĺ���Ϊ"+salary);
  }
  public static void main(String[] args)
{
	  Testfour t1= new Testfour();
	  t1.name="���";
	  t1.salary=2000;
	  
	  t1.addsalary();
	  
	  Testfour t2= new Testfour();
	  t2.name="���";
	  t2.salary=1000;
	  
	  System.out.println(t2.name+"����Ϊ"+t2.salary);
	  t2.addsalary();
}
}
