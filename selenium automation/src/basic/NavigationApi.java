package basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationApi {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		driver.navigate().to("  https://web.whatsapp.com/");

		
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		

		
	}

}
