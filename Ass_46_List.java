package assignments_AB45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ass_46_List 
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
		
		Iterator i1=l1.iterator();
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		Collections.sort(l1);
		System.out.println("After sort "+l1);
		
        List l2=new ArrayList();
		
		l2.add(53);
		l2.add("Amey");
		l2.add(false);
		l2.add(99.87);
		l2.add("Anish");
		l2.addAll(l1);
		System.out.println(l2);
		
	   }
}
