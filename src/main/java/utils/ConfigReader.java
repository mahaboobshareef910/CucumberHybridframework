package utils;

import java.io.File;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
public Properties intializeProperties() {
		
		Properties prop = new Properties();
		File proFile = new File("C:\\Users\\USER\\eclipse-workspace\\NJPROJ\\src\\main\\resource\\config\\config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(proFile);
			prop.load(fis);
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		return prop;
		
	}

}
