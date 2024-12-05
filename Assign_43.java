package Assignments;

import java.util.Scanner;

public class Assign_43 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of b & h");
		int b =s1.nextInt();
		int h=s1.nextInt();
		int c=s1.nextInt();
		double area1 = 0.5*b*h;
		System.out.println("Area of triangle is "+ area1);
		int crf1= b+h+c;
		System.out.println("Circumference of triangle is " + crf1);
	}
}
