package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Assign_120_121_122 {

	public static void main(String[] args) 
	{
		Map<String, Double> k2= new HashMap<String,Double>();
		k2.put("Nidhi",54678.56);
		k2.put("Shubm", 39765.78);
		k2.put("Abhishek", 78644.00);
		k2.put("Prachi", 124670.76);
		k2.put("Gaurav", 56908.78);
		k2.put("Vimal", 67896.89);
		System.out.println(k2);
		Map<String, Double> k3= new HashMap<String,Double>();
		k3.put("Nidhi",54678.56);
		k3.put("Shubm", 39765.78);
		k3.put("Abhishek", 78644.00);
		k3.put("Prachi", 124670.76);
		k3.put("Gaurav", 56908.78);
		System.out.println(k3);
		/*boolean b1=k2.equals(k3);
System.out.println(b1);*/
		Map<String, Double> k4= new HashMap<String,Double>();
		k4.put("Siya",546568.56);
		k4.put("Ravi", 30765.78);
		k4.put("Jiya", 78694.00);
		k4.put("Manish", 104670.76);
		k4.put("Shreya", 58908.78);
		k4.put("Adi", 67096.89);
		k4.putIfAbsent("Vimal",6780.0);
		k4.putAll(k3);
		System.out.println(k4);
	}

}
