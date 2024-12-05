package Assignments;

public class Assign_69_Reversestring {

	public static void main(String[] args) 
	{
		String a ="Nidhi";
		String output =" ";
		for(int i =a.length()-1; i>=0; i--)
		{
			char c1=a.charAt(i);
			output=output+c1;
			
		}
		System.out.println(output);

	}

}
