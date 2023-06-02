package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://blazedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	TakesScreenshot sc=((TakesScreenshot)driver);
	
	File src=sc.getScreenshotAs(OutputType.FILE);
	File f2=new File("C:\\Users\\Public\\Pictures\\Firstimage.png");
	FileUtils.copyFile(src,f2);
	
	Thread.sleep(2000);
	driver.close();
	
	}

}
