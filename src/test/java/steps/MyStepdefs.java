package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;

public class MyStepdefs {



    @Before("@sanity")
    public void setUp()
    {
        System.out.println("Launch the browser----sanity");
    }
    @After("@sanity")
    public void tearDown()
    {
        System.out.println("close the browser---sanity");
    }
    @Given("user navigates to facebook website")
    public void userNavigatesToFacebookWebsite() {
        System.out.println("facebook-user navigates to facebook website");
        System.out.println();
    }

    @When("user validates the home page title")
    public void userValidatesTheHomePageTitle() {
        System.out.println("facebook-user validates the home page title");
    }

    @Then("user entered the username")
    public void userEnteredTheUsername() throws InterruptedException {
        System.out.println("facebook-user entered the username");
        Thread.sleep(10000);
    }
    @Then("user should be successfully logged in")
    public void userShouldBeSuccessfullyLoggedIn() {
        System.out.println("facebook-user should be successfully logged in");
    }
    @And("user entered the password")
    public void userEnteredThePassword() {
        System.out.println("facebook-ser entered the password");
    }








    @Then("user entered the Invalid username")
    public void user_entered_the_invalid_username() {
        System.out.println("user entered the Invalid username");
    }
    @Then("user entered the Invalid password")
    public void user_entered_the_invalid_password() throws InterruptedException {
        System.out.println("user entered the Invalid password");
        Thread.sleep(10000);
    }
    @Then("user should not  successfully logged in")
    public void user_should_not_successfully_logged_in() {
        System.out.println("user should not  successfully logged in");
    }



    










    @Then("user entered the username {string}")
    public void userEnteredTheUsername(String username) {
        System.out.println("user name is "+username);
    }

    @And("user entered the password   {string}")
    public void userEnteredThePassword(String password) {
        System.out.println("password is "+password);
    }

    @And("user select the age category")
    public void userSelectTheAgeCategory(List<String> list) {
        System.out.println("user select the age category ----> "+list.get(1));
    }

    @And("user select id and password")
    public void userSelectIdAndPassword(DataTable table) {
        List<Map<String,String>> data=table.asMaps(String.class,String.class);
        System.out.println("---user id and password :"+data.get(1).get("id")+"    "+data.get(1).get("password"));
    }
}
