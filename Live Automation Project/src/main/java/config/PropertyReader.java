package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    public static Properties prop;

    public static String getProperty(String key) {
        FileInputStream fp = null;
        try {
            fp = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\data.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            prop = new Properties();
            prop.load(fp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }


}
