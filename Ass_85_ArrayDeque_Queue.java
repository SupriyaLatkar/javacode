package assignments_AB45;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ass_85_ArrayDeque_Queue
{
   public static void main(String[] args) 
   {
	   Queue s1=new PriorityQueue();
	  
	    s1.add(12);
		s1.add("Super");
		s1.add(null);
		s1.add(null);
		s1.add(45);
		s1.add("Pune");
		System.out.println("*************ArrayDeque***************");
		System.out.println(s1);
		
		System.out.println("*************Iteration***************");
		Iterator i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		Queue s2=new PriorityQueue();
		s2.add(127);
		s2.add(127);
		s2.add(321);
		s2.add(897);
		s2.add(549);
		
		//Collections.sort(s2);
		System.out.println("********New ArrayDeque After sort****************");
		System.out.println(s2);
		
   }
}
