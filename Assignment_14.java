package assignments_AB45;

import java.util.Scanner;

//Area of Square
public class Assignment_14 
{
	public static void main(String[] args) 
	 {
	   System.out.println("Enter value of Side ");
	   Scanner sc=new Scanner(System.in);
	   int s= sc.nextInt();
	   
	   double area=s*s;
	   System.out.println("Area of Square is : "+area);
	 }
}
