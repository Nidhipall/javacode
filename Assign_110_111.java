package Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assign_110_111 
{
public static void main(String[] args) 
	{
		List l1= new ArrayList();
		l1.add(786);
		l1.add(-86);
		l1.add(0);
		l1.add("Moon");
		l1.add("Sun");
		l1.add(true);
		l1.add(786);
		l1.add(null);
		l1.add(null);
		System.out.println(l1);
		System.out.println("Size of List iterator->" +l1.size());
		Iterator i1=l1.iterator();
		System.out.println("Only Forward Iteration");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("Using ListIterator Forward Iteration");
		ListIterator i2 =l1.listIterator();
		while(i2.hasNext()) 
		{
			System.out.println(i2.next());
		}
		System.out.println("Using ListIterator Backward Iteration");
	
		while(i2.hasPrevious()) 
		{
			System.out.println(i2.previous());
		
		}
		
		

	}

}
