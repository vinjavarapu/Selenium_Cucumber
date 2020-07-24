package stepDefinitions;

import Testcases.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class LogoutSteps extends BaseClass {

    @Given("^Userlogged into GuruSite$")
    public void userlogged_into_GuruSite() throws Throwable {

        super.Setup();
        super.Login();
        Thread.sleep(5000);


    }

    @When("^User click Logout button$")
    public void user_click_Logout_button() throws Throwable {

         driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[15]/a")).click();
         Thread.sleep(5000);


    }

    @Then("^user logged out from site$")
    public void user_logged_out_from_site() throws Throwable {

        driver.switchTo().alert().accept();
        super.Quitwindows();


    }




}

