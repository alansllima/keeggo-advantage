package test.runners;

import org.junit.runner.RunWith;

import core.config.JunitConfig;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(features =".//features",//
				glue ="test.steps",//
				tags = "@Login", 
				plugin = {"html:target/cucumber-reports-html/report.html","json:target/cucumber.json", "junit:target/cucumber.xml" },//
				monochrome = true,//
				snippets = SnippetType.CAMELCASE//
				)
public class LoginRunner extends JunitConfig {

}
