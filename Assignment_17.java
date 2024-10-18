package assignments_AB45;
//Perimeter of Rectangle
import java.util.Scanner;

public class Assignment_17 
{
public static void main(String[] args)
  {
	   System.out.println("Enter value of Length ");
	   Scanner sc=new Scanner(System.in);
	   int l= sc.nextInt();
	   System.out.println("Enter value of Breadth ");
	   int b=sc.nextInt();
	   double area=2*(l+b);
	   System.out.println("Perimeter of Rectangle is : "+area);
  }
}
