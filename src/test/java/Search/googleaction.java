package Search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleaction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.id("APjFqb"));
		ele.sendKeys("amazon");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(4000);
		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();		//done
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[6]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"merchandised-search-3\"]/div/div/div/div[2]/div/div[1]/div/div/a[2]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[11]/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("submit.add-to-cart")).click();
		Thread.sleep(2000);
	
		
		
		driver.close();

	}

}
