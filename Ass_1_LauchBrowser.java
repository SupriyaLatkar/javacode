package assignments_AB45;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ass_1_LauchBrowser
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		EdgeDriver driver1=new EdgeDriver();
		driver1.get("https://www.google.com");
	    FirefoxDriver driver2=new FirefoxDriver();
	    driver2.get("https://www.youtube.com");
		
	    String title=driver.getTitle();
		System.out.println(title);
		
		String title1=driver1.getTitle();
		System.out.println(title1);
		
		String title2=driver2.getTitle();
		System.out.println(title2);
	}
}
