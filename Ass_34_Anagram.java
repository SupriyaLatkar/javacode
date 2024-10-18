package assignments_AB45;

import java.util.Arrays;

public class Ass_34_Anagram
{

	public static void main(String[] args) 
	{
	String str1="RAM";
	String str2="ARM";
	
	char c1[]=str1.toCharArray();
	char c2[]=str2.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2));
	
	boolean b1= Arrays.equals(c1, c2);
	
	
	
	
	
	
	
	
	
	
	if(b1==true)
		System.out.println("They are anagram");
	
	else 
		System.out.println("They are not");
	}
}
