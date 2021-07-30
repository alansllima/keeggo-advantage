package core.config;

import io.cucumber.java.Scenario;

public class Report {
	private Scenario s;
	
	public Report(Scenario s) {
		
		this.s = s;
	}
	
	public void verifica() {
		if(s == null) {
			
		}else if (!s.isFailed()) {
			System.out.println("deu certo");
		}		
	}
	

}
