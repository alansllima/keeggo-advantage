package test.runners;

import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;

import core.config.ConfigFileReader;
import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//features", //
		glue = "test.steps", //
		tags = "@CadastroUsuario", 
		plugin = {"html:target/cucumber-reports-html/report.html"},//
		 monochrome = true, //
		snippets = SnippetType.CAMELCASE//
)
public class CadastroUsuarioRunner {
	
}
