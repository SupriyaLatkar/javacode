package assignments_AB45;

public class Ass_58_Child extends Ass_58_Parent
{

	int b=98;
	void sub()
	{
		System.out.println("In sub");
	}
	public static void main(String[] args)
	{
		Ass_58_Child ob=new Ass_58_Child();
		System.out.println("Value of a"+ob.a);
		System.out.println("Value of b"+ob.b);
		ob.add();
		ob.sub();
		
	}

}
