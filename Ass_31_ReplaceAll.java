package assignments_AB45;

import java.util.Arrays;

public class Ass_31_ReplaceAll 
{
	public static void main(String[] args)
	{
		String str="My name is Supriya";
		String op="";
		String op1="";
		
		//with replace function
		String nospace=str.replaceAll("\\s", "");
		System.out.println(nospace);
		
		
		
		// with split function
		String[] s1=str.split(" ");
		System.out.println(Arrays.toString(s1));
		
		for (int i=0;i<4;i++)
		{
			op=op+s1[i];
			System.out.println(op);	
		}
		
		//without using in built functions
		
		for (int i=0;i<str.length();i++)
		{
		   if(str.charAt(i)==' ')
		   {
			  
		   }
		   else
		   {
			   op1=op1+str.charAt(i);
		   }
		}
        
		 System.out.println(op1);
	}

}
