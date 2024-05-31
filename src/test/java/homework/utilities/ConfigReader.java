package homework.utilities;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties myPropertyFiles;

    public static String getProperty(String key) {
        try {
            myPropertyFiles = new Properties();
            String path = "src/test/resources/configs.properties";
            FileInputStream files = new FileInputStream(path);
            myPropertyFiles.load(files);
        } catch (IOException e) {
            e.printStackTrace();

        }
        return myPropertyFiles.getProperty(key);
    }
}