package sk.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SK\\git\\Selenium\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		//driver.findElement(By.xpath("//input[@value='Milk']")).click();
		
		int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0;i<count;i++) {
			
			String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			
			if(text.equals("Cheese")) {
			
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			
			}
			
		}
		driver.close();
	}

}