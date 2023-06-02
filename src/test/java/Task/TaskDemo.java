package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Screen.ScreenRecorderUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskDemo {

	public static void main(String[] args) throws Exception {
		ScreenRecorderUtil.startRecord("Task");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement ele=driver.findElement(By.id("name"));
		ele.sendKeys("Kaushal Yadav");
		Thread.sleep(2000);
		
		WebElement ele1=driver.findElement(By.id("phone"));
		ele1.sendKeys("7417089234");
		Thread.sleep(2000);
		
		WebElement ele2=driver.findElement(By.id("email"));
		ele2.sendKeys("kaushalydv@gmail.com");
		Thread.sleep(2000);
		
		WebElement ele3=driver.findElement(By.id("password"));
		ele3.sendKeys("123456");
		Thread.sleep(2000);
		
		WebElement ele4=driver.findElement(By.id("address"));
		ele4.sendKeys("B-909 Gaur Grandeur Noida");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		
		//Radio button
		driver.findElement(By.id("male")).click(); 
		Thread.sleep(2000);
		
		
		//check box
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id , 'day') ]"));
		for (WebElement ele5 : checkbox) {
			//String obj = ele5.getAttribute("id");
				ele5.click();
			}
		Thread.sleep(2000);
		
		
		//Drop down
		WebElement ele6=driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select"));
		Select drp=new Select(ele6);
		drp.selectByValue("3");
		Thread.sleep(2000);
		drp.selectByValue("4");
		Thread.sleep(2000);
		
		//Radio button
		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[2]/label")).click();
		Thread.sleep(2000);
	
		//check box
		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[1]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[2]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[3]/label")).click();
		Thread.sleep(2000);
	
		//upload
		WebElement ele7=driver.findElement(By.xpath("//*[@id=\"inputGroupFile02\"]"));
		ele7.sendKeys("C:\\Users\\ADMIN\\Downloads\\ADA.pdf ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[6]/div[2]/div/div/div[2]/span")).click();
		Thread.sleep(2000);
		
		ScreenRecorderUtil.stopRecord();
		driver.close();
	}

}
