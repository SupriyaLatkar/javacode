package assignments_AB45;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass2_52_TestNG2 
{
	static ChromeDriver driver;
	@BeforeMethod
	public void BM()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		System.out.println("BM");
	}
	@Test
	public static void test1()
	{
		
		WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe");
		e1.sendKeys(Keys.ENTER);
		
		System.out.println("Test1");
	}
	@Test
	public static void test2()
	{
				
		test1();
		
	    WebElement e2=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[3]"));
		e2.click();
		
		
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		
		String pid=i1.next();
		String cid=i1.next();
		
		System.out.println(pid);
		System.out.println(cid);
		
		driver.switchTo().window(cid);
		
		
		WebElement e3=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		e3.click();
		System.out.println("Test2");
	}

@AfterMethod
public void AM()
{
		driver.quit();
	System.out.println("AM");
}
}
