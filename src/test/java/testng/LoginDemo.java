package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Screen.ScreenRecorderUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemo {

	WebDriver driver;
	
	@BeforeClass
	public void beforclass() {	
		System.out.println("Executing Before the class.");
	}
	
	@BeforeMethod
	public void setup() throws Exception {
		ScreenRecorderUtil.startRecord("tsetng");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	}

	
	@Test(priority=1)
	public void verifyUrl() {
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.saucedemo.com/";

		if (actualurl.equals(expectedurl)) {
			System.out.println("This is currect Url.");
		} else {
			System.out.println("This is wrong Url.");
		}
	}
	
	
	@Test(priority=2)
	public void verifyTitle() throws InterruptedException {
		Thread.sleep(2000);
		String actualtitle = driver.getTitle();
		String expectedtitle = "Swag Labs";

		if (actualtitle.equals(expectedtitle)) {
			System.out.println("This is currect Title.");
		} else {
			System.out.println("This is not current Title.");
		}
	}
	
	@Test(priority=3)
	public void Login() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
	}

	@AfterMethod
	public void teardown() throws Exception {
		ScreenRecorderUtil.stopRecord();
		Thread.sleep(2000);
		driver.close();
	}

	@AfterClass
	public void afterclass() {
		System.out.println("Executing after the class.");
	}
	
}
