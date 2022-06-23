package utils;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    final static Logger logger = Logger.getLogger(PropertiesReader.class);
    Properties property = new Properties();
    final static String PATH = "src/main/resources/config.properties";

    public PropertiesReader() {
        FileInputStream fis;
        try {
            fis = new FileInputStream(PATH);
            property.load(fis);
            fis.close();
            logger.info("Read config.properties");
        } catch (IOException e) {
            logger.info("ERROR: Properties file is not exist!");
        }
    }

    public String getUrl() {
        return property.getProperty("URL");
    }

    public String getUrlServer() {
        return property.getProperty("URL_SERVER");
    }

    public String getPlatformName() {
        return property.getProperty("PLATFORM_NAME_CAPABILITY");
    }

    public String getUdId() {
        return property.getProperty("UDID_CAPABILITY");
    }

    public String getPackage() {
        return property.getProperty("APP_PACKAGE_CAPABILITY");
    }

    public String getActivity() {
        return property.getProperty("APP_ACTIVITY_CAPABILITY");
    }

    public String getDeviceName() {
        return property.getProperty("DEVICE_NAME_CAPABILITY");
    }
}
