package assignments_AB45;

public class Assignment_8_Call_Static_NonStatic_method_InMain 
{

	static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum of a & b is "+ sum);
	}
	
	void multiply()
	{
		int i=12,j=9;
		System.out.println("Product of i & j is :" + i*j);
	}
	
	public static void main(String[] args) 
	{
		add(14,16);
		Assignment_8_Call_Static_NonStatic_method_InMain obj=new  Assignment_8_Call_Static_NonStatic_method_InMain();
		obj.multiply();
		
		
	}
}
