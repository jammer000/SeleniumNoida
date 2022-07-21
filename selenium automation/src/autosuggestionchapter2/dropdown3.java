package autosuggestionchapter2;
import org.openqa.selenium.By;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropdown3 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("cars"));
		Select s = new Select(ele);
		
		s.selectByIndex(0);
		Thread.sleep(3000);
		
		s.selectByValue("99");
		Thread.sleep(3000);
		s.selectByIndex(2);
		
		//s.selectByVisibleText(null);
		Thread.sleep(3000);
		s.deselectByIndex(2);
		Thread.sleep(3000);
		s.deselectByValue("99");
		Thread.sleep(3000);
		
		s.deselectByIndex(0);
		
		
	driver.close();
		
		
	}

}
