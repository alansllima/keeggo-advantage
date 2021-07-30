package core.config;

public class ConfigFileReader {
	
	private String arqProperties = "configuration.properties";
	private static PropertyReader pr;
	
	public ConfigFileReader() throws Exception {
		pr = new PropertyReader(arqProperties);
		
	}	

	public static String getReportConfigPath(){
		 String reportConfigPath = pr.getProperty("reportConfigPath");
		 if(reportConfigPath!= null) return reportConfigPath;
		 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
		}
}
