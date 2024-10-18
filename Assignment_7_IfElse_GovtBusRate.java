package assignments_AB45;

public class Assignment_7_IfElse_GovtBusRate {
	public static void main(String[] args) {
		int age = 68;
		char gender = 'M';

		if (gender == 'F') 
		{
			System.out.println("Free travelling for every woman, No ticket");
		} else if (gender == 'M')
		{
			if (age <= 2)
			{
				System.out.println("Infant : No Ticket");
			} 
			else if (age <= 12)
				  {
					System.out.println("Child : Half Ticket");
				  }
				 else if (age <= 65)
					   {
				   	     System.out.println("adult : Full Ticket");
					   }
				      else if (age > 65)
				      {
				    	  if (age <= 100)
				    		  System.out.println("Senior Citizen:Half Ticket");
				    	  else
				    		  System.out.println("Can't travel");
				      }

		}
	}
}
