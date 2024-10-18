package assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_3_Facbook_login {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
	    driver.findElement(By.name("email")).sendKeys("supriyapleasure@gmail.com");
	    driver.findElement(By.name("pass")).sendKeys("123456");
	    driver.findElement(By.name("login")).click();

	}

}
