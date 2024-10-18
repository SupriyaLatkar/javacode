package assignments_AB45;
// ranom area of circle

import java.util.*;
public class Assignment_23
{
	static double pi=Math.PI;
	
	static void area(double r)

	{
		double area=pi*r*r;
		System.out.println("Area of circle is "+area);
	}
	public static void main(String[] args)
  {
	for (int i=0;i<10;i++)
	{
	  double r1=Math.random();
	  System.out.println("Radius of circle is "+r1);
	  
	   area(r1);

	}	
  }
}
