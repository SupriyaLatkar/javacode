package assignments_AB45;
 class ABC
{
	int a=10;
  void add()	
  {
	  System.out.println("In ABC add ()");
  }
}
public class Ass_40_Upcasting extends ABC
{

	public void sub()
	{
		System.out.println("In sub()");
	}
	public static void main(String[] args) 
	{
		ABC ob=new Ass_40_Upcasting();
		System.out.println(ob.a);
		ob.add();
		
	}

}
