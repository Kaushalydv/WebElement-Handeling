package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		String pagesource=driver.getPageSource();
		System.out.println("Source code of the Page:"+pagesource);
		Thread.sleep(2000);
		
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.saucedemo.com/";

		if (actualurl.equals(expectedurl)) {
			System.out.println("Url is correct.");
		}

		else {
			System.out.println("Incorrect Url.");
		}

		Thread.sleep(2000);

		String actualtitle = driver.getTitle();
		String expectedtitle = "Swag Labs";

		if (actualtitle.equals(expectedtitle)) {
			System.out.println("Title is correct.");
		} else {
			System.out.println("Incorrect Title.");
		}
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();

	}

}
