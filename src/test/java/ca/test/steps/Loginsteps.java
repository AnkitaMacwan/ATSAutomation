package ca.test.steps;

import ca.test.pages.LoginPage;
import ca.test.utils.ConfigReader;
import ca.test.utils.KnowsTestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class Loginsteps {

    LoginPage login = new LoginPage(KnowsTestContext.driver);
    ConfigReader reader = new ConfigReader();

    @Given("^Open the browser$")
    public void open_the_browser() throws IOException {
        KnowsTestContext.driver.get(reader.properties().getProperty("url"));
        KnowsTestContext.driver.manage().window().maximize();
        login.clicklogin();
    }

    @When("^Enter the username '(.*)' and password '(.*)")
    public void enter_the_username(String username , String password)  {
    login.enterusername(username);
    login.enterpassword(password);
    }

    @Then("^Login to account$")
    public void login_to_account(){
    login.clickonlogin();

    }

}
