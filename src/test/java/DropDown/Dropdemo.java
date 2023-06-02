package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		Select drp=new Select(ele);
		drp.selectByValue("Portland");
		Thread.sleep(2000);
		
		drp.selectByValue("Mexico City");
		Thread.sleep(2000);
		
		
		WebElement ele1=driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		Select drp1=new Select(ele1);
		drp1.selectByValue("New York");
    		Thread.sleep(2000);
		
		drp1.selectByValue("Berlin");
		Thread.sleep(2000);
		
		driver.close();

	}

}
