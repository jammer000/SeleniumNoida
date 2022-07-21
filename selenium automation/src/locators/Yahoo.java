package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com/?fr2=inr ");
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //*[@id=\"ysignin\"]/div")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("login-username")).sendKeys("james_raul2004");
		Thread.sleep(3000);
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login-passwd")).sendKeys("@toppomolpa");
		Thread.sleep(3000);
		driver.findElement(By.id("login-signin")).click();
		
	}

}
