package assignments_AB45;

import java.util.Scanner;

public class Ass_55_AddNumbers 
{

	public static void main(String[] args) 
	{
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number to add");
		a=sc.nextInt();
		System.out.println("Enter second number to add");
		b=sc.nextInt();
		
		int c=a+b;
		System.out.println("Addition is :"+c);

	}

}
