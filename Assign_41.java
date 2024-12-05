package Assignments;

import java.util.Scanner;

public class Assign_41 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of l & b");
		int l =s1.nextInt();
		int b =s1.nextInt();
		int area = l*b;
		System.out.println("Area of rectangle is "+ area);
		int crf= 2*(l+b);
		System.out.println("Circumference of rectangle is " + crf);
		
	}
}
