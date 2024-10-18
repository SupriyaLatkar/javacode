package assignments_AB45;

public class Ass_90_StringBuilder
{

	public static void main(String[] args) 
	{
		StringBuilder s1=new StringBuilder("Supriya");
		
		System.out.println("Old string: "+" "+s1);
		
		s1.append(" Latkar");
		
		
		System.out.println("Append "+" "+s1);
		
		
		s1.insert(8, "Amey ");
		System.out.println("insert:  "+" "+s1);
        
		s1.replace(0, 7, "Anish");
		System.out.println("replace "+" "+s1);
		
		System.out.println("Capacity"+" "+s1.capacity());
		
		System.out.println("CharAt"+" "+s1.charAt(0));
		System.out.println("length "+" "+s1.length());
		System.out.println("substring "+" "+s1.substring(0, 8));
	    s1.reverse();
		System.out.println("reverse string: "+" "+s1);
		
		s1.delete(0, 5);
		System.out.println("delete string: "+" "+s1);
		
		
		
	}

}
