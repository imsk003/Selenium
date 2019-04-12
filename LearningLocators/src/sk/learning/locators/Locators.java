package sk.learning.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SK\\git\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
//		identifying element by its id
//		send keys to email edit text
		driver.findElement(By.id("email")).sendKeys("hello");
		
//		identifying element by its name
//		send keys to password edit text
		driver.findElement(By.name("pass")).sendKeys("world");

//		identifying element by its xpath
//		clicking on login button
//		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		
//		identifying element by its css path
//		clicking on login button
		driver.findElement(By.cssSelector("input#u_0_2")).click();
		
//		identifying element by its linkText
//		clicking on Forgotten account? link
//		driver.findElement(By.linkText("Forgotten account?")).click();
		
//		driver.close();
	}
}
