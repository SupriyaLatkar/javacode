package assignments_AB45;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ass_46_testNG
{
 @BeforeTest
	public void BeforeTest()
	{
	System.out.println("BeforeTest");	
	}
 @BeforeClass
    public void BeforeClass()
    {
      System.out.println("BeforeClass");	
    }
 @BeforeMethod
    public void BeforeMethod()
    {
      System.out.println("BeforeMethod");	
    }
 @AfterMethod
    public void AfterMethod()
    {
      System.out.println("AfterMethod");	
    }
 @Test
	public void login_Amazon()
	{
		System.out.println("test");
	}
}
