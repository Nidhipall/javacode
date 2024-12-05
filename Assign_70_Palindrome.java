package Assignments;

public class Assign_70_Palindrome 
{

	public static void main(String[] args)
	{
		String a="ana";
		String output=" ";
		for (int i=a.length()-1; i>=0;i--)
		{
			char c=a.charAt(i);
			output=output+c;
			}
		System.out.println("The reverse string is "+output);
		if(a.equals(output)== true)
		{
			System.out.println("Palindrome string");
		}
		else 
		{
			System.out.println("Not a Palindrome string");
		}
	}
}


