package Scrollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class skillary {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
		 
		WebElement el = driver.findElement(By.xpath("//*[@id=\"category_li\"]/li[29]/a"));
		
		Point loc = el.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor ja = (JavascriptExecutor)driver;
		ja.executeScript("window.scrollBy("+x+", "+y+")");
		
		Thread.sleep(3000);
	
		el.click();
		System.out.println("all good");
		
	}

}
