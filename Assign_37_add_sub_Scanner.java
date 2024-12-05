package Assignments;

import java.util.Scanner;

public class Assign_37_add_sub_Scanner 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the value of a & b");
		Scanner s1= new Scanner(System.in);
		int a = s1.nextInt();
		int b =s1.nextInt();
		int sum =a+b;
		int sub = b-a;
		int mul=a*b;
		int div=b/a;
		int mod=b%a;
		System.out.println("Sum of a & b :");
		System.out.println(sum);
		System.out.println("Substraction of a & b :");
		System.out.println(sub);
		System.out.println("Multiplication of a & b :");
		System.out.println(mul);
		System.out.println("Division of a & b :");
		System.out.println(div);
		System.out.println("Modulus of a & b :");
		System.out.println(mod);
	}

}
