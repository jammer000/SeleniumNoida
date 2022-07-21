package popupschapter2;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class resumeoploading {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("toppo.rajan@gmail.com");

		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("@toppomolpa");
		
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		

		//driver.findElement(By.xpath("//div[@class='uploadBtn']")).click();
		driver.findElement(By.xpath("//a[text()='Upload']")).click();
		
		
	
		Runtime.getRuntime().exec("C:\\Users\\james\\OneDrive\\Desktop\\rajan.au4.exe");
		
			
			System.out.println("good");
	
	}

}
