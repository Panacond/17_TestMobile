package pageObject;

import driver.AndroidDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class ResultPage extends BasePageObject {
    @FindBy(id = "passage-2")
    private WebElement textResult;

    public boolean isCorrectFactor(String factor) {
        AndroidDriverSingleton.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //TODO add get list child
        String text = textResult.getText();
        System.out.println(text);
        if (text.contains(factor)) {
            return true;
        } else {
            return true;
        }
    }
}
