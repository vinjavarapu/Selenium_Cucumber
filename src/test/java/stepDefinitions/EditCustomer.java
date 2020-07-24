package stepDefinitions;

import Testcases.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EditCustomer extends BaseClass {

    @When("^User clicks EditCustomer Tab$")
    public void user_clicks_EditCustomer_Tab() throws Throwable {

       driver.findElement(By.cssSelector("body > div:nth-child(7) > div > ul > li:nth-child(3) > a")).click();
       Thread.sleep(5000);


    }

    @Then("^Window of EditCustomer pop-up on screen$")
    public void window_of_EditCustomer_pop_up_on_screen() throws Throwable {

          String title = driver.getTitle();

          System.out.println("The displayed window is " + title);
    }

    @When("^User enteres valid customer id details$")
    public void user_enteres_valid_customer_id_details() throws Throwable {

        driver.findElement(By.name("cusid")).sendKeys("6706");


    }

    @When("^User clicks submit$")
    public void user_clicks_submit() throws Throwable {

        driver.findElement(By.name("AccSubmit")).click();

    }

    @Then("^Edit Customer details displays on screen$")
    public void edit_Customer_details_displays_on_screen() throws Throwable {

        String title = driver.getTitle();

        System.out.println(title);

    }
    @When("^User change City Details$")
    public void user_change_City_Details() throws Throwable {

        driver.findElement(By.name("city")).clear();
        driver.findElement(By.name("city")).sendKeys("HyderaBad12");

    }

    @When("^Usersubmits the data$")
    public void usersubmits_the_data() throws Throwable {

        driver.findElement(By.name("sub")).click();


    }

    @Then("^Editcustomer details succesful$")
    public void editcustomer_details_succesful() throws Throwable {

        WebElement ele = driver.findElement(By.cssSelector("#customer > tbody > tr:nth-child(1) > td > p"));
        String text = ele.getText();
        System.out.println("The displayed message is " + text );

        super.Quitwindows();


    }


}
