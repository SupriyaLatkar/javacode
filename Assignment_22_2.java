package assignments_AB45;

public class Assignment_22_2 
{

	void main()
	{
		System.out.println("Inside non para main");
	}
	
	void main(int a)
	{
		System.out.println("Main with int a ");
	}
	
	void main(int a,int b)
	{
		System.out.println("Main with int a & b");
	}
	void main(double c, long d)
	{
		System.out.println("Main with c & d");
	}
	
	public static void main(String[] args) 
	{
	   System.out.println("Inside actual main");
	   
	   Assignment_22_2 ob=new Assignment_22_2();
	   ob.main();
	   ob.main(2);
	   ob.main(4, 8);
	   ob.main(34.5, 678454);

	   
	}
}
