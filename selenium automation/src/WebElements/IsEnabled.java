package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 WebElement btn = driver.findElement(By.id("email"));
 
 
 if(btn.isEnabled()) {
	 System.out.println("pass");
	 btn.click();
	 Thread.sleep(3000);
	 
 } else 
 {
	 System.out.println("fail");
 }
		

	}

}
