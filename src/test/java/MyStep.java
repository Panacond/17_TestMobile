import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.FirstDataPage;
import pageObject.ResultPage;
import pageObject.SecondDataPage;

public class MyStep {
    @Given("run hello world")
    public void runHelloWorld() {
        System.out.println("MyStep.runHelloWorld");
    }

    @Then("print hello")
    public String printHello() {
//        WebDriverSingleton.quitDriver();
        return "241423";

    }

    private final FirstDataPage firstDataPage;
    private final SecondDataPage secondDataPage;
    private final ResultPage resultPage;

    public MyStep(){
        firstDataPage = new FirstDataPage();
        secondDataPage = new SecondDataPage();
        resultPage = new ResultPage();
    }

    @Given("^User input load '(.*)'$")
    public MyStep userInputLoadLoad(int load) {
        firstDataPage.setLoad(String.valueOf(load));
        return this;
    }

    @And("^User input width'(.*)'$")
    public MyStep userInputWidthWidth(String width) {
        firstDataPage.setWidth(width);
        return this;
    }

    @And("^User input length'(.*)'$")
    public MyStep userInputLengthLength(String length) {
        firstDataPage.setLength(length);
        return this;
    }

    @And("^User click wood beam$")
    public MyStep userClickWoodBeam() {
        firstDataPage.clickButtonWoodBeam();
        return this;
    }

    @And("^User input height'(.*)'$")
    public MyStep userInputHeightSection_height(String height) {
        secondDataPage.setSectionHeight(height);
        return this;
    }

    @And("^User input section width'(.*)'$")
    public MyStep userInputSectionWidthSection_width(String width) {
        secondDataPage.setSectionWidth(width);
        return this;
    }

    @When("^User click calculation$")
    public MyStep userClickCalculation() {
        secondDataPage.clickButtonCalculation();
        return this;
    }

    @Then("^User get utilization factor '(.*)'$")
    public void userGetUtilizationFactorResult(String result) {
        Assert.assertTrue(resultPage.isCorrectFactor(result));
//        WebDriverSingleton.quitDriver();
    }

    @Then("User get {string}")
    public void userGetPermissible_payload(String permissiblePayload) {
        Assert.assertTrue(resultPage.isCorrectFactor(permissiblePayload));
//        WebDriverSingleton.quitDriver();
    }

    @Given("open app")
    public void openApp() {

    }
}
