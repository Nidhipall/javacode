package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Assign_116_117_SstringMMap {

	public static void main(String[] args) 
	{
		Map<String, String> m1= new HashMap<String, String>();
m1.put("Nidhi", "mkt23");
m1.put("Shubm", "mkt43");
m1.put("Abhishek", "mkt93");
m1.put("Prachi", "mkt3");
m1.put("Gaurav", "mkt6543");
m1.put("Vimal", "mkt413");
System.out.println(m1);
Map<String, Integer> m2= new HashMap<String, Integer>();
m2.put("Rice", 23);
m2.put("Pulse", 104);
m2.put("Oil", 145);
m2.put("Wheat", 24);
m2.put("Vegetables", 423);
System.out.println(m2);

	}

}
