package Assignments;

import java.util.Scanner;

public class Assign_40 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		double pi  =Math.PI;
		System.out.println("Enter the value of r");
		int r =s1.nextInt();
		double area = pi*r*r;
		System.out.println("Area of circle is "+ area);
		double crf= 2*pi*r;
		System.out.println("Circumference of circle is " + crf);
		
	}

}
