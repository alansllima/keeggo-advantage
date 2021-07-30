package test.logic;

import static core.config.Context.webActions;

import org.junit.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import test.pages.cadastro.CreateAccountPage;
import test.pages.login.HomePage;

public class CadastroUsuarioLogic {

	private HomePage homePage;
	private CreateAccountPage createAccountPage;

	public CadastroUsuarioLogic() {
		homePage = new HomePage();
		createAccountPage = new CreateAccountPage();
	}

	public void clicaUserMenu() {
		webActions().click(homePage.getMenuUser());
	}

	public void clicaCriarNovaConta() {
		webActions().click(homePage.getCreateAccount());
	}

	public void preencheAccountDetail(String username, String email, String password) {
		webActions().sendKeys(createAccountPage.getUserName(), username);
		webActions().sendKeys(createAccountPage.getEmail(), email);
		webActions().sendKeys(createAccountPage.getPassword(), password);
		webActions().sendKeys(createAccountPage.getConfirmPassword(), password);
		webActions().takeScreenShot("Inserindo dados para criar conta");

	}

	public void preenchePersonalDetail(String firstname, String phonenumber) {
		webActions().sendKeys(createAccountPage.getFirstName(), firstname);
		webActions().sendKeys(createAccountPage.getLastName(), firstname);
		webActions().sendKeys(createAccountPage.getPhoneNumber(), phonenumber);
		webActions().takeScreenShot("Preenchendo Personal Detail");
	}

	public void preencheAddress(String country, String city, String address, String stateprovinceregion,
			String postalcode) {
		createAccountPage.getCountry().selectByVisibleText(country);
		webActions().sendKeys(createAccountPage.getCity(), city);
		webActions().sendKeys(createAccountPage.getAddress(), address);
		webActions().sendKeys(createAccountPage.getStateProvinceRegion(), stateprovinceregion);
		webActions().sendKeys(createAccountPage.getPostalCode(), postalcode);
		webActions().takeScreenShot("Preenchendo Address");

	}

	public void aceitaTermosDeUsoEPrivacidade() {
		webActions().click(createAccountPage.getComboBoxAgreeConditions());
		webActions().takeScreenShot("Aceita os termos de uso e privacidade");
	}

	public void clicaRegister() {
		webActions().click(createAccountPage.getBtnRegister());
		webActions().takeScreenShot("Clica em registrar");
	}

	public void validaErrorUserNameAlreadyExists() {
		Assert.assertTrue(webActions().isVisible(createAccountPage.getErrorUsernameAlreadyExists()));
		webActions().takeScreenShot("Valida erro username já existente");

	}

	public void quitBrowser() {
		webActions().quitDriver();
	}
}
