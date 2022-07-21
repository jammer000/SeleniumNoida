package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 facebooklogin fb = new  facebooklogin(driver);
		 fb.user("toppo.rajan@gmail.com");
		 fb.password("faceopen");
		 fb.login();
		
		System.out.println("all good");
	}

}
