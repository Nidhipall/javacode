package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assign_78 {

	public static void main(String[] args) 
	{
		int a[]=new int[4];
		Scanner s1 =new Scanner(System.in);
		int giveno =56;
		for (int i=0;i<=3;i++)
		{
			a[i]=s1.nextInt();
			System.out.println(Arrays.toString(a));
			if(giveno==a[i])
			{
				System.out.println("Yes, the no is present");
				
			}
			else 
			
			System.out.println("not");
		}

	}

}
