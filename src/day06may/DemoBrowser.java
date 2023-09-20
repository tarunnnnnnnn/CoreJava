package day06may;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBrowser {

	public static void main(String[] args) {
			WebDriver Diver = new ChromeDriver();
			Diver.get("https://www.letskodeit.com/practice");
			
			WebElement textele = Diver.findElement(By.id("autosuggest"));
			textele.sendKeys("gaurav");
			
			
			
			
	}

}
