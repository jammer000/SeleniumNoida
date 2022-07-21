package popupschapter2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowswitching {

	public static void main(String[] args) {

 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.makemytrip.com/");
 
 // new tab 
 driver.switchTo().newWindow(WindowType.TAB);
	 
driver.get("https://www.skillrary.com/#");
driver.findElement(By.name("q")).sendKeys("apache commoms.io");

// new tab
driver.switchTo().newWindow(WindowType.TAB);

driver.get("https://www.naukri.com/");
driver.findElement(By.xpath("//input[@class=\"suggestor-input \"][1]")).sendKeys("java");

 
 String parent = driver.getWindowHandle();
 Set<String> child = driver.getWindowHandles();
 

for(String b: child) {
	driver.switchTo().window(b);
	String title = driver.getTitle();
	System.out.println(title);
	
}
	
 System.out.println("all good");
 
 
 
 
 
 
 
 
 
	}
	
	

}
