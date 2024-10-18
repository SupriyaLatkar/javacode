package arrays;

import java.util.Arrays;

public class Array_CopyArray 
{
	public static void main(String[] args) 
	  {
		  int stud1[]=new int[5];
		  int stud2[]=new int[5];
		  
		  stud1[0]=21;
		  stud1[1]=31;
		  stud1[2]=34;
		  stud1[3]=51;
		  stud1[4]=61;
		  
		  for(int i=0;i<5;i++)
		  {
			  stud2[i]=stud1[i];
			  
		  }
		  
		  System.out.println(Arrays.toString(stud1));
		  
		  System.out.println(Arrays.toString(stud2));
		  
	  }  
}
