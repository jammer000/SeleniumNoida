package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 WebElement user = driver.findElement(By.id("email"));
 
 		if(user.isDisplayed()) {
 			System.out.println("pass: element is displayed");
 			//user.sendKeys("faceopen");	
 		} else {
 			System.out.println(" fail: element is not displayed");
 		}
 		//driver.close();
 		System.out.println(user.isDisplayed());
	}

}
