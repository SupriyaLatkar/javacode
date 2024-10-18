package assignments_AB45;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ass_88_Map_Iterator 
{

	public static void main(String[] args) 
	{
	
		Map <String, String> m1=new HashMap<String, String> ();
		m1.put("1", "Pune");
		m1.put("2", "Mumbai");
		m1.put("3", "Nagpur");
		m1.put("3", "Mumbai");
		m1.putIfAbsent("5", "Chennai");
		System.out.println(m1);
		
			
		for(String s1:m1.keySet())
		{
			System.out.println(s1);
		}
		
		for(String s1:m1.values())
		{
			System.out.println(s1);
		}
		
		
	   for (Entry<String,String> s3: m1.entrySet())
		{
			System.out.println(s3);
		}
		
		Set <Entry<String,String>> p1=m1.entrySet();
		Iterator <Entry<String,String>> i1=p1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		Map <Integer,String> m2=new HashMap <Integer,String> ();
		Map m21=new HashMap();
		m21.put(4, "Supriya");
		m21.put(5, "Bhavani");
		m21.put(6, "Pranali");
		System.out.println(m21);
		
		m21.putAll(m1);
		System.out.println(m21);
		
		m21.clear();
		System.out.println(m21.isEmpty());
		m21.putIfAbsent(7, "Nisha");
		System.out.println(m21);
	}
}
