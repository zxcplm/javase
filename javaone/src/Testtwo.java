
//这是员工类
public class Testtwo
{
	//员工姓名 隐式：作用域 全局
	//实例变量，实例化对象才能访问的变量
	String name;
	
	boolean flag;
	
	double money;
	
	//哪些变量定义成静态变量，哪些变量定义成实例变例
	//静态变量
	//我们有多少个职工
	static int count;
	
	//单位名字
	static String dname;
	
	//方法（关键字   void,没有返回值；具体类型     返回值）
	void empEat()
	{
		name="李进";
	}
	//main方法是个特殊的方法，ststic关键字，静态修饰方法
	
	public static void main(String[] args)
	{
		//static方法是不能够直接使用类的全局变量
		// name="刘冬孝";
		System.out.println("1-->"+count);
		
		//在main方法中，对实例变量的访问，必须首先创建对象
		
		//实例化对象
		Testtwo o1 = new Testtwo();
		//String的默认值是：null
		System.out.println(o1.name+","+o1.flag);
		
		
		o1.name="陈赵梅";
		o1.money=20.000;
		o1.dname="巴斯夫";
		
		count++;
		
		
		
		Testtwo d1 = new Testtwo();
		//String的默认值是：null
		System.out.println(d1.name+","+d1.flag);
		
		d1.name="李超";
		d1.money=3000.00;
		
		count++;
		
		System.out.println("员工数量:"+count);
		
		o1.dname="扬子巴斯夫";
		System.out.println(o1.name+"-->"+o1.name);
		System.out.println(d1.name+"-->"+d1.name);
		
	}

}
