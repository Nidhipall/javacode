package Assignments;

import java.util.Scanner;

public class Assign_47 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("To launch browser press 1/2/3/4");
		int i =s1.nextInt();
		switch(i)
		{
		case 1: 
			System.out.println("Chrome Browser Launch");
			break;
		case 2: 
			System.out.println("Edge Browser Launch");
			break;
		case 3: 
			System.out.println("Mozilla Browser Launch");
			break;
		case 4: 
			System.out.println("Internet Explorer Browser Launch");
			break;
		default: 
			System.out.println("Wrong selection is made, kindly press 1,2,3,4");
			break;
			
		}

}
}
