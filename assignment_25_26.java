package assignments_AB45;

import java.util.Arrays;

public class assignment_25_26
{
	public static void main(String[] args) 
	{
	
		// checking char arrays equality
		char c1[]=new char[4];
		
		c1[0]='a';
		c1[1]='b';
		c1[2]='c';
		c1[3]='d';
		
		
       char c2[]=new char[4];
		
		c2[0]='a';
		c2[1]='b';
		c2[2]='c';
		c2[3]='d';
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		boolean b1=Arrays.equals(c1, c2);
		System.out.println(b1);
		
		//Checking strings arrays equal or not
		
		String s1="Pune";
		String s2="Pune";
		
		char c3[]=s1.toCharArray();
		char c4[]=s2.toCharArray();
		
		Arrays.sort(c3);
		Arrays.sort(c4);;
		
		System.out.println(Arrays.toString(c3));
		System.out.println(Arrays.toString(c4));
		
		boolean b2=Arrays.equals(c3, c4);
		System.out.println(b2);
		
		String s3="My name is Anish";
		String s4="My name is Anish";
		
		String s5[] =s3.split(" ");
		String s6[]=s4.split(" ");
		
		System.out.println(Arrays.toString(s5));
		System.out.println(Arrays.toString(s6));
		
		boolean b3=Arrays.equals(s5, s6);
		System.out.println(b3);
		
	}

}
