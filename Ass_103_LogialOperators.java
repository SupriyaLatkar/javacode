package assignments_AB45;

public class Ass_103_LogialOperators 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		
		if(a==10&&b==20)
			System.out.println("Logical AND");
		
		if(a==10||b==20)
			System.out.println("Logical OR");
		
		if(!(a==20&&b==40))
			System.out.println("Logical AND with Not");

		if(!(a==20||b==30))
			System.out.println("Logical OR with Not");
	}

}
