package assignments_AB45;

public class Ass_66_InterfaceClass implements Ass_66_Interfce
{

	public void add() 
	{
		
		System.out.println("In add");
	}

	public void sub() 
	{
		System.out.println("In sub");
		
	}

	
	public void uersname()
	{
		System.out.println("In username");
		
	}

	public static void main(String[] args) 
	{
		Ass_66_InterfaceClass  ob=new Ass_66_InterfaceClass();
		ob.add();
		ob.sub();
		ob.uersname();
	}
}
