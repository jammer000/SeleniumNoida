package autosuggestionchapter2;
import org.openqa.selenium.By;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class dropdown {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("searchDropdownBox"));
		
		Select s= new Select(ele);
		
		s.selectByIndex(3);
		Thread.sleep(3000);
		
		s.selectByValue("search-alias=computers-intl-ship");
		Thread.sleep(3000);
		s.selectByVisibleText("Electronics");
	

	}

}
