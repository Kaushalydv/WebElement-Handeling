package ScreenRecording;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenrecorddemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();		//mobiles
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"sobe_d_b_8_5\"]/a/div[2]/span")).click();		//click on samsung shop now
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[1]/div/div/ul/li[2]")).click(); //galaxy series
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"acs-product-block-1\"]/a/span/span[2]")).click();     //Samsung Galaxy S23 5G 
	Thread.sleep(2000);

	driver.findElement(By.id("add-to-cart-button")).click();	//Add to cart
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).click();
	Thread.sleep(2000);
	
	
	
	driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
	Thread.sleep(2000);
	
	Thread.sleep(2000);
	driver.close();
	
	}
}
