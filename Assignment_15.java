package assignments_AB45;
//area of Trapezium
import java.util.Scanner;

public class Assignment_15 
{
	public static void main(String[] args) 
	 {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter value of First Length ");
	   int l1= sc.nextInt();
	   
	   System.out.println("Enter value of Second Length ");
	   int l2= sc.nextInt();
	   
	   System.out.println("Enter value of Height ");
	   int h=sc.nextInt();
	   
	   double area=0.5*(l1+l2)*h;
	   System.out.println("Area of Trapezium is : "+area);
	 }
}
