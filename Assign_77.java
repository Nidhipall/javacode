package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assign_77 {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		int[] age=new int[4];
		int[] age1=new int[4];
		for(int i=0;i<4;i++)
		{
			//System.out.println("Enter the value of array 1 & 2");
			age[i]=s1.nextInt();
			age1[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(age));
		System.out.println(Arrays.toString(age1));
	
	if(age == age1)
	{
		System.out.println("Equal");
	}
	else
	
		System.out.println("Not Equal");
	}

}


