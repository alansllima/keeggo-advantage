package test.pages.login;

import static core.config.Context.webActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebElement getUsername() {
		return webActions().getWebDriver().findElement(By.name("username"));
	}
	public WebElement getPassword() {
		return webActions().getWebDriver().findElement(By.name("password"));
	}
	public WebElement getBtnSignIn() {
		return webActions().getWebDriver().findElement(By.id("sign_in_btnundefined"));
	}
}
