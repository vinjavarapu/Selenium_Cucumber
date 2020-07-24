package stepDefinitions;

import Testcases.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class CreateCustomer extends BaseClass {



    @When("^User click Newcustomer tab$")
    public void user_click_Newcustomer_tab() throws Throwable {

        driver.findElement(By.cssSelector("body > div:nth-child(7) > div > ul > li:nth-child(2) > a")).click();

    }

    @When("^user enters the follwoing details$")
    public void user_enters_the_follwoing_details() throws Throwable {
          Thread.sleep(5000);

    }

    @When("^Customer Name$")
    public void customer_Name() throws Throwable {

        driver.findElement(By.name("name")).sendKeys("Umashankar");


    }

    @When("^Gender$")
    public void gender() throws Throwable {

        driver.findElement(By.name("rad1")).click();

    }

    @When("^Date of Birth$")
    public void date_of_Birth() throws Throwable {

        driver.findElement(By.name("dob")).sendKeys("10-04-1974");


    }

    @When("^Address$")
    public void address() throws Throwable {

        driver.findElement(By.name("addr")).sendKeys("404 Hyderabad Telangana");
    }

    @When("^City$")
    public void city() throws Throwable {

        driver.findElement(By.name("city")).sendKeys("Hyderabad");

    }

    @When("^State$")
    public void state() throws Throwable {

        driver.findElement(By.name("state")).sendKeys("Telangana");

    }

    @When("^PIN$")
    public void pin() throws Throwable {

        driver.findElement(By.name("pinno")).sendKeys("520006");

    }

    @When("^Mobile Number$")
    public void mobile_Number() throws Throwable {

        driver.findElement(By.name("telephoneno")).sendKeys("9502311989");

    }


    @When("^E-mail$")
    public void e_mail() throws Throwable {

        driver.findElement(By.name("emailid")).sendKeys("vinravi@yahoo.com");

    }

    @When("^Password$")
    public void password() throws Throwable {

        driver.findElement(By.name("password")).sendKeys("ravi@123");

    }

    @When("^user clicks SubmitButton$")
    public void user_clicks_SubmitButton() throws Throwable {

        driver.findElement(By.name("sub")).click();

    }

    @Then("^New customer will be created$")
    public void new_customer_will_be_created() throws Throwable {

        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        super.Quitwindows();

    }


}
