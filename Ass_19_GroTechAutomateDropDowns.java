package assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass_19_GroTechAutomateDropDowns
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		WebElement e2= driver.findElement(By.id("Skills"));
		Select s1=new Select(e2);
		//s1.selectByIndex(1);
		  s1.selectByValue("select1");
		//s1.selectByVisibleText("Non-Technical Skills");
		
		WebElement e3= driver.findElement(By.id("Country"));
		Select s2=new Select(e3);
		//s2.selectByIndex(8);
		//s2.selectByValue("Germany");
		s2.selectByVisibleText("United States ");
		
		
		WebElement e4= driver.findElement(By.id("Relegion"));
		Select s3=new Select(e4);
		//s3.selectByIndex(1);
		//s3.selectByValue("Hindu");
		s3.selectByVisibleText("Hindu");
	}

}
