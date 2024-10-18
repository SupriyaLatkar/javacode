package assignments_AB45;

public class Ass_41_Exception 
{
  public static void main(String[] args) 
  {
	try 
	{
		int a=1/0;
		System.out.println("In try block");
	}
	catch(ArithmeticException e)
	{
		System.out.println("Can't divide by 0");
	}
  }
}
