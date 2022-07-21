package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ISselected {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

WebElement radio = driver.findElement(By.name("sex"));

//WebElement radio = driver.findElement(By.xpath("//input[@id='u_1i_4_ZS']"));

if(radio.isSelected()) {
	System.out.println("pass");  
} else {
	System.out.println("fail");
}	
driver.close();
	}
}
