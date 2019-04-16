package sk.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SK\\git\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
		
		Select select = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));

		select.selectByValue("USD");

		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);
		driver.close();
	}
}
