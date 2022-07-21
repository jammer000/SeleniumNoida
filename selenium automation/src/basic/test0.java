package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://web.whatsapp.com/ ");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
