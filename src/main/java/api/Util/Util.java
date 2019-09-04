package api.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Util {

	public static Properties loadProperty() throws IOException{
		FileInputStream fis=new FileInputStream(new File("F:\\Sunil Folder\\Automation\\Cucumber-Serenity-RestAssured\\serenity-cucumber4-starter\\src\\main\\java\\config.properties"));
		Properties prop=new Properties();
		prop.load(fis);
		return prop;
		
	}
}
