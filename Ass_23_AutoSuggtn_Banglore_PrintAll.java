package assignments_AB45;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_23_AutoSuggtn_Banglore_PrintAll 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.in");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("Banglore");
		Thread.sleep(5000);
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		
		int count=li.size();
		System.out.println(count);
		Thread.sleep(5000);
		
		for(int i=0;i<count;i++)
		{
			WebElement e2=li.get(i);
			System.out.println(e2.getText());
		}
		

	}

}
