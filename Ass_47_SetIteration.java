package assignments_AB45;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ass_47_SetIteration
{

	public static void main(String[] args) 
	{
	
		Set s1=new HashSet();
		
		s1.add(12);
		s1.add("Super");
		s1.add(null);
		s1.add(null);
		s1.add(45);
		System.out.println("*************HashSet***************");
		System.out.println(s1);
		
		System.out.println("*************Iteration***************");
		Iterator i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		Set s2=new HashSet();
		s2.add(127);
		s2.add(456);
		s2.add(321);
		s2.add(897);
		s2.add(549);
		
		System.out.println("********New HashSet****************");
		System.out.println(s2);
		System.out.println("********Before Sort****************");
		System.out.println(s2);
		//Collections.sort((List<T>) s2);
		//System.out.println("********Afetr Sort****************");
		//System.out.println(s2);
		
	}
}
