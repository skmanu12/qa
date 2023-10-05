package smaple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
@Test
public void testing() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\manappa.kalmani\\OneDrive - Qualitest Group\\Manappa\\Credential\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://manappa12sk.azurewebsites.net/webapp/");
	String expect=driver.findElement(By.xpath("//h1[normalize-space()='RahulShettyAcademy.com Learning']")).getText().trim();
Assert.assertEquals("RahulShettyAcademy.com Learning", expect);
}
}
