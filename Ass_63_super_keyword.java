package assignments_AB45;
class AB
{
	String s="parent var";
	void add ()
	{
		System.out.println("Parent add");
	}
}
public class Ass_63_super_keyword extends AB
{

	String s="Child var";
	void add ()
	{
		super.add();
		System.out.println("child add");
	}
	public static void main(String[] args) 
	{
		AB a=new Ass_63_super_keyword();
		a.add();
		System.out.println(a.s);

	}

}
