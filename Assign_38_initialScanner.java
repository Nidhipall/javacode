package Assignments;

import java.util.Scanner;

public class Assign_38_initialScanner 
{
	public static void main(String[] args)
	{
		System.out.println("Declartaion & initialization of methods");
		Scanner s1=new Scanner(System.in);
		String a1= s1.next();
		int b1= s1.nextInt();
		byte c1=s1.nextByte();
		short d1=s1.nextByte();
		double e1=s1.nextDouble();
		boolean f1=s1.nextBoolean();
		System.out.println(a1 + b1 + c1+ d1+ e1+ f1);
		
	}
	

}
