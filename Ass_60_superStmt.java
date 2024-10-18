package assignments_AB45;
class ABCD
{

	ABCD(int a)
	{
		System.out.println("In ABCD");
	}
}
public class Ass_60_superStmt extends ABCD
{

	Ass_60_superStmt()
	{
		super(4);
		System.out.println("Hi");
	}
	public static void main(String[] args)
	{
		Ass_60_superStmt a=new Ass_60_superStmt();

	}

}
