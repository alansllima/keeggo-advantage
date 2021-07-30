package test.pages.cadastro;

import static core.config.Context.webActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
	// Account Details
	public WebElement getUserName() {
		return webActions().getWebDriver().findElement(By.name("usernameRegisterPage"));
	}

	public WebElement getEmail() {
		return webActions().getWebDriver().findElement(By.name("emailRegisterPage"));
	}

	public WebElement getPassword() {
		return webActions().getWebDriver().findElement(By.name("passwordRegisterPage"));
	}

	public WebElement getConfirmPassword() {
		return webActions().getWebDriver().findElement(By.name("confirm_passwordRegisterPage"));
	}

	// Personal details
	public WebElement getFirstName() {
		return webActions().getWebDriver().findElement(By.name("first_nameRegisterPage"));
	}

	public WebElement getLastName() {
		return webActions().getWebDriver().findElement(By.name("last_nameRegisterPage"));
	}

	public WebElement getPhoneNumber() {
		return webActions().getWebDriver().findElement(By.name("phone_numberRegisterPage"));
	}

	// Address

	public Select getCountry() {
		return new Select(webActions().getWebDriver().findElement(By.name("countryListboxRegisterPage")));
	}

	public WebElement getCity() {
		return webActions().getWebDriver().findElement(By.name("cityRegisterPage"));
	}
	public WebElement getAddress() {
		return webActions().getWebDriver().findElement(By.name("addressRegisterPage"));
	}

	public WebElement getStateProvinceRegion() {
		return webActions().getWebDriver().findElement(By.name("state_/_province_/_regionRegisterPage"));
	}

	public WebElement getPostalCode() {
		return webActions().getWebDriver().findElement(By.name("postal_codeRegisterPage"));
	}

	// Register
	public WebElement getComboBoxAgreeConditions() {
		return webActions().getWebDriver().findElement(By.name("i_agree"));
	}

	public WebElement getBtnRegister() {
		return webActions().getWebDriver().findElement(By.id("register_btnundefined"));
	}
	public WebElement getErrorUsernameAlreadyExists() {
		return webActions().getWebDriver().findElement(By.xpath("//*[@id=\"registerPage\"]/article/sec-form/div[2]/label[1]"));
		
	}
}
