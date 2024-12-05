package Assignments;

public class Assign_34_switchForLoop 
{
	public static void main(String[] args)
	{
		for(int i=1;i<6;i++)
		{
			
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

}
