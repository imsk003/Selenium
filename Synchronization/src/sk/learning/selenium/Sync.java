package sk.learning.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync {

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SK\\git\\Selenium\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.id("FH-origin")).sendKeys("che");
		Thread.sleep(1000);
		driver.findElement(By.id("FH-origin")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("FH-origin")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("FH-destination")).sendKeys("new");
		Thread.sleep(1000);
		driver.findElement(By.id("FH-destination")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("FH-destination")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("FH-fromDate")).click();
		driver.findElement(By.xpath("//*[@id='FH-fromDate-label']/div/div/div[2]/table/tbody/tr[4]/td[5]/button")).click();
		driver.findElement(By.id("FH-searchButtonExt1")).click();
		
//		WebDriverWait d=new WebDriverWait(driver,10);
//		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
//		Thread.sleep(5000L);

		driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();		
	}
}
