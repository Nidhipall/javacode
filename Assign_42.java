package Assignments;

import java.util.Scanner;

public class Assign_42 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a =s1.nextInt();
		int area = a*a;
		System.out.println("Area of square is "+ area);
		int crf= 4*a;
		System.out.println("Circumference of circle is " + crf);
		
	}

}
