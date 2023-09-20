package Jaguar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		WebDriver dev = new ChromeDriver();
		dev.get("https://www.google.com/");
		
		
		
	}

}
