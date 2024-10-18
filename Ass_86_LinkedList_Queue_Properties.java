package assignments_AB45;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class Ass_86_LinkedList_Queue_Properties
{
	public static void main(String[] args) 
	{
		Queue l1=new LinkedList();
		l1.add(12);
		l1.add("Super");
		l1.add(null);
		l1.add(null);
		l1.add(45);
		System.out.println("*************Queue LinkedList***************");
		System.out.println(l1);
		
		System.out.println("*************Iteration***************");
		Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		
		Queue l2=new LinkedList();
		l2.add(127);
		l2.add(456);
		l2.add(321);
		l2.add(897);
		l2.add(549);
		
		System.out.println("********Before Sort****************");
		System.out.println(l2);
		//Collections.sort(l2);
		//System.out.println("********Afetr Sort****************");
		//System.out.println(l2);
	}

}
