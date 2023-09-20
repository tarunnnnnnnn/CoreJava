package day06may;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbDemo {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver div = new ChromeDriver();	
		div.get(url);
		div.manage().window().maximize();
		
		WebElement txtmail = div.findElement(By.id("email"));
		txtmail.sendKeys("tarun1@gmail.com");
		
		WebElement txtPwd = div.findElement(By.name("pass"));
		txtPwd.sendKeys("tarun123");
		Thread.sleep(5000l);
		
		WebElement btnlogin = div.findElement(By.name("login"));
		btnlogin.click();
		
		WebElement lnkfog = div.findElement(By.name("97w4"));
		lnkfog.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		

	}

}
