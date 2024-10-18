package assignments_AB45;

public class Ass_59_child2 extends Ass_59_Parent
{

	int c=98;
	void multi()
	{
		System.out.println("In multi");
	}
	public static void main(String[] args) 
	{
		Ass_59_child2 ob=new Ass_59_child2();
		System.out.println("Value of a"+ob.a);
		System.out.println("Value of b"+ob.c);
		ob.add();
		ob.multi();;
		

	}

}
