package assignments_AB45;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ass_86_LinkedList_Properties
{
	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add(12);
		l1.add("Super");
		l1.add(null);
		l1.add(null);
		l1.add(45);
		System.out.println("*************LinkedList***************");
		System.out.println(l1);
		
		System.out.println("*************Iteration***************");
		Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println("*************ListOfIterator***************");
		ListIterator i2=l1.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		LinkedList l2=new LinkedList();
		l2.add(127);
		l2.add(456);
		l2.add(321);
		l2.add(897);
		l2.add(549);
		
		System.out.println("********Before Sort****************");
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println("********Afetr Sort****************");
		System.out.println(l2);
	}

}
