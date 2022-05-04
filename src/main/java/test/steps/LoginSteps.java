package test.steps;

import org.openqa.selenium.TakesScreenshot;

import core.config.Context;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import test.logic.LoginLogic;
import test.testdata.LoginData;

public class LoginSteps {
	private LoginLogic loginLogic;
	private LoginData data;
	private Scenario scn;

	public LoginSteps() {
		loginLogic = new LoginLogic();
		data = new LoginData();
	}

	@Before
	public void cleanUp(Scenario scn) {
		Context.setScenario(scn);
	}

	@Dado("que acesso o site Advantage Online Shopping")
	public void queAcessoOSiteAdvantageOnlineShopping() {
		loginLogic.acessaSiteAdvantageOnline();

	}

	@E("preencho dados para autenticacao")
	public void preenchoDadosParaAutenticacao() {
		loginLogic.clicaUserMenu();
		loginLogic.preencheAutenticacao(data.getUsername(), data.getPassword());
		loginLogic.clicaSignIn();
	}

	@E("preencho dados com autenticacao invalida")
	public void preenchoDadosComAutenticacaoInvalida() {
		loginLogic.clicaUserMenu();
		loginLogic.preencheAutenticacao(data.getUsernameInvalido(), data.getPassword());
		loginLogic.clicaSignIn();
	}

	@Entao("valido usuario logado")
	public void validoUsuarioLogado() {
		loginLogic.validaUsuarioLogado(data.getUsername());
		loginLogic.quitBrowser();
	}

	@Entao("valido erro de autenticacao")
	public void validoErroDeAutenticacao() {
		loginLogic.validaUsuarioInvalido();
		loginLogic.quitBrowser();

	}

}
