package Frameschapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdeal {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	WebElement el = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]"));
	
	Actions a = new Actions(driver) ;
	a.moveToElement(el).perform();
	driver.findElement(By.xpath("//a[text()='login']")).click();
	driver.switchTo().frame(0);
	
	
	driver.findElement(By.id("userName")).sendKeys("8383910842");
	driver.findElement(By.id("close-pop")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.name("keyword")).sendKeys("cellphones");
	driver.findElement(By.id("inputValEnter")).sendKeys("tv");
	System.out.println("all good");
	
	
	
	
	
	
	}

}
