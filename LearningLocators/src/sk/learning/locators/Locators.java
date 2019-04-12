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
		driver.findElement(By.cssSelector("html#facebook body.fbIndex.UIPage_LoggedOut._-kb._61s0._605a.b_c3pyn-ahh.gecko.win.x1.Locale_en_GB.cores-lt4._19_u.hasAXNavMenubar div#u_0_b._li div#pagelet_bluebar div#blueBarDOMInspector div._53jh div.loggedout_menubar_container div.clearfix.loggedout_menubar div.menu_login_container.rfloat._ohf form#login_form table tbody tr td label#loginbutton.uiButton.uiButtonConfirm input#u_0_2")).click();
		
//		identifying element by its linkText
//		clicking on Forgotten account? link
//		driver.findElement(By.linkText("Forgotten account?")).click();
		
//		driver.close();
	}
}
