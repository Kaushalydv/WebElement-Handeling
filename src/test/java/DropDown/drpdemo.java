package DropDown;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Screen.ScreenRecorderUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class drpdemo {

	public static void main(String[] args) throws Exception {
		
		ScreenRecorderUtil.startRecord("main");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		Select drp=new Select(ele);
		drp.selectByValue("Boston");
		Thread.sleep(2000);
		
		WebElement ele1=driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		Select drp1=new Select(ele1);
		drp1.selectByValue("London");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
		Thread.sleep(2000);
		
		WebElement ele2=driver.findElement(By.id("inputName"));
		ele2.sendKeys("Kaushal Yadav");
		Thread.sleep(2000);
		
		WebElement ele3=driver.findElement(By.id("address"));
		ele3.sendKeys("Gaur Grandeur");
		Thread.sleep(2000);
		
		WebElement ele4=driver.findElement(By.id("city"));
		ele4.sendKeys("Noida");
		Thread.sleep(2000);
		
		WebElement ele5=driver.findElement(By.id("state"));
		ele5.sendKeys("Uttar Pradesh");
		Thread.sleep(2000);
		
		WebElement ele6=driver.findElement(By.id("zipCode"));
		ele6.sendKeys("201301");
		Thread.sleep(2000);
		
		WebElement ele7=driver.findElement(By.xpath("//*[@id=\"cardType\"]"));
		Select drp2=new Select(ele7);
		drp2.selectByValue("amex");
		Thread.sleep(2000);
		
		WebElement ele8=driver.findElement(By.id("creditCardNumber"));
		ele8.sendKeys("8795623147894561");
		Thread.sleep(2000);
		
		WebElement ele9=driver.findElement(By.id("creditCardMonth"));
		ele9.clear();
		Thread.sleep(2000);
		ele9.sendKeys("October");
		Thread.sleep(2000);
		
		WebElement ele10=driver.findElement(By.id("creditCardYear"));
		ele10.clear();
		Thread.sleep(2000);
		ele10.sendKeys("2026");
		Thread.sleep(2000);
		
		WebElement ele11=driver.findElement(By.id("nameOnCard"));
		ele11.sendKeys("Kaushal");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(2000);
		
		TakesScreenshot sc=((TakesScreenshot) driver);
		File Src=sc.getScreenshotAs(OutputType.FILE);
		File F2= new File("C:\\Users\\Public\\Pictures\\Sample.png");
		FileUtils.copyFile(Src, F2);
		
		ScreenRecorderUtil.stopRecord();
		
		driver.close();

	}

}
