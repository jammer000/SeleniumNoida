package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffmail {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/ ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1] ")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login1")).sendKeys("james_raul2004");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("ranjan");
		Thread.sleep(3000);
		driver.findElement(By.name("proceed")).click();
		
		
		

	}

}
