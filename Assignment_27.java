package assignments_AB45;

import java.util.Arrays;

public class Assignment_27
{
   public static void main(String[] args) 
   {
	   int a1[]=new int[5];
	   a1[0]=2;
	   a1[1]=4;
	   a1[2]=6;
	   a1[3]=8;
	   a1[4]=10;
	   
	   int a2[]=new int[5];
	   
	   for(int i=0,j=4;i<5;i++,j--)
	   {
		   a2[j]=a1[i];
	   }
	   System.out.println(Arrays.toString(a1));
	   System.out.println(Arrays.toString(a2));
   }
}
