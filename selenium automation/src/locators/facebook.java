package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("james_raul2004@yahoo.co.in");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("faceopen");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		String Title= driver.getTitle();
		System.out.println(Title);
	
		if(Title.equals("facebook")) {
			System.out.println("pased");
		} else {
			System.out.println(" failed ");
		}
		
		String url= driver.getCurrentUrl();
		
		System.out.println(url);
		Thread.sleep(3000);
		
		 driver.close();
		

	}

}
