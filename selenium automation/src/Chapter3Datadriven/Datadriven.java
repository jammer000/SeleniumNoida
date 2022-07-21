package Chapter3Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadriven {

	public static void main(String[] args) throws IOException {
Properties p =new Properties();
FileReader fis= new FileReader("./test.properties");
//FileInputStream fiz = new FileInputStream("./test.properties");
p.load(fis);
//p.load(fiz); 
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get(p.getProperty("url"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
driver.findElement(By.id("pass")).sendKeys(p.getProperty("password"));
driver.findElement(By.name("login")).click();

System.out.println("good");

	}

}