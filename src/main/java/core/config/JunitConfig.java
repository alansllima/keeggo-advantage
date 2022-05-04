package core.config;


import org.junit.Test;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class JunitConfig {
	String url;
	WebDriver driver;
	
	
	public JunitConfig() {
		System.out.println("junit");
	}

	@Before
	public void iniciar() {
		System.out.println("junit---------");
		Context.setup();
	}	
	
	@Test
	public void run() {
		System.out.println("RUNN");
	}
	@After
	public void finalizar() {
		driver.quit();
	}
	
	
	
}
