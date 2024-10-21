package assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass_16_HoreoverGroTech {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.xpath("//div[@data-id='1857001']"));
		Thread.sleep(3000);
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		
        Thread.sleep(2000);
        //another xpath for practice3 :(//span[.=' empty!'])[3]
		WebElement e2=driver.findElement(By.xpath("(//div[@class='popup4'])[3]")); 
		Thread.sleep(2000);
		e2.click();
		
//not yet complete
	}

}
