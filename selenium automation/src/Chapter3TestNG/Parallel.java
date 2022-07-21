   package Chapter3TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Parameters;

public class Parallel {
	public WebDriver driver;
	
	@Parameters({"browserName"})
	
	@Test
	
	public void demo(String browser) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
			
		} else {
			driver= new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.id("email")).sendKeys("toppo.rajan@gmail.com");
		  driver.findElement(By.name("pass")).sendKeys("faceopen");
		  driver.findElement(By.name("login")).click();
		  String title = driver.getTitle();
		
		Reporter.log(title,true);
		 
		String url = driver.getCurrentUrl();
	}
}

	
