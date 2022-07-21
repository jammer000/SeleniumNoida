package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.naukri.com/");
		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div ")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/form/div[2]/input ")).sendKeys("toppo.rajan@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/form/div[3]/input ")).sendKeys("@toppomolpa");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/form/div[6]/button ")).click();
		Thread.sleep(3000);
		
	String title =driver.getTitle();
	System.out.println(title);
	if(title.equals("my naukri ")) {
		System.out.println("passed ");
	} else {
		System.out.println(" failed ");
	}
	String url =driver.getCurrentUrl();
	System.out.println(url);
	
	driver.close();
	Thread.sleep(3000);
	}

}
