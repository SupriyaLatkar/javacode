package assignments_AB45;

import java.util.Date;

public class Ass_37_currentTime
{

public static void main(String[] args) 
   {
	Date d1=new Date();
	//System.out.println(d1);
	
	Date d2=new Date(d1.getTime());
	//System.out.println(d2);
	
	String str=d2.toString();
	System.out.println(str);
	
	String year= str.substring(str.length()-4);
	System.out.println(year);
	
	String month=str.substring(4, 7);
	System.out.println(month);
	
	String date=str.substring(8, 10);
	System.out.println(date);
	
	String date_format=date.concat("/").concat(month).concat("/").concat(year);
    System.out.println(date_format);
    
   
   
    
   }
}
