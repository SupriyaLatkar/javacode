package assignments_AB45;
class Parent1
{
	String s="parent var";
	void add ()
	{
		System.out.println("Parent add");
	}
}
public class Ass_62_methodOverriding extends Parent1
{

	String s="Child var";
	void add ()
	{
		super.add();
		System.out.println("child add");
	}
	public static void main(String[] args) 
	{
		Parent1 a=new Ass_62_methodOverriding();
		a.add();
		System.out.println(a.s);

	}

}
