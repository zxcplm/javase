
public class Test2
{
	public String add(int a,String b)
	{
		return a+b;
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	public  void  add(int a,double  b)
	{
		System.out.println(a+b);
	}
	
	public  static  int  change()
	{
		return  10;
	}
	public static void  change(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Test2 t=new Test2();
		int c=t.add(20,10);
		//调public int add(int a,int b) a和b类型要相同
		System.out.println(c);
		
		System.out.println("---------------------");
		
		//调public String add(int a,String b)
		t.add(20,"10");
		
        t.add(20,20.0);
		
		Test2.change();
		Test2.change(10);
	}

}
