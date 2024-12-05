package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assign_76 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int r[]= new int[4];
		Scanner s1=new Scanner(System.in);
		r[0]=s1.nextInt();
		for (int i=0;i<=3;i++)
		{
			System.out.println("enter the value "+i);
			r[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(r));
		
	}

}
