package arrays;

import java.util.Arrays;

public class Array_toCharArray 
{
 public static void main(String[] args) 
  {
	String str="supriya";
	char c1[]=str.toCharArray();
	System.out.println(Arrays.toString(c1));
	Arrays.sort(c1);
	System.out.println(Arrays.toString(c1));
	//System.out.println(Arrays.sort(c1));
	
  }
}
