package Scrollbar;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class scroll0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		JavascriptExecutor ja = (JavascriptExecutor)driver;
		ja.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(2000);
		ja.executeScript("window.scrollBy(0,-5000)");
		
		Thread.sleep(3000);
		
	
	
	}

	
}
