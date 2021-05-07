package Com.Test.Levin.supportLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Settings {
	
	private static Properties properties = loadSettings();

	static Logger log = Logger.getLogger(Settings.class);

	private Settings() {}

	public static Properties getInstance() {
		return properties;
	}

	private static Properties loadSettings() {
		
		Properties properties = new Properties();

		try {
			properties.load(new FileInputStream(Helper.getAbsolutePath()+ Helper.getFileSeparator() + "src"
							+ Helper.getFileSeparator() + "test" + Helper.getFileSeparator()
							+ "resources"+ Helper.getFileSeparator() + "Settings.properties"));
		} catch (FileNotFoundException e) {
			log.error(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			log.error(e.getMessage());
			e.printStackTrace();
		}

		return properties;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}