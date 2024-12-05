package Assignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assign_104_105_106_107_108 {

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		c1.add("cat");
		c1.add("horse");
		c1.add("lion");
		c1.add("dog");
		System.out.println(c1);
		c1.add("11");
		c1.add('x');
		c1.add("9.87");
		c1.add(true);
		System.out.println(c1);
		Collection c2=new ArrayList();
		c2.addAll(c1);
		c2.add("tiger");
		c2.add("wolf");
		System.out.println(c2);
		System.out.println(c1.contains("wolf"));
		System.out.println(c1.containsAll(c1));
		System.out.println(c1.remove("dog"));
		System.out.println(c1);
		System.out.println(c2.removeAll(c1));
		System.out.println(c2);
		System.out.println(c1);
		System.out.println(c1.size());
		
	}

}
