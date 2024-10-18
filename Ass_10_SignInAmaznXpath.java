package assignments_AB45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_10_SignInAmaznXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Flanguage%3Den_IN%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
	  WebElement e1=driver.findElement(By.xpath("//input[@id='ap_email']"));
	  e1.sendKeys("supriya@gmail.com");
	  
	  WebElement e2=driver.findElement(By.xpath("//input[@id='continue']"));
	  e2.click();
	  
	  WebElement e3=driver.findElement(By.xpath("//input[@id='ap_password']"));
	  e3.sendKeys("1234");
	  
	  WebElement e4=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	  e4.click();
	

	}

}
