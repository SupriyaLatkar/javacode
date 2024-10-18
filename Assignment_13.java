package assignments_AB45;
//Area of Traingle

import java.util.Scanner;

public class Assignment_13 
{
	public static void main(String[] args) 
	 {
	   System.out.println("Enter value of Length ");
	   Scanner sc=new Scanner(System.in);
	   int l= sc.nextInt();
	   System.out.println("Enter value of Height ");
	   int h=sc.nextInt();
	   double area=0.5*l*h;
	   System.out.println("Area of Traingle is : "+area);
	 }
}
