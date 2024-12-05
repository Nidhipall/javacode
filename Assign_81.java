package Assignments;

public class Assign_81 {

	public static void main(String[] args) 
	{
		double age[]= new double[5];
		age[0]=22;
		age[1]=24;
		age[2]=56;
		age[4]=90;
		age[3]=34;
		double sum =0;
		for (int i=0; i<age.length;i++)
		{
		sum = sum+age[i];	
		}
		System.out.println(sum);
		double average =sum/age.length;
		System.out.println(average);

	}

}
