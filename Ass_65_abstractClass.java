package assignments_AB45;

abstract class ABS1
{
	abstract void add();
	abstract void sub();
	void multi()
	{
		System.out.println("In Multi");
	}
}

abstract class ABS2  extends ABS1
{
	abstract void username();
	abstract void pwd();
	void div()
	{
		System.out.println("In div");
	}
}
 public class Ass_65_abstractClass extends ABS2
{

	   void username() 
	   {
			System.out.println("In username");
			
	   }
	 
	  void pwd() 
	  {
		  System.out.println("In pwd");
		
	  }

	  void add() 
	  {
		
		  System.out.println("In add");
	  }

	
	   void sub() 
	   {
		   System.out.println("In sub");
		
	   }

	public static void main(String[] args) 
	{
		Ass_65_abstractClass ob=new Ass_65_abstractClass();
		ob.add();
		ob.sub();
		ob.multi();
		ob.username();
		ob.pwd();
		ob.div();

	}
}
