package stepDefinitions;

import Testcases.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps extends BaseClass {


    @Given("^when user Launched the Guru site$")
    public void when_user_Launched_the_Guru_site() throws Throwable {

        super.Setup();



    }

    @When("^User entered login data$")
    public void user_entered_login_data() throws Throwable {

        super.Login();
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^User succesful login to site$")
    public void user_succesful_login_to_site() throws Throwable {

        String title = driver.getTitle();
        System.out.println("The title of window is" + title);
        super.Quitwindows();
        // Write code here that turns the phrase above into concrete actions

    }

}
