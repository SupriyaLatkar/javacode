package assignments_AB45;

import java.util.InputMismatchException;

public class Ass_42_Exception 
{

	public static void main(String[] args) throws NullPointerException,InputMismatchException
	{
		if(1==2)
			throw new NullPointerException("Sorry cell empty");
		else
			throw new InputMismatchException("U entered wrong value");
      
	}

}
