package assignments_AB45;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Ass_81_Stack_Vector_Properties 
{
public static void main(String[] args) 
{
   Vector v1=new Vector();	
   
    v1.add(12);
	v1.add("Super");
	v1.add(null);
	v1.add(null);
	v1.add(45);
	v1.add("Hi");
	System.out.println("*************Vector***************");
	System.out.println(v1);
	
	System.out.println("********Enumeration****************");
	Enumeration e=v1.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	
	System.out.println("*************Iteration***************");
	
	
	
	Iterator i1=v1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	
	System.out.println("*************ListOfIterator***************");
	ListIterator i2=v1.listIterator();
	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	
	Vector v2=new Vector();	
	v2.add(12);
	v2.add(456);
	v2.add(795);
	v2.add(894);
	v2.add(45);
	v2.add(862);
	

	System.out.println("********Before Sort****************");
	System.out.println(v2);
	Collections.sort(v2);
	System.out.println("********Afetr Sort****************");
	System.out.println(v2);
	
	Stack s1=new Stack();
	s1.add(12);
	s1.add("Super");
	s1.add(null);
	s1.add(null);
	s1.add(45);
	s1.add("Hi");
	System.out.println("*************Stack***************");
	System.out.println(s1);
	
	System.out.println("********Enumeration****************");
	Enumeration e1=s1.elements();
	while(e1.hasMoreElements())
	{
		System.out.println(e1.nextElement());
	}
	
	System.out.println("*************Iteration***************");
	
	
	
	Iterator i3=s1.iterator();
	while(i3.hasNext())
	{
		System.out.println(i3.next());
	}
	
	System.out.println("*************ListOfIterator***************");
	ListIterator i4=s1.listIterator();
	while(i4.hasNext())
	{
		System.out.println(i4.next());
	}
	
	
}
}
