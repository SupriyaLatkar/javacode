package assignments_AB45;
//Circumference of circle
import java.util.Scanner;

public class Assignment_16 
{
	public static void main(String[] args)
	{
		System.out.println("Enter value of radius");
		
	   Scanner sc=new Scanner(System.in);
	   int r= sc.nextInt();
	   double area=2*3.14*r;
	   System.out.println("Circumference of Circle is : "+area);
	}
}
