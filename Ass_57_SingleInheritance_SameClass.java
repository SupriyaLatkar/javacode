package assignments_AB45;

class Parent
{

	int a=99;
	public void add()
	{
		System.out.println("In add");
	}
}
public class Ass_57_SingleInheritance_SameClass extends Parent
{
	int b=100;
	void sub()
	{
		System.out.println("In sub");
	}
	
	public static void main(String[] args) 
	{
		Ass_57_SingleInheritance_SameClass ob=new Ass_57_SingleInheritance_SameClass();
		System.out.println("Value of a: "+ob.a);
		System.out.println("Value of a: "+ob.b);
		ob.add();
		ob.sub();
	}

}
