package core.config;

import core.actions.StoredActions;
import core.driver.ChromeManager;
import io.cucumber.java.Scenario;

public class Context {
	private static StoredActions webActions;
	private static ChromeManager chromeManager;
	private static Scenario scn;
	
	public static void setup() {
		if(chromeManager == null)
		chromeManager = new ChromeManager();
		webActions = new StoredActions(chromeManager.getDriver());		
	}
	
	public static StoredActions webActions() {
		if(webActions == null) 			
		 throw new RuntimeException("Não foi possivel construir ChromeManager");		
		return webActions;
	}
	
	public static void setScenario(Scenario scn) {
		Context.scn = scn;
	}
	
	public static Scenario getScenario() {
		return Context.scn;
	}
}
