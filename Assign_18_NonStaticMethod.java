package Assignments;

public class Assign_18_NonStaticMethod 
{
	void login()
	{
		System.out.println("Login with email id"); 
	}
	void logout()
	{
		System.out.println("Logout");
	}
	public static void main (String[] args)
	{
		Assign_18_NonStaticMethod m1= new Assign_18_NonStaticMethod();
		m1.logout();
		m1.login();
	}
	

}
