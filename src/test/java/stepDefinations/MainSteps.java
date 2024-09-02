package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MainSteps {

    @Given("user is on netbanking page")
    public void user_is_on_netbanking_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hello from Given");
    }


    @When("user login into the application with {string} and password {string}")
    public void user_login_into_the_application_with_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
       System.out.println("username: "+username+" Password: "+password);
    }
    @When("user login into the application with {string} and password {string}>")
    public void user_login_into_the_application_with_and_password1(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("username1: "+username+" Password1: "+password);
    }
    @When("user login into the application")
    public void user_login_into_the_application(List<String> data) {
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
    }


    @Then("Home page is displayed")
    public void home_page_is_displayed() {
        System.out.println("hello from Then1");
        // Write code here that turns the phrase above into concrete actions

    }
    @Given("Setup the entries in database")
    public void setupentries()
    {
        System.out.println("from background given");
    }
    @When("Lanuch the browser using config file")
    public void config()
    {
        System.out.println("from background when");
    }
    @When("hit home page url")
    public void homepage()
    {
        System.out.println("from background when and ");
    }

}
