package smaple;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert.*;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
@Test
public void testing() {
	
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("--start-maximized");
	chromeOptions.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(chromeOptions);

	driver.get("https://manappa12sk.azurewebsites.net/webapp/");
	String expect=driver.findElement(By.xpath("//h1[normalize-space()='RahulShettyAcademy.com Learning']")).getText().trim();
System.out.println(expect);
Assert.assertTrue(expect.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
}
}
