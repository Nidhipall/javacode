package Assignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assign_99_100_101_102_103 {

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
		c2.clear();
		System.out.println(c2);
		boolean b1=c2.isEmpty();
		System.out.println(b1);
		System.out.println(c1.isEmpty());
		
	}

}
