package assignments_AB45;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ass_80_ArrayList_ListOfIteraotor 
{

	public static void main(String[] args) 
	{
	
		List l1=new ArrayList();
		
		l1.add(675);
		l1.add(133);
		l1.add(342);
		l1.add(897);
		l1.add(123);
		System.out.println(l1);
		
		
		// List Of Iterator
		ListIterator i1=l1.listIterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
	}
}
