package capabilitiesFactory;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.PropertiesReader;

import java.net.MalformedURLException;
import java.net.URL;

public class CapabilitiesFactory {
    private static final PropertiesReader properties = new PropertiesReader();
    private static final String APP_ACTIVITY_CAPABILITY = ".Settings";

    public static DesiredCapabilities getCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, properties.getPlatformName());
        capabilities.setCapability(MobileCapabilityType.UDID, properties.getUdId());
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, properties.getPackage());
        capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, properties.getActivity());
        return capabilities;
    }

    public static URL getAppiumServerURL(){
        try {
            return new URL( properties.getUrlServer());
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
        return null;
    }

}
