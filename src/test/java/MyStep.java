import driver.AndroidDriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.FirstDataPage;
import pageObject.ResultPage;
import pageObject.SecondDataPage;
import pageObject.StartAppPage;

public class MyStep {
    @Given("run hello world")
    public void runHelloWorld() {
        System.out.println("MyStep.runHelloWorld");
    }

    @Then("print hello")
    public String printHello() {
        return "hello";
    }

    @After
    public void tearDown() {
        AndroidDriverSingleton.quitDriver();
    }

    private final FirstDataPage firstDataPage;
    private final SecondDataPage secondDataPage;
    private final ResultPage resultPage;
    private final StartAppPage startAppPage;

    public MyStep() {
        firstDataPage = new FirstDataPage();
        secondDataPage = new SecondDataPage();
        resultPage = new ResultPage();
        startAppPage = new StartAppPage();
    }

    @And("^User input load '(.*)'$")
    public MyStep userInputLoadLoad(int load) throws InterruptedException {
//        Thread.sleep(1000);
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
    }

    @Then("User get {string}")
    public void userGetPermissible_payload(String permissiblePayload) {
        Assert.assertTrue(resultPage.isCorrectFactor(permissiblePayload));
    }

    @Given("open app")
    public void openApp() {
        startAppPage
                .clickApp()
                .clickFieldInput()
                .setUrlBar("panacond.github")
                .clickFieldClick()
                .clickAppStart()
                .clickSectionCalculations();
    }

    @Given("open app 1 step")
    public void openAppStep1() {
        startAppPage.clickApp();
    }

    @And("open app 2 step")
    public void openAppStep2() throws InterruptedException {
        Thread.sleep(1000);
        startAppPage.clickFieldInput();
    }

    @And("open app 3 step")
    public void openAppStep3() {
        startAppPage.setUrlBar("panacond.github");
    }

    @And("open app 4 step")
    public void openAppStep4() {
        startAppPage.clickFieldClick();
    }

    @And("open app 5 step")
    public void openAppStep5() {
        startAppPage.clickAppStart();
    }

    @And("open app 6 step")
    public void openAppStep6() {
        startAppPage.clickSectionCalculations();
    }
}
