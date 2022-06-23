package pageObject;

import driver.AndroidDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SecondDataPage extends BasePageObject {

    @FindBy(id = "numberbox-h2")
    private WebElement sectionHeight;

    @FindBy(id = "numberbox-b2")
    private WebElement sectionWidth;

    //    @FindBy(css = "[id^=passage] > a")
    @FindBy(xpath = "//android.view.View[@content-desc=\"Расчет\"]")
    private WebElement buttonCalculation;

    public SecondDataPage setSectionHeight(String height) {
        AndroidDriverSingleton.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        sectionHeight.clear();
        sectionHeight.sendKeys(height);
        return this;
    }

    public SecondDataPage setSectionWidth(String width) {
        sectionWidth.clear();
        sectionWidth.sendKeys(width);
        return this;
    }

    public SecondDataPage clickButtonCalculation() {
        buttonCalculation.click();
        return this;
    }
}
