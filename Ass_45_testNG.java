package assignments_AB45;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Ass_45_testNG 
{
@Test
 	public void login_Amazon()
	{
	System.out.println("test");
	}

@AfterMethod
	public void AfterMethod()
	{
	System.out.println("AfterMethod");	
	}

@AfterClass
	public void AfterClass()
	{
	System.out.println("AfterClass");	
	}
}
