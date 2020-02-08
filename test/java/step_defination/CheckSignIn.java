package step_defination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckSignIn {


    @Before
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    WebDriver driver = null;


    @Given("^I have open the browser$")
    public void i_have_open_the_browser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("^I have open AutomationPractice Website$")
    public void i_have_open_AutomationPractice_Website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @Then("^Sign In button should exists$")
    public void sign_In_button_should_exists() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if (driver.findElement(By.xpath(" /html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).isEnabled()) {
            System.out.println(" Test is pass");
        } else {
            System.out.println("Test is fail");
        }
        driver.close();
    }

@After
public void teardown(){
    driver.quit();
}
}