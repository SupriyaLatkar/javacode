package assignments_AB45;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ass_83_List_Properties
{
public static void main(String[] args)
{
	//list1
	List l1=new ArrayList();
	
	l1.add(675);
	l1.add(133);
	l1.add(342);
	l1.add(897);
	l1.add(123);
	System.out.println(l1);
	//list2
	List l2=new ArrayList();
	
	l2.add(53);
	l2.add("Amey");
	l2.add(false);
	l2.add(99.87);
	l2.add("Anish");
	System.out.println(l2);
	
	
	//equals
	boolean b1=l1.equals(l2);
	System.out.println(b1);
	
	
	//get at index
	System.out.println(l2.get(4));
	
	
	//remove
	l1.remove(2);
	l2.remove(99.87);
	System.out.println(l1);
	System.out.println(l2);
	
	
	//addAll removeAll
	l2.addAll(l1);
	System.out.println(l2);
	l2.removeAll(l1);
	System.out.println(l2);
	
	
	
	//iterator
	System.out.println("In Iterator");
	Iterator i1=l2.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	
	//ListOfIterator
		System.out.println("In Iterator");
		Iterator i2=l2.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	
	//contains
	
	boolean b3=l2.contains("Amey");
	System.out.println(b3);		
	
	//size
	System.out.println(l2.size());
	
	//clear , isEmpty
	l1.clear();
	System.out.println(l1);
	boolean b2=l1.isEmpty();
	System.out.println(b2);
	
}
}
