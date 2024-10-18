package assignments_AB45;

public class Ass_59_child1 extends Ass_59_Parent
{
	int b=98;
	void sub()
	{
		System.out.println("In sub");
	}

	public static void main(String[] args) 
	{
		Ass_59_child1 ob=new Ass_59_child1();
		System.out.println("Value of a"+ob.a);
		System.out.println("Value of b"+ob.b);
		ob.add();
		ob.sub();

	}

}
