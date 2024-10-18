package assignments_AB45;

public class Assignment_9_Constructor 
{

	static void add(int a, int b)
	{
		int sum=a+b;
		System.out.println("sum of a & b is :"+ sum);
	}
	
	static void sub(int c , int d)
	{
		int res=c-d;
		System.out.println("Result of subtraction is :"+ res);
		
	}
	
	static void multi(int e, int f)
	{
		int product= e*f;
		System.out.println("Poduct of e & f is :"+product);
	}
	
	void StudentName(String str)
	{
		System.out.println("Student Name is: "+str);
		
	}
	
	void StudentLogin(String name,String pwd)
	{
		System.out.println("Login details are : "+name+"   "+pwd);
	}
	
	void StudentMobile(long mobile)
	{
		System.out.println("Mobile No. is : "+mobile);
	}
	
	Assignment_9_Constructor()
	{
		System.out.println(" This is non parameter constructor");
	}
	
	Assignment_9_Constructor(int i, int j)
	{
		int addition=i+j;
		System.out.println("Addition of i & j is :  "+addition);
	}
	
	Assignment_9_Constructor(String flatNo,String SocietyName)
	{
		
		System.out.println("Address details are  :  "+flatNo +"  "+SocietyName);
	}
	public static void main(String[] args) 
	{
		add(7,8);
		sub(90,46);
		multi(12,12);
		
		Assignment_9_Constructor obj=new Assignment_9_Constructor();
		Assignment_9_Constructor obj2=new Assignment_9_Constructor(30,40);
		Assignment_9_Constructor obj3=new Assignment_9_Constructor("A208","Kunjban");
		
		
		obj.StudentName("Supriya");
		obj.StudentLogin("Supriya", "12345");
		obj.StudentMobile(1345789452);
	}
}
