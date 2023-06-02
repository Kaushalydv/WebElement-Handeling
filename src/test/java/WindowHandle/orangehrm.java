package WindowHandle;

import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrm {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		String windowID=driver.getWindowHandle();		
		System.out.println(windowID);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		List<String> windowList=new ArrayList<String>(windowIDs);
		
		String pwindowID=windowList.get(0);
		System.out.println("Parent window ID = "+pwindowID);
		String cwindowID=windowList.get(1);
		System.out.println("Child window ID = "+cwindowID);
		Thread.sleep(2000);
		
		driver.switchTo().window(pwindowID);
		System.out.println("The Parent Page details= "+driver.getTitle());
		driver.switchTo().window(cwindowID);
		System.out.println("The Child Page details= "+driver.getTitle());
		
		Thread.sleep(2000);
		driver.quit();
	
		
		
	}

}

