package assignments_AB45;

public class Ass_48_Overloading 
{
	void add(int x, int y)
	{
		System.out.println("Add with int");
	}
	
	void add(float x, float y)
	{
		System.out.println("Add with float");
	}
	void add(long x, long y)
	{
		System.out.println("Add with long");
	}
	void add(String str)
	{
		System.out.println("Add with String");
	}
	public static void main(String[] args) 
	{
		Ass_48_Overloading ob=new Ass_48_Overloading();
		ob.add(6,70);
		ob.add(56.78f, 89.45f);
		ob.add(67565655454l, 6776765654l);
		ob.add("Hi");
	}
}
