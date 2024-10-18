package assignments_AB45;
// Main method Overloading with non static main methods
public class assignment_22_1
{
 public void main()
  {
	 System.out.println("First Main");
  }
 
 public void main(String str)
 {
	 System.out.println("second Main");
 }
 
 public void main(int a)
 {
	 System.out.println("Third Main");
 }
 
 public void main(double b)
 {
	 System.out.println("Fourth Main");
 }
 
 public static void main(String[] args) 
 {
   System.out.println("Actual main method");
   assignment_22_1 ob=new assignment_22_1();
   
   ob.main();
   ob.main("Supriya");
   ob.main(5);
   ob.main(67.7);
 } 
 }
