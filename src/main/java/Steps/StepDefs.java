package Steps;

import CommonUtils.Properties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefs {

    static WebDriver driver = new ChromeDriver();

    @Given("user is on home page")
    public void user_is_on_home_page() {
        System.out.println("Started testing....");
        driver.get("https://www.saucedemo.com/");
    }
    @Then("user clicked on {string} on {string}")
    public void user_clicked_on_on(String Locator  , String Page) {
        driver.findElement(Properties.getLocator(Locator, Page)).click();
    }
    @Then("user redirected to {string}")
    public void user_redirected_to(String Page) {
        System.out.println("driver focus on "+Page);
    }

    @When("user entered {string} on {string} field of {string}")
    public void user_entered_on(String inputData,String Locator, String Page) {
        driver.findElement(Properties.getLocator(Locator, Page)).sendKeys(inputData);
    }
    @Then("user closed the browser")
    public void closeBrowser(){
        driver.quit();
    }

    @Then("user validated the text of {string} should display as {string} on {string}")
    public void validateCheckpointText(String Locator,String text,String Page){
        Assert.assertEquals(text,driver.findElement(Properties.getLocator(Locator,Page)).getText());
    }
}
