package pageObject;

import driver.AndroidDriverSingleton;
import org.openqa.selenium.support.PageFactory;

public class BasePageObject {

    public BasePageObject() {
        PageFactory.initElements(AndroidDriverSingleton.getDriver(), this);
    }

}
