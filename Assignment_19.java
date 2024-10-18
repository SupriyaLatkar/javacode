package assignments_AB45;
//Website registration input name, address details
import java.util.Scanner;

public class Assignment_19
{

	public static void main(String[] args) 
	 {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter your FirstName ");
	   String s1= sc.next();
	   
	   System.out.println("Enter your LastName ");
	   String s2= sc.next();
	   
	   System.out.println("Enter your EmailID");
	   String s3= sc.next();
	   
	   System.out.println("Enter your Password ");
	   String s4= sc.next();
	   
	   System.out.println("Enter your Gender M or F ");
	   String s5= sc.next();
	   
	   System.out.println("Enter your PresentAddress ");
	   String s6= sc.next();
	   
	   System.out.println("Enter your PermnentAddress ");
	   String s7= sc.next();
	   
	   System.out.println("Enter your Pincode ");
	   String s8= sc.next();
	   
	   System.out.println("FirstName :  "+s1);
	   System.out.println("LastName :  "+s2);
	   System.out.println("EmailID :  "+s3);
	   System.out.println("Password :  "+s4);
	   System.out.println("Gender :  "+s5);
	   System.out.println("PresentAddress :  "+s6);
	   System.out.println("PermnentAddress :  "+s7);
	   System.out.println("Pincode :  "+s8);
	 }
}
