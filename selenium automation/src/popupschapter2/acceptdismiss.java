package popupschapter2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class acceptdismiss {

	public static void main(String[] args) throws InterruptedException {
	
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoapp.skillrary.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 WebElement ele = driver.findElement(By.id("course"));
		 Actions a = new Actions(driver);
		 a.moveToElement(ele).perform();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()=\"Selenium Training\"][1]")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//button[@ondblclick=\"addtocart()\"]")).click();
		 Thread.sleep(3000);
		 Alert a1 = driver.switchTo().alert();
		 Thread.sleep(3000);
		 System.out.println(a1.getText());
		 a1.accept();
		 //a1.dismiss()
		 
		System.out.println("good");
	}

}
