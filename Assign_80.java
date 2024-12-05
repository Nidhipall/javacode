package Assignments;

import java.util.Arrays;

public class Assign_80 {
	static int count_of_alph =0;
	static int count_of_space =0;
	static int count_of_num =0;
	static int count_of_special =0;

	public static void main(String[] args)
	{
		boolean v1=false;
		boolean v2=false;
		boolean v3=false;
	String a ="Kv no 2";
	System.out.println(a);
	char[] c1 =a.toCharArray();
	System.out.println(Arrays.toString(c1));
	for(int i =0;i<a.length();i++)
	{
		 v1= Character.isAlphabetic(c1[i]);
		 v2=Character.isDigit(c1[i]);
		 v3=Character.isWhitespace(c1[i]);
		if (v1== true)
		{
			count_of_alph++;
		}
		if(v2==true)
		{
			count_of_num++;
		}
		if (v3==true)
		{
			count_of_space++;
		}
		}
	System.out.println("The count of numeric in give string "+ count_of_num);
	System.out.println("The count of alphabet in give string "+ count_of_alph);
	System.out.println("The count of space in give string "+ count_of_space);
	int count_of_special=c1.length-(count_of_alph + count_of_num+ count_of_space);
	System.out.println("The count of special character in give string "+ count_of_special);
	}

}
