package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("toppo.rajan");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("rajananda");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		
		
		
		
		

	}

}
