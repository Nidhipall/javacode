package Assignments;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assign_123_ForEachLoopMMap {

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
		for(String s1:k2.keySet())
		{
			System.out.println("Fetching all Keys:"+s1);
		}
		for(Double s2:k2.values())
		{
			System.out.println("Fetching all Values:"+s2);
		}
		for(Entry<String,Double>s3:k2.entrySet())
		{
			System.out.println("Fetching all :"+s3);
		}

	}

}
