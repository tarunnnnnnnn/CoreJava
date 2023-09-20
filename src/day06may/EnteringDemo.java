package day06may;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringDemo {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			String actUrl =("https://www.letskodeit.com/practice");
			driver.get(actUrl);
		//	driver.manage().window().maximize();
			String ExpUrl =("https://www.letskodeit.com/practice");
			if (ExpUrl.equals(actUrl))
			System.out.println("it is passed url");
			else
				System.out.println("it is not passed");
			
			WebElement txtEle = driver.findElement(By.id("autosuggest"));
			
			txtEle.sendKeys("tarun" +  "  rushi ");
			
			
		
			
			
			 	
			
	}

}
