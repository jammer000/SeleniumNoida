package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.instagram.com/ ");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.name("username")).sendKeys("topporajanjames");
		
		driver.findElement(By.name("password")).sendKeys("myloverose");
		
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3] ")).click();
	String Title=driver.getTitle();
	System.out.println(Title);
	
	if(Title.equals("Instagram")) {
		System.out.println("passed");	
	} else {
		System.out.println("failed");
	}
	String url= driver.getCurrentUrl();
	
	System.out.println(url);
	Thread.sleep(6000);
	
	//driver.close();	
	}

}
