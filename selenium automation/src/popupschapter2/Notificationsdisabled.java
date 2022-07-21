package popupschapter2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationsdisabled {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.olx.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	
System.out.println("all good");

	}

	
}
