package Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Screen.ScreenRecorderUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxDemo {

	public static void main(String[] args) throws Exception {
		ScreenRecorderUtil.startRecord("main");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		/*
		driver.findElement(By.id("tuesday")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("friday")).click(); 
		Thread.sleep(2000);
		*/
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id , 'day') ]"));

		System.out.println(checkbox.size());
		
		
		for (WebElement ele : checkbox) {
			String obj = ele.getAttribute("id");
			System.out.println(obj);
			
			if (obj.equals("monday") || obj.equals("tuesday")) {

				ele.click();
			}
		}
		
		
		Thread.sleep(2000);	
		
		ScreenRecorderUtil.stopRecord();
		driver.close();

	}

}
