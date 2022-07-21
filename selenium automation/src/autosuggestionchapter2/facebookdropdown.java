package autosuggestionchapter2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookdropdown {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		WebElement ele = driver.findElement(By.id("month"));
		
		Select s = new Select(ele);
		s.selectByIndex(3);
		s.selectByValue("4");
		s.selectByVisibleText("Apr");
System.out.println(s.isMultiple());


List<WebElement> all = s.getOptions();
System.out.println(all.size());

ArrayList a = new ArrayList();

for(WebElement b :all) {
	String text = b.getText();
	a.add(text);
}
System.out.println(" after sortoing ==============");
Collections.sort(a);
for(Object alltext:a) {
	System.out.println(alltext);
}
	
		driver.close();
		}
		

	}

