package assignments_AB45;

public class Ass_50_LocalGlobalFinal 
{
	static int a=45;
	final  int z=78;
	void test()
	{
		int y=34;
		System.out.println("Value of local var is:"+y);
		
	}
	public static void main(String[] args)
    {
		System.out.println("Value of global var is :"+a);
		a=67;
		System.out.println("Updated value of global var is :"+a);
		
		Ass_50_LocalGlobalFinal ob=new Ass_50_LocalGlobalFinal();
		ob.test();
		System.out.println("Value of final var is :"+ob.z);
	}

}
