package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartAppPage extends BasePageObject{

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]")
    private WebElement goToListApp;

    @FindBy(id = "com.android.settings:id/header_details")
    private WebElement viewAll20App;

    @FindBy(id = "com.android.settings:id/search_app_list_menu")
    private WebElement buttonSearchApp;

    @FindBy(id = "android:id/search_src_text")
    private WebElement fieldSearchApp;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc='Search']")
    private WebElement resultSearch;

    @FindBy(id = "com.android.settings:id/button1")
    private  WebElement openApp;

    @FindBy(id = "com.android.quicksearchbox:id/search_src_text")
    private WebElement inputFieldApp;

    @FindBy(id = "com.android.quicksearchbox:id/search_go_btn")
    private WebElement buttonSearch;

    @FindBy(xpath = "//android.view.View[@content-desc='https://panacond.github.io start']/android.view.View[2]")
    private WebElement buttonStartApp;

    @FindBy(xpath = "//android.view.View[@content-desc='Расчет']/android.widget.TextView")
    private WebElement sectionCalculations;

    public StartAppPage clickGotoListApp(){
        goToListApp.click();
        return this;
    }

    public StartAppPage clickViewAll20App(){
        viewAll20App.click();
        return this;
    }

    public StartAppPage clickButtonSearchApp(){
        buttonSearchApp.click();
        return this;
    }

    public StartAppPage inputFieldSearchApp(String nameApp){
        fieldSearchApp.sendKeys(nameApp);
        return this;
    }

    public StartAppPage clickResultSearch(){
        resultSearch.click();
        return this;
    }

    public StartAppPage clickOpenApp(){
        openApp.click();
        return this;
    }

    public StartAppPage setInputFieldApp(String search){
        inputFieldApp.sendKeys(search);
        return this;
    }

    public StartAppPage clickButtonSearch(){
        buttonSearch.click();
        return this;
    }

    public StartAppPage clickStartApp(){
        buttonStartApp.click();
        return this;
    }

    public StartAppPage clickSectionCalculations(){
        sectionCalculations.click();
        return this;
    }
}
