package stepDefinitions;

import Testcases.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class DeleteCustomer extends BaseClass {


    @When("^User clicks Delete Customer tab$")
    public void user_clicks_Delete_Customer_tab() throws Throwable {


        driver.findElement(By.cssSelector("body > div:nth-child(7) > div > ul > li:nth-child(4) > a")).click();

    }

    @Then("^window pop-up with delete customer$")
    public void window_pop_up_with_delete_customer() throws Throwable {


        String title = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(1) > td > p")).getText();
        System.out.println("The window title is " + title);


    }

    @When("^User enteres the correct Customer ID$")
    public void user_enteres_the_correct_Customer_ID() throws Throwable {

        driver.findElement(By.name("cusid")).sendKeys("6907");


    }

    @When("^User clicks Submit button$")
    public void user_clicks_Submit_button() throws Throwable {

        driver.findElement(By.name("AccSubmit")).click();
    }

    @Then("^POp-up message displays with message$")
    public void pop_up_message_displays_with_message() throws Throwable {

       String msg =  driver.switchTo().alert().getText();

       System.out.println("The pop-up message is " + msg );


    }

    @When("^User accepts the message$")
    public void user_accepts_the_message() throws Throwable {

        driver.switchTo().alert().accept();


    }

    @Then("^User deletes from the site$")
    public void user_deletes_from_the_site() throws Throwable {

        driver.switchTo().alert().accept();

        super.Quitwindows();



    }


}
