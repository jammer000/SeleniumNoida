package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class instalogin {
	
	@FindBy(name="username")
	private WebElement usernametb;
	
	@FindBy(name="password")
	private WebElement pastb;
	
	@FindBy(xpath="//button[@class='sqdOP  L3NKy   y3zKF     ']")
	private WebElement logtb;
	
	public instalogin(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	public void user(String user) {
		usernametb.sendKeys(user);
	}
	public void pass(String pass ) {
		pastb.sendKeys(pass);
	}
	public void log() {
		logtb.click();
	}
	
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		instalogin in = new instalogin (driver);
		in.user("topporajanjames");
		in.pass("myloverose");
		in.log();
		
	System.out.println("allgood");
	}

}
