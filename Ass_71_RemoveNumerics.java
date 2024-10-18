package assignments_AB45;

public class Ass_71_RemoveNumerics 
{

	public static void main(String[] args) 
	{
		String str="Supriya Latkar 1234$*@";
		System.out.println("Old String:"+"  "+str);
		String str1=str.replaceAll("[0-9]", " ");
		System.out.println("New String:"+"  "+str1);
	}

}
