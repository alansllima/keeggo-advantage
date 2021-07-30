package core.config;

import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;

public class PropertyReader {
	private Properties prop;

	public PropertyReader(String fileNme) throws Exception {
		prop = new Properties();
		InputStream input = this.getClass().getClassLoader().getResourceAsStream(fileNme);
		try {
			prop.load(input);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
	
	public String getProperty(String propKey) {
		return Optional.ofNullable((String)prop.get(propKey)).orElse("");
	}
}
