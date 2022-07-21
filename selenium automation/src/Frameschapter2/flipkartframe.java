package Frameschapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartframe {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement el = driver.findElement(By.xpath("//a[text()='Login']"));
		
		Actions a = new Actions(driver);
			a.moveToElement(el).click();
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.name("q")).sendKeys("saree");
		
		System.out.println("all good");
		

	}
	
}

