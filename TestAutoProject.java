package TestAutomation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAutoProject {
	
  @Test
  public void Quick_info() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divyani\\Desktop\\Selenium jar\\chromedriver.exe");
		
		//  Launch browser
		WebDriver w = new ChromeDriver();
		
		// Open URL
		w.get("https://www.imagicaaworld.com/water-park/");
		
		//  Maximize the browser window
		w.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) w; 
		
		js.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(1000);
		
		
  }
}
