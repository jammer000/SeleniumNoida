package Chapter3TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcase2 {
	public WebDriver driver;
	
@BeforeMethod
public void openApp() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
@Test
public void forgotpaswword() {
	driver.findElement(By.linkText("Forgotten password?")).click();
	driver.findElement(By.id("identify_email")).sendKeys("xxxxxxx");
	driver.findElement(By.name("did_submit")).click();
	Reporter.log(driver.getTitle(),true);
Reporter.log(driver.getCurrentUrl(),true);
}

@AfterMethod
public void closeApp() {
	driver.quit();
	
	
}
}
