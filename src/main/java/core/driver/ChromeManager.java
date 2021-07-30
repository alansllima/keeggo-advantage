package core.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeManager {
	WebDriver driver;
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				".\\drivers\\chrome\\91\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	

}
