package assignments_AB45;

public class Ass_102_NestedIfElse 
{

	public static void main(String[] args)
	{
		int a=20;
		int b=30;
		int c=40;
		
		if(a<15)
			System.out.println("First If ");
		else
		{
			if(b>20)
			{
				System.out.println("Seond IF");
			}
			else
			{
				System.out.println("Nested Else");
			}
		}

	}

}
