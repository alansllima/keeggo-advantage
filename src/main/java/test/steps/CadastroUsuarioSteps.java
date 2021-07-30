package test.steps;

import com.cucumber.listener.Reporter;

import core.config.ConfigFileReader;
import core.config.Context;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.messages.Messages.Envelope;
import test.logic.CadastroUsuarioLogic;
import test.logic.LoginLogic;
import test.runners.Hooks;
import test.testdata.CadastroData;
import io.cucumber.htmlformatter.MessagesToHtmlWriter;
public class CadastroUsuarioSteps {

	private CadastroUsuarioLogic cadastroUsuarioLogic;
	private CadastroData data;
	private LoginLogic loginLogic;
	private Hooks hooks;
	private Scenario scn;
	
	public CadastroUsuarioSteps() {
		cadastroUsuarioLogic = new CadastroUsuarioLogic();
		loginLogic = new LoginLogic();
		data = new CadastroData();
	}
	
	
	@Dado("que acesso o site Advantage Online Shopping cadastro")
	public void queAcessoOSiteAdvantageOnlineShoppingCadastro() {				
		loginLogic.acessaSiteAdvantageOnline();
		
	}

	@Dado("clico para criar uma nova conta")
	public void clicoParaCriarUmaNovaConta() {
		cadastroUsuarioLogic.clicaUserMenu();
		cadastroUsuarioLogic.clicaCriarNovaConta();

	}

	@Dado("preencho dados do cadastro")
	public void preenchoDadosDoCadastro() {
		cadastroUsuarioLogic.preencheAccountDetail(data.getUsername(), data.getEmail(), data.getPassword());
		cadastroUsuarioLogic.preenchePersonalDetail(data.getFirstname(), data.getPhonenumber());
		cadastroUsuarioLogic.preencheAddress(data.getCountry(), data.getCity(), data.getAddress(),
				data.getStateProvinceRegion(), data.getPostalCode());
		cadastroUsuarioLogic.aceitaTermosDeUsoEPrivacidade();
		cadastroUsuarioLogic.clicaRegister();
	}

	@Dado("valido novo usuario cadastrado")
	public void validoNovoUsuarioCadastrado() {
		loginLogic.validaUsuarioLogado(data.getUsername());
		cadastroUsuarioLogic.quitBrowser();
	}

	@Entao("valido mensagem de usuario ja existente")
	public void validoMensagemDeUsuarioJaExistente() {
		cadastroUsuarioLogic.validaErrorUserNameAlreadyExists();
		cadastroUsuarioLogic.quitBrowser();
	}

}
