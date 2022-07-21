package popupschapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class skill2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.findElement(By.xpath("//a[text()=\" GEARS \"]")).click();
		driver.findElement(By.xpath("(//a[text()=\" SkillRary Demo APP\"])[2]")).click();
		
		//driver.findElement(By.xpath("(//a[text()=\"Selenium Training\"])[2]")).click();
		//driver.switchTo().newWindow(WindowType.TAB);
		
		driver.findElement(By.xpath("(//a[text()=\"Selenium Training\"])[2]")).click();
		
		driver.close();
		
		
System.out.println("good");
	}

}
