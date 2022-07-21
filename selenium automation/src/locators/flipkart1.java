package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div[2]/div/form/div[1]/input ")).sendKeys("8383910842 ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[2]/div/div/div/div/div[2]/div/form/div[2]/input ")).sendKeys("openflip123#");
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
		Thread.sleep(3000);
		String title =driver.getTitle();
		System.out.println(title);
		if(title.equals("Flipkart")) {
			System.out.println("passed");
		} else {
			System.out.println(" failed ");
		}
		
		String url =driver.getCurrentUrl();
		System.out.println(url);
	}

}
