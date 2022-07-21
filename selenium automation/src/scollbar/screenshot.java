package scollbar;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step 1: typecasting 
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		// step2:access the method and photo stored in ram
		File ram = ts.getScreenshotAs(OutputType.FILE);
		
		//step 3; specify the req location 
		File dest = new File("./photo/scrrenshot.png"); 
		
		//step 4: copy paste from ram to dest
		
		FileUtils.copyFile(ram,dest) ;
		driver.close();
		
	}

 }
