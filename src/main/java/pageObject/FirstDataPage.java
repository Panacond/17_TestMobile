package pageObject;

import driver.AndroidDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class FirstDataPage extends BasePageObject {

    //    @FindBy(id = "numberbox-q1")
    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"200\"]")
    private WebElement fieldLoad;

    //    @FindBy(id = "numberbox-b1")
    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"1\"]")
    private WebElement fieldWidth;

    //    @FindBy(id = "numberbox-l1")
    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"3\"]")
    private WebElement fieldLength;

    //    @FindBy(css = "#passage-start > a:nth-child(11)")
    @FindBy(xpath = "//android.view.View[@content-desc=\"Деревянная балка\"]")
    private WebElement buttonWoodBeam;

    public FirstDataPage setLoad(String load) throws InterruptedException {
        AndroidDriverSingleton.getDriver().manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        fieldLoad.clear();
        fieldLoad.sendKeys(load);
        return this;
    }

    public FirstDataPage setWidth(String width) {
        fieldWidth.clear();
        fieldWidth.sendKeys(width);
        return this;
    }

    public FirstDataPage setLength(String Length) {
        fieldLength.clear();
        fieldLength.sendKeys(Length);
        return this;
    }

    public FirstDataPage clickButtonWoodBeam() {
        buttonWoodBeam.click();
        return this;
    }
}
