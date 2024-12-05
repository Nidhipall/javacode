package Assignments;
class Parent
{
static void add()
{
System.out.println("static ");	
}
}
public class Assign_48_SingleLevelInheritance extends Parent
{
	
	static void substract()
	{
		System.out.println("single level inheritance ");
	}
	public static void main(String[] args)
	{
	substract();
	add();
	}

}
 
