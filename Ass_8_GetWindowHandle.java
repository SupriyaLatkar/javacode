package assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ass_8_GetWindowHandle
{
public static void main(String[] args) 
{
	//System.out.println("1");

	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	String title=driver.getTitle();
	System.out.println(title);
	
	System.out.println(driver.getWindowHandle());
	System.out.println(driver.getWindowHandles());
	
	
	
}
}
