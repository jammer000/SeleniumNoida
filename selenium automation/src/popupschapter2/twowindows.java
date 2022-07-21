package popupschapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class twowindows {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter location\"]")).sendKeys("delhi");
		
		driver.quit();
		
System.out.println("all good");
	}

}
