package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		String Sourcecode = driver.getPageSource();
		System.out.println("Source code of the Page is:" + Sourcecode);
		Thread.sleep(2000);

		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.saucedemo.com/";
		if (actualurl.equals(expectedurl)) {
			System.out.println("Url is correct.");
		} else {
			System.out.println("Incorrect Url.");
		}

		String actualtitle = driver.getTitle();
		String Expectedtitle = "Swag Labs";
		if (actualtitle.equals(Expectedtitle)) {
			System.out.println("Title is correct.");
		} else {
			System.out.println("Incorrect Title.");
		}
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");
		Thread.sleep(2000);

		WebElement ele2 = driver.findElement(By.id("password"));
		ele2.sendKeys("secret_sauce");
		Thread.sleep(2000);

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("continue-shopping")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);

		WebElement ele3 = driver.findElement(By.id("first-name"));
		ele3.sendKeys("Kaushal");
		WebElement ele4 = driver.findElement(By.id("last-name"));
		ele4.sendKeys("Yadav");
		WebElement ele5 = driver.findElement(By.id("postal-code"));
		ele5.sendKeys("204215");
		Thread.sleep(4000);
		System.out.println("git testing ");

		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);

		driver.close();

	}

}
