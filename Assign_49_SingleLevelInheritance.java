package Assignments;
class Parent1
{
void add()
{
	System.out.println("Non static method 1");
}
}
public class Assign_49_SingleLevelInheritance extends Parent1
{
	void substract()
	{
		System.out.println("Non static method 2");
	}
	public static void main(String[] args)
	{
		Assign_49_SingleLevelInheritance a =new Assign_49_SingleLevelInheritance();
		a.substract();
		a.add();
	}
	
	

}
