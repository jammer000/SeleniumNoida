package autosuggestionchapter2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement btn = driver.findElement(By.id("course"));
		 Actions a = new Actions(driver);
		 a.moveToElement(btn).perform();
	driver.findElement(By.xpath("//*[@id=\"trending\"]/li[1]/a")).click();
	Thread.sleep(3000);
	WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"add\"]/i"));
	Thread.sleep(3000);
	a.doubleClick(ele1).perform();

}   
}