package WebElements;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class sizeofsearchbar {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.id("inputValEnter"));
		Dimension s = ele.getSize();
		System.out.println(s.getHeight() + " height of element");
		System.out.println(s.getWidth() +  "width of element ");
		
		driver.close();
	}

}
