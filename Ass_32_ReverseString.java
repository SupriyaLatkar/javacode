package assignments_AB45;



public class Ass_32_ReverseString 
{

	public static void main(String[] args) 
	{
	  String ip="Supriya";
	  String op="";
	  
	 
	  for(int i=0;i<ip.length();i++)
	  {
		  char ch=ip.charAt(i);
		  op=ch+op;
		  System.out.println(op);
	  }
	  
	  /*for(int i=ip.length()-1;i>=0;i--)
	  {
		  char ch=ip.charAt(i);
		  //op=op+ch;
		  System.out.print(ch);
	  }*/
	  
	  System.out.println("Output is :"+op);
	}
}
