package Jaguar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class laucnchBrowser2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver div = new EdgeDriver();
		div.get("https://www.google.com/");
		div.manage().window().maximize();
		String title = div.getTitle();
		System.out.println("title " + title);
		Thread.sleep(5000l);	
		div.quit();
		System.out.println("NewTitle " +  div.getTitle());
		
		
		
	}

}
