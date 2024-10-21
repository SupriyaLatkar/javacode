package assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass_13_Amz_srchBook_PowerOfMind 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s1=new Select(e1);
		s1.selectByVisibleText("Books");
	
		WebElement e2=driver.findElement(By.id("twotabsearchtextbox"));
		e2.sendKeys("Power Of Minds");
		e2.sendKeys(Keys.ENTER);
		

	}

}
