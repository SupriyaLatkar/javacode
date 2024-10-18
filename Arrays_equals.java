package arrays;

import java.util.Arrays;

public class Arrays_equals 
{

	public static void main(String[] args) 
	{
	   int stud1[]=new int[3];
	   int stud2[]=new int[3];
	   
	   stud1[0]=21;
	   stud1[1]=31;
	   stud1[2]=41;
	   
	   stud2[0]=21;
	   stud2[1]=31;
	   stud2[2]=51;
	   
	   boolean b1=Arrays.equals(stud1, stud2);
	   
	   System.out.println(b1);
	}
}
