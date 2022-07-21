package autosuggestionchapter2;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countmyntra {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]"));
		ele.sendKeys("dress");
		
		Thread.sleep(3000);
		List<WebElement> search = driver.findElements(By.xpath("//li[@class=\"desktop-suggestion null\"]"));
		System.out.println(search.size());
		
		for(WebElement b:search) {
			System.out.println(b.getText());
		}
		driver.close();
	}

}
