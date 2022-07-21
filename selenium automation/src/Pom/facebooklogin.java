package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebooklogin {
	@FindBy(id="email")
	private WebElement emailtb;
	
	@FindBy(id="pass")
	private WebElement passtb;
	
	@FindBy(name="login")
	private WebElement logintb;
	
	
	public facebooklogin(WebDriver driver ) {
		
		PageFactory.initElements(driver,this);
		
	}
	public void user(String name) {
		emailtb.sendKeys(name );
	}
	public void password(String pwd) {
		passtb.sendKeys(pwd);
	}
	public void login() {
		logintb.click();
	}

}	