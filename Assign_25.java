package Assignments;

public class Assign_25 
{
	Assign_25(double a)
	{
		System.out.println("1st constructor");
	}
	Assign_25(int a)
	{
		System.out.println("2nd constructor");
	}
	static void add()
	{
		System.out.println("method overloading 1");
	}
	static void add(int a)
	{
		System.out.println("method overloading 2");
	}
	public static void main(String args[])
	{
	new Assign_22(2.56);
	new Assign_22(100);
	 add();
	 add(2);
	}

}
