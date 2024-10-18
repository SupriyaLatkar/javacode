package assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_9_LeraningHTML 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///E:/Supriya%20Software%20Course%20Material/learningHTML.html");
		driver.manage().window().maximize();
		//usernme
		WebElement e1=driver.findElement(By.xpath("(html/body/input)[1]"));
		e1.sendKeys("Supriya");
		
		//hint		
		WebElement e4=driver.findElement(By.xpath("(html/body/input)[2]"));
		e4.sendKeys("hint");
		
		//passowrd	
		WebElement e5=driver.findElement(By.xpath("(html/body/input)[3]"));
		e5.sendKeys("1234");
		
		//first Name
		WebElement e6=driver.findElement(By.xpath("((html/body/form)[1]/input)[1]"));
		e6.sendKeys("FN:Supriya");
		
		//i have boy
		WebElement e2=driver.findElement(By.xpath("((html/body/form)[2]/input)[1]"));
		e2.click();
		
		//i have girl
		WebElement e3=driver.findElement(By.xpath("((html/body/form)[2]/input)[2]"));
		e3.click();
		
		//i have baby
		WebElement e7=driver.findElement(By.xpath("((html/body/form)[2]/input)[3]"));
		e7.click();
		
		//male
		WebElement e8=driver.findElement(By.xpath("(html/body/input)[4]"));
		e8.click();
		
		//female
		WebElement e9=driver.findElement(By.xpath("(html/body/input)[5]"));
		e9.click();
		
		//ready to relocate
		WebElement e10=driver.findElement(By.xpath("(html/body/input)[6]"));
		e10.click();
		
		
	}

}
