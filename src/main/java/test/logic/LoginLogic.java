package test.logic;

import static core.config.Context.webActions;
import org.junit.Assert;

import core.config.Context;
import test.pages.login.HomePage;
import test.pages.login.LoginPage;
public class LoginLogic {
	
	private HomePage homePage;
	private LoginPage loginPage;

	public LoginLogic() {		
		homePage = new HomePage();
		loginPage = new LoginPage();
	}
	
	public void acessaSiteAdvantageOnline() {
		Context.setup();
		webActions().getUrl("http://advantageonlineshopping.com/#/");
		Assert.assertTrue(webActions().isVisible(homePage.getOurProducts()));	
		webActions().takeScreenShot("Navegando até a Home Page");
	}
	public void clicaUserMenu() {
		webActions().click(homePage.getMenuUser());
	}
	public void preencheAutenticacao(String username, String password) {
		webActions().sendKeys(loginPage.getUsername(), username);
		webActions().sendKeys(loginPage.getPassword(), password);
		webActions().takeScreenShot("Inserindo dados de login");
	}
	public void clicaSignIn() {
		webActions().click(loginPage.getBtnSignIn());
	}
	
	public void validaUsuarioLogado(String username) {
		webActions().takeScreenShot("Valida usuario logado");
		Assert.assertTrue(webActions().isVisible(homePage.getHiUser(username)));
		//webActions().click(homePage.getHiUser(username));
	}
	public void validaUsuarioInvalido() {		
		Assert.assertTrue(webActions().isVisible(homePage.getIncorrectUsernameOrPassword()));
		webActions().takeScreenShot("Valida usuario inválido");
	}
	
	public void quitBrowser() {
		webActions().quitDriver();		
	}
}
