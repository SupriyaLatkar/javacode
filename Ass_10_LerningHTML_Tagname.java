package assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_10_LerningHTML_Tagname 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///E:/Supriya%20Software%20Course%20Material/learningHTML.html");
		driver.manage().window().maximize();
		//usernme
		WebElement e1=driver.findElement(By.xpath("//input[@name='username']"));
		e1.sendKeys("Supriya");
		
		//hint		
		WebElement e4=driver.findElement(By.xpath("//input[@name='say hello']"));
		e4.sendKeys("hint");
				
				//passowrd	
				WebElement e5=driver.findElement(By.xpath("//input[@name='password']"));
				e5.sendKeys("1234");
				
				//first Name
				WebElement e6=driver.findElement(By.xpath("//input[@name='fname']"));
				e6.sendKeys("FN:Supriya");
				
				//i have boy
				WebElement e2=driver.findElement(By.xpath("//input[@name='name1']"));
				e2.click();
				
				//i have girl
				WebElement e3=driver.findElement(By.xpath("//input[@name='name2']"));
				e3.click();
				
				//i have baby
				WebElement e7=driver.findElement(By.xpath("//input[@name='name3']"));
				e7.click();
				
				//male
				WebElement e8=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
				e8.click();
				
				//female
				WebElement e9=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
				e9.click();
				
				//ready to relocate
				WebElement e10=driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
				e10.click();
				
	}

}
