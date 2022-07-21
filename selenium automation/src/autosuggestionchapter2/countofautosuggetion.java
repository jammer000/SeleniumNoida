package autosuggestionchapter2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countofautosuggetion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("seleni");
		Thread.sleep(3000);
		
		List<WebElement> el = driver.findElements(By.xpath("//li[@role=\"presentation\"]"));
	System.out.println(el.size());
	
	for(WebElement b: el) {
		System.out.println(b.getText());
		}
		
		driver.close();

	}

}

