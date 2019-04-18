package sk.learning.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SK\\git\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/"); 
		
		WebElement search=driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input"));
		search.clear();
		search.sendKeys("cric");
		Thread.sleep(500);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ENTER);
		driver.close();
	}

}
