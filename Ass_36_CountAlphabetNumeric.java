package assignments_AB45;

public class Ass_36_CountAlphabetNumeric 
{
    public static void main(String[] args) 
   {
	String str="Supriya  123$*  ";
	int spcialChar=0;
	
	int count_alphabet=0;
	int count_numeric=0;
	int count_space=0;
	
	char c1[]=str.toCharArray();
	
	for(int i=0;i<str.length();i++)
	{
		boolean b1=Character.isLetter(c1[i]);
		
		if(b1==true)
			count_alphabet++;
		
	}
	
	for(int i=0;i<str.length();i++)
	{
		boolean b1=Character.isDigit(c1[i]);
		
		if(b1==true)
			count_numeric++;
		
	}
	
	for(int i=0;i<str.length();i++)
	{
		boolean b1=Character.isSpaceChar(c1[i]);
		
		if(b1==true)
			count_space++;
		
	}
	
	spcialChar=str.length()-(count_alphabet+count_numeric+count_space);
	
	System.out.println("Count of Alphabets is : "+count_alphabet);
	System.out.println("Count of Numeric is : "+count_numeric);
	System.out.println("Count of spaces is : "+count_space);
	System.out.println("Count of special char is : "+spcialChar);
	
   }
}
