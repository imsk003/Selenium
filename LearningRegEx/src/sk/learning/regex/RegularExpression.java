package sk.learning.regex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegularExpression {

	public static void main(String args[]) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SK\\git\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rediff.com/");
			
//		clicking on login button
//		driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); //by css selector
		
//		clicking on login button
		driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click(); //by xpath		
		
//		driver.close();
	}
}
