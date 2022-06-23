package pageObject;

import driver.AndroidDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class StartAppPage extends BasePageObject{

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Chrome']")
    private WebElement goToListApp;

    @FindBy(xpath = "//android.support.v7.widget.RecyclerView[@content-desc=\"New tab\"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
    private WebElement fieldInput;

    @FindBy(id = "com.android.chrome:id/url_bar")
    private WebElement urlBar;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.ListView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
    private WebElement fieldClick;

    @FindBy(xpath = "//android.view.View[@content-desc=\"https://panacond.github.io start\"]")
    private WebElement appStart;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Расчет\"]")
    private WebElement sectionCalculations;

    public StartAppPage clickApp(){
        AndroidDriverSingleton.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        goToListApp.click();
        return this;
    }

    public StartAppPage clickFieldInput(){
        AndroidDriverSingleton.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        fieldInput.click();
        return this;
    }

    public StartAppPage setUrlBar(String text ){
        urlBar.sendKeys(text);
        return this;
    }

    public StartAppPage clickFieldClick(){
        AndroidDriverSingleton.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        fieldClick.click();
        return this;
    }

    public StartAppPage clickAppStart(){
        AndroidDriverSingleton.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        appStart.click();
        return this;
    }

    public StartAppPage clickSectionCalculations(){
        AndroidDriverSingleton.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sectionCalculations.click();
        return this;
    }
}
