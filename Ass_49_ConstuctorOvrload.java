package assignments_AB45;

public class Ass_49_ConstuctorOvrload 
{
	Ass_49_ConstuctorOvrload ()
	{
		System.out.println("Non Para");
	}
	Ass_49_ConstuctorOvrload (int x)
	{
		System.out.println("Int Para");
	}
	Ass_49_ConstuctorOvrload (String s)
	{
		System.out.println("string Para");
	}
	Ass_49_ConstuctorOvrload (double a,double b)
	{
		System.out.println("2 Para");
	}
	public static void main(String[] args)
	{
		Ass_49_ConstuctorOvrload ob=new Ass_49_ConstuctorOvrload ();
		new Ass_49_ConstuctorOvrload (34);
		new Ass_49_ConstuctorOvrload ("Hi");
		new Ass_49_ConstuctorOvrload (56.67,34.12);
	}

}
