package assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_7_AmazonPartialLinkText_CustService {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.partialLinkText(" Service"));
		e1.click();

	}

}
