package Assignments;

public class Assign_30_Thread 
{
	public static void main(String[] args) throws InterruptedException
	{
	for(int i=1;i<=100;i++)
	{
		System.out.println(i);
		Thread.sleep(1000);
	}
}
}
