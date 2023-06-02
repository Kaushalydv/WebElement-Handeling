package AlertDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("cartur")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		Thread.sleep(2000);
		
		
		WebElement ele=driver.findElement(By.id("name"));
		ele.sendKeys("Kaushal");
		Thread.sleep(2000);
		
		WebElement ele2=driver.findElement(By.id("country"));
		ele2.sendKeys("India");
		Thread.sleep(2000);
		
		WebElement ele3=driver.findElement(By.id("city"));
		ele3.sendKeys("Noida");
		Thread.sleep(2000);
		
		WebElement ele4=driver.findElement(By.id("card"));
		ele4.sendKeys("7418529633217894");
		Thread.sleep(2000);
		
		WebElement ele5=driver.findElement(By.id("month"));
		ele5.sendKeys("07");
		Thread.sleep(2000);
		
		WebElement ele6=driver.findElement(By.id("year"));
		ele6.sendKeys("2024");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
		
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
