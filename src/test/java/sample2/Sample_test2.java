

package sample2;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SAmple1.Test;
import SAmple1.aftermethod;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Sample_test2 {
	@Test 
	   public void loadgoogle(){
		   WebDriverManager.chromedriver().setup();
		   WebDriver wd = new ChromeDriver();
		   wd.get("https://www.google.com/");
		   wd.findElement(By.name("q")).sendKeys("chennai");
		   wd.findElement(By.name("q")).submit();
	   }
		
		@aftermethod
		public void teardown() throws IOException{
			File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		}
}
