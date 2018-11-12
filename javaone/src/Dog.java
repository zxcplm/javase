
public class Dog
{
	//狗的颜色
	String Color;
	
	//所有的狗都喜欢吃骨头，所以设置成静态
	//静态方法也叫做类方法
	public static void eat()
	{
		System.out.println("狗都喜欢吃骨头");
	}
	
	//实例方法，实例就是一个对象   setColor设置值
	public void setColor(String Color)
	{
		//每个狗的颜色对每个狗对象不一样
		this.Color=Color;
	}
	//getColor获取值
	public String getColor()
	{
		return this.Color;
	}

}
