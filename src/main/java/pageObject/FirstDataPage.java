package pageObject;

import driver.AndroidDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FirstDataPage extends BasePageObject {

    @FindBy(css = "#numberbox-q1")
    private WebElement fieldLoad;

    @FindBy(css = "#numberbox-b1")
    private WebElement fieldWidth;

    @FindBy(css = "#numberbox-l1")
    private WebElement fieldLength;

    @FindBy(css = "#passage-start > a:nth-child(11)")
    private WebElement buttonWoodBeam;

    public FirstDataPage setLoad(String load){
//        AndroidDriverSingleton.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        fieldLoad.clear();
        fieldLoad.sendKeys(load);
        return this;
    }

    public FirstDataPage setWidth(String width){
        fieldWidth.clear();
        fieldWidth.sendKeys(width);
        return this;
    }

    public FirstDataPage setLength(String Length){
        fieldLength.clear();
        fieldLength.sendKeys(Length);
        return this;
    }

    public FirstDataPage clickButtonWoodBeam(){
        buttonWoodBeam.click();
        return this;
    }
}
