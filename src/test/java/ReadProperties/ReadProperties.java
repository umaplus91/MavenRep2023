package ReadProperties;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadProperties {

	public static void main(String[] arg) {

		Properties prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("src\\test\\java\\properties\\appProperties");
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}

		String url = prop.getProperty("application.url.uat");
		System.out.println(url);
	}

}