
public class Cat
{
	//猫的名字
	private String name;
	
	//猫的颜色      颜色用 String
	private String color;
	
	public void showCat()
	{
		//this表示当前对象，表示，谁调用this就代表谁
		System.out.println("名字为"+this.name+",颜色为"+this.color);
	}
	
	//this不能使用在静态方法
    //public static  void  show()
    //{
    //	System.out.println(this.name+",颜色为:"+this.color);
    //}
	
	//入口函数
	public static void main(String[] args)
	{
		Cat c1 = new Cat();
		c1.name="小花";
		c1.color="黄色";
		
		//c1.showCat()调 public void showCat()
		c1.showCat();
		
		System.out.println("---------------");
		
		Cat c2 = new Cat();
		c2.name="大黑";
		c2.color="黑色";
		
		//c2.showCat()调 public void showCat()
		c2.showCat();
		//this是不能用在静态方法中
	}

}
