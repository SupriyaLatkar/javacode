package assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass_15_AmzHoreOver_Language 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(5000);
		
		WebElement e2=driver.findElement(By.xpath("(//span[@class='nav-text'])[24]"));
		
		e2.click();
		
		
		
	}

}
