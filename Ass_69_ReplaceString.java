package assignments_AB45;

public class Ass_69_ReplaceString
{

	public static void main(String[] args) 
	{
		String str="Manish Tiwari";
		System.out.println("Old String:"+"  "+str);
		String str1=str.replace("Tiwari", "Kumar");
		                 //OR
		String str2=str.replaceAll("Tiwari", "Kumar");
		System.out.println("New String:"+"  "+str2);

	}

}
