package Assignments;

public class Assign_21 
{
	static void amazon()
	{
		System.out.println("Static method");
	}
void netflix()
{
	System.out.println("Non-static method");
}
Assign_21()
{
	System.out.println("this is constructor");
}
public static void main(String[] args)
{
	amazon();
	Assign_21 n1=new Assign_21();
	n1.netflix();
	new Assign_20_Constructor();
	
}
}
