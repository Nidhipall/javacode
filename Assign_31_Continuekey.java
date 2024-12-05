package Assignments;

public class Assign_31_Continuekey 
{
	public static void main(String[] args)
	{
	int age =19;
	assert age>18:"Sorry u cannot vote" ;
	System.out.println("Cannot vote ");
	for(int i=1;i<=8;i++)
	{
		if(i==3)
		{
			continue;
		}
		System.out.println(i);
	}
	}
}
