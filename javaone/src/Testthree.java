
public class Testthree
{
   //员工姓名
   String name;
   
   //员工工资
   double salary;
   
   
   //实现加薪
   void addsalary()
   {
	   //增加的钱数
	   double addsal=100;
	   
	   //在使用局部变量，局部变量要赋值
	   //工资 等于 工资+奖金
	   salary=salary + addsal;
	   
	   System.out.println("这个员工叫做"+name+",加了"+addsal+"工资为"+salary);
	   
   }
   
   //入口方法
   public static void main(String[] args)
{      
	   //实例化对象
	   Testthree s1= new Testthree();
	   s1.name="李进";
	   s1.salary= 1000;
	   
	   //这个对象叫李进的加薪
	   s1.addsalary();
	   
	   Testthree s2= new Testthree();
	   s2.name="李超";
	   s2.salary= 1000;
	   
	   System.out.println(s2.name+"工资为"+s2.salary);
	   s2.addsalary();
}
  
}
