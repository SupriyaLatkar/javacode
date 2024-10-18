package assignments_AB45;

public class Ass_93_Encapsulation
{
	private String username="Supriya";

	
	public String getUsername()
	{
		return username;
	}


	public void setUsername(String username) 
	{
		this.username = username;
	}


	public static void main(String[] args) 
	{
		Ass_93_Encapsulation e=new Ass_93_Encapsulation();
		e.setUsername("Anish");
		System.out.println(e.getUsername());

	}

}
