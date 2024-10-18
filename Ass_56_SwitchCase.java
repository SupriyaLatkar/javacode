package assignments_AB45;

import java.util.Scanner;

public class Ass_56_SwitchCase
{

	public static void main(String[] args) 
	{
		int a;
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter switch case number");
		a=sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Case 1 executed");
			break;
		case 2:
			System.out.println("Case 2 executed");
			break;
		case 3:
			System.out.println("Case 3 executed");
			break;
		case 4:
			System.out.println("Case 4 executed");
			break;
		default:
			System.out.println("Default Case  executed");
			break;
		
		}

	}

}
