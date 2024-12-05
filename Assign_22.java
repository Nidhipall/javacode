package Assignments;

public class Assign_22 
{
	Assign_22(double a)
	{
		System.out.println("1st constructor");
	}
	Assign_22(int a)
	{
		System.out.println("2nd constructor");
	}
	public static void main(String args[])
	{
	new Assign_22(2.56);
	new Assign_22(100);
	}
}
