package assignments_AB45;
import java.util.Scanner;
//Area of Rectangle

public class Assignment_12 
{
	
	
	public static void main(String[] args) 
	 {
	   System.out.println("Enter value of Length ");
	   Scanner sc=new Scanner(System.in);
	   int l= sc.nextInt();
	   System.out.println("Enter value of Breadth ");
	   int b=sc.nextInt();
	   double area=l*b;
	   System.out.println("Area of Rectangle is : "+area);
	 }
	
}
