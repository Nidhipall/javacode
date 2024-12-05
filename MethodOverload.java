package basicsprograms;

public class MethodOverload 
{
	static void add()
	{
		System.out.println("hey");
	}
	static void add(int a)
	{
		System.out.println(a);
	}
	 void add(double a)
	{
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		add();
		add(12);
		MethodOverload m1=new MethodOverload();
		m1.add(4.67);
	}
	

}
