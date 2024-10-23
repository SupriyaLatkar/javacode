package assignments_AB45;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Ass_47_TestNG
{

	@Test
	public void TC1()
	{
		System.out.println("TestCase1");
	}
	
	@AfterMethod
	public void AM()
	{
		System.out.println("AM");
	}
	@BeforeSuite
	public void BS()
	{
		System.out.println("BS");
	}
	
	@AfterClass
	public void AC()
	{
		System.out.println("AC");
	}
}
