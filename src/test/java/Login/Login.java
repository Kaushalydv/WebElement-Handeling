package Login;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.saucedemo.com/";

		if (actualurl.equals(expectedurl)) {
			System.out.println("Url is correct.");
		} else {
			System.out.println("Incorrect Url.");
		}

		String actualtitle = driver.getTitle();
		String expectedtitle = "Swag Labs";

		if (actualtitle.equals(expectedtitle)) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Incorrect Title");
		}

		Thread.sleep(2000);

		driver.close();

	}

}
