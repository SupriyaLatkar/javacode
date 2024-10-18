package assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_2_Google_type_India {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://cars.tatamotors.com");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
	    //driver.findElement(By.name("q")).sendKeys("Tata Curvv");
	    
	    //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	    //below one not clicking on 'google search' button so line 21 written with 'enter' key
	    //driver.findElement(By.name("btnK")).click();

	}

	

}
