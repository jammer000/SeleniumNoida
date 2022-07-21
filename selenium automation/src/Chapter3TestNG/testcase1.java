package Chapter3TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;


public class testcase1 {
public WebDriver driver;

	@BeforeMethod

public void openapp() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
}
	@Test
	
	public void login() {
		  driver.findElement(By.id("email")).sendKeys("");
		  driver.findElement(By.name("pass")).sendKeys("xxxxxx");
		  driver.findElement(By.name("login")).click();
		  String title = driver.getTitle();
		
		Reporter.log(title,true);
		
		String url = driver.getCurrentUrl();
	}
	@AfterMethod
	public void close() {
	driver.quit();

	}
	
}
