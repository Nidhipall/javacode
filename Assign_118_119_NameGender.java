package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Assign_118_119_NameGender {

	public static void main(String[] args) 
	{
		Map<String, Character> k1= new HashMap<String,Character>();
k1.put("Nidhi",'F');
k1.put("Shubm", 'M');
k1.put("Abhishek", 'M');
k1.put("Prachi", 'F');
k1.put("Gaurav", 'M');
k1.put("Vimal", 'M');
System.out.println(k1);
Map<String, Double> k2= new HashMap<String,Double>();
k2.put("Nidhi",54678.56);
k2.put("Shubm", 39765.78);
k2.put("Abhishek", 78644.00);
k2.put("Prachi", 124670.76);
k2.put("Gaurav", 56908.78);
k2.put("Vimal", 67896.89);
System.out.println(k2);

	}

}
