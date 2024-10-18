package arrays;

import java.util.*;

public class Arrays_take_runtimeValues
{
public static void main(String[] args) 
  {
	int stud1[]=new int[4];
	
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<4;i++)
	{
		System.out.println("Enter value of "+i+"index");
		stud1[i]=sc.nextInt();
	}
	
	System.out.println(Arrays.toString(stud1));
		
  }
}
