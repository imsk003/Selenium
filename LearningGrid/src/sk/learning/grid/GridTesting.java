package sk.learning.grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridTesting {
		
		WebDriver driver;
	   
	   @BeforeTest
	   public void launchapp() throws MalformedURLException {
	      
		   	String URL = "http://www.calculator.net";
		   	
	         String Node = "http://localhost:4444/wd/hub";
	         DesiredCapabilities cap = DesiredCapabilities.firefox();
	         cap.setBrowserName("firefox");
	         
	         driver = new RemoteWebDriver(new URL(Node), cap);

	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
	         driver.navigate().to(URL);
	         driver.manage().window().maximize();
	 
	   }
	   
	   @Test
	   public void calculation() {
		   // Click on number 8
		   driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();
		      
		   // Click on plus
		   driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
		      
		   // Click on number 5
		   driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();

		   // Get the Result
		   String result = driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]")).getText();
	      
	      System.out.println(" The Result is " + result);
	      
	      if(result.equals(" 13")) {
	         System.out.println(" The Result is Pass");
	      } else {
	         System.out.println(" The Result is Fail");
	      }
	   }
	   
	   @AfterTest
	   public void closeBrowser() {
	      driver.quit();
	   }
}
