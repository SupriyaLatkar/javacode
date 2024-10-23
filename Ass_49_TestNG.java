package assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass_49_TestNG 
{
	@BeforeMethod
	public void BM()
	{
	System.out.println("BM");	
	}
	
	@Test
	public void Test1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
	    driver.findElement(By.name("email")).sendKeys("supriyapleasure@gmail.com");
	    driver.findElement(By.name("pass")).sendKeys("123456");
	    driver.findElement(By.name("login")).click();
	    System.out.println("Test1");
	}
	

	@Test
	public void Test2()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("toys for kids");
		 System.out.println("Test2");
	}
	
	@AfterMethod
	public void AM()
	{
	System.out.println("AM");	
	}
	
	
}
