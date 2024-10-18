package assignments_AB45;

public class Ass_33_Palindrome
{

	
	public static void main(String[] args) 
	{
	  String ip="madam";
	  String op="";
	  
	  for(int i=0;i<ip.length();i++)
	  {
		  char ch=ip.charAt(i);
		  op=ch+op;
	  }
	  System.out.println("Output is :"+op);
	  
	  if(ip.equals(op)==true)
	  {
		  System.out.println("Yes it is palindrome");
	  }
	  else
	  {
		  System.out.println("No it is not palindrome");
	  }
	}
}
