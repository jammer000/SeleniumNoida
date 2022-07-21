package popupschapter2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotclass {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//a[text()='4.1.4']")).click();
		
				
		System.out.println("done");		
		
	}

}
