
//静态变量和静态方法都属于整个类的，
//所以我们把静态变量叫做类变量，
//我们把静态方法叫做类方法
//我们对静态方法和静态变量的访问规则:
//1.类名.静态变量名
//2.类名.静态方法名   

//this关键字是代表这个当前对象，不能够在静态方法中使用。

public class Wo
{
	//入口方法
	public static void main(String[] args)
	{
		Dog  dog1 =  new Dog();
		dog1.setColor("黄色");
		//狗吃骨头都属于这个狗类
		Dog.eat();
		
		//连接到 Dog.java
		System.out.println(dog1.getColor());
		
		System.out.println("---------------");
		Dog  dog2=  new Dog();
		dog2.setColor("金黄色");
		Dog.eat();
		
		System.out.println(dog2.getColor());

	}

}
