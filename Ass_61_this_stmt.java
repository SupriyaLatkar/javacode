package assignments_AB45;

public class Ass_61_this_stmt 
{
	Ass_61_this_stmt (String s)
	{
		System.out.println("string para");
	}
	Ass_61_this_stmt (double b)
	{
		this("Hi");
		System.out.println("double para");
	}
	Ass_61_this_stmt (int a)
	{
		this(5.6);
		System.out.println("int para");
	}
	Ass_61_this_stmt ()
	{
		this(1);
		System.out.println("No para");
	}
	public static void main(String[] args) 
	{
		new Ass_61_this_stmt();
		//System.out.println();
	}
}
