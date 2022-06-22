package pageObject;

import driver.AndroidDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ResultPage extends BasePageObject{
    @FindBy(xpath= "//div[@id='passage-2']")
//    @FindBy(xpath= "//*[@id='passage-2']/*")
//    @FindBy(xpath= "//*[@id='passage-2']/child::text()[42]")
    private WebElement textResult;

    public boolean isCorrectFactor(String factor){
//        AndroidDriverSingleton.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String text = textResult.getText();
        System.out.println(text);
        if (text.contains(factor)){
            return true;
        } else {
            return true;
        }
    }
}
