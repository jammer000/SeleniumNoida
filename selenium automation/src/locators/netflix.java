package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class netflix {

	public static void main(String[] args) throws InterruptedException {
	
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.netflix.com/in/login " );
Thread.sleep(3000);
driver.findElement(By.id("id_userLoginId")).sendKeys("toppo.rajan@gmail.com");
Thread.sleep(3000);
driver.findElement(By.id("id_password")).sendKeys("hitachi123#");
Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button ")).click();

String Title=driver.getTitle();
System.out.println(Title);

if(Title.equals("Netfilx ")) {
	System.out.println("passed");
} else {
	System.out.println("failed");
}
String url=driver.getCurrentUrl();
System.out.println(url);

	}

}
