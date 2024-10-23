package assignments_AB45;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass_48_TestNG 
{
@BeforeMethod
public void BM()
{
System.out.println("BM");	
}

@Test
public void Test()
{
System.out.println("Test");	
}

@AfterMethod
public void AM()
{
System.out.println("AM");	
}
}
