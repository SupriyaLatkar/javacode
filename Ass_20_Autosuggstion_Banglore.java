package assignments_AB45;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_20_Autosuggstion_Banglore
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
		//li.get(4).click();
		//li.get(count).click();
		li.get(5).click();
		//li.get(count-10).click();
	}

}
