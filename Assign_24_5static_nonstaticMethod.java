package Assignments;

public class Assign_24_5static_nonstaticMethod 
{
	static void add()
	{
		System.out.println("1");
	}
	static void add(int a)
	{
		System.out.println("2");
	}
	static void add(double b)
	{
		System.out.println("3");
	}
	static void add(boolean b)
	{
		System.out.println("4");
	}
	static void add(float x)
	{
		System.out.println("5");
	}
	 void sub()
	{
		System.out.println("a");
	}
	void sub(int a)
	{
		System.out.println("b");
	}
 void sub(double b)
	{
		System.out.println("c");
	}
	 void sub(boolean b)
	{
		System.out.println("d");
	}
	 void sub(float x)
	{
		System.out.println("e");
	}
	 public static void main (String[] args)
	 {
		 add();
		 add(23);
		 add(3.5);
		 add(true);
		 add(12.567);
		 Assign_24_5static_nonstaticMethod m1= new Assign_24_5static_nonstaticMethod ();
		 m1.sub();
		 m1.sub(1);
		 m1.sub(4.6);
		 m1.sub(false);
		 m1.sub(5.6);
	 }
}
