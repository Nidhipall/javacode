package Assignments;

public class Assign_23_MethodOverloading 
{
	static void add()
	{
		System.out.println("1st");
	}
	static void add(int a)
	{
		System.out.println("2nd");
	}
	static void add(double b)
	{
		System.out.println("3rd");
	}
	public static void main(String[] args)
	{
		add();
		add(1);
		add(2.5);
	}

}
