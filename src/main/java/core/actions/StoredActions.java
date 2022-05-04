package core.actions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.config.Context;
import io.cucumber.java.Scenario;

public class StoredActions {
	
	private WebDriver driver;
	private WebDriverWait wait;

	public StoredActions(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	}
	
	public WebDriver getWebDriver() {
		return driver;
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}
	public void wait(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void click(WebElement element) {
		isVisible(element);
		element.click();
	}
	
	public boolean isVisible(WebElement element) {
		boolean visible = false;
		for (int i = 0; i <10; i++) {
			if(!element.isDisplayed()) {
				wait(3000);
			}else {
				visible = true;
				return true;
			}
		}
		if(!visible)
			throw new RuntimeException("Elemento nao visivel!");
		return true;
		
	}
	
	public void sendKeys(WebElement element, String text ) {		
		element.sendKeys(text);
	}
	
	public void takeScreenShot(String msg) {
		Scenario scn = Context.getScenario();
		final byte[] screenchot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    scn.attach(screenchot, "image/png", msg);
	    scn.log(msg);
	}
	
	public void quitDriver() {
		driver.quit();
	}
}
