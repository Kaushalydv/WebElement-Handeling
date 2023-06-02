package Search;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actiondemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_LEFT).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_RIGHT).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.CANCEL).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.CLEAR).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.F4).perform();
		Thread.sleep(2000);
		
		driver.close();		
		
	}

}
