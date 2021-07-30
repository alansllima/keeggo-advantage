package test.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static core.config.Context.webActions;

public class HomePage {	
	
	public WebElement getOurProducts() {
		return webActions().getWebDriver().findElement(By.xpath("//a[text()='OUR PRODUCTS']"));
	}	
	public WebElement getMenuUser() {
		return webActions().getWebDriver().findElement(By.id("menuUserSVGPath"));
	}
	public WebElement getHiUser(String usuario) {
		return webActions().getWebDriver().findElement(By.linkText(usuario));
	}
	public WebElement getCreateAccount() {
		return webActions().getWebDriver().findElement(By.xpath("//a[text()='CREATE NEW ACCOUNT\']"));
	}
	public WebElement getIncorrectUsernameOrPassword() {
		return webActions().getWebDriver().findElement(By.xpath("//label[text()='Incorrect user name or password.']"));
	}
}
