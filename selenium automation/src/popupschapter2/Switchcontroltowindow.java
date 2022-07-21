package popupschapter2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchcontroltowindow {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	
	String Parent = driver.getWindowHandle();
	Set<String> child = driver.getWindowHandles();
	System.out.println(child.size());
	
	
	driver.findElement(By.xpath("//a[text( )=\" GEARS \"]")).click();

for(String b:child) {
		
		driver.switchTo().window(b);
	}

	
	driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();


	System.out.println("all good");

	}

}
