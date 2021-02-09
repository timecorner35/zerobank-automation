package com.zerobank.stepdefinitions;

import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStepDef {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("the user enters the valid username and password")
    public void the_user_enters_the_valid_username_and_password() {
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys(ConfigurationReader.get("username"));
        loginPage.password.sendKeys(ConfigurationReader.get("password"), Keys.ENTER);
        loginPage.details.click();
        loginPage.proceed.click();
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Account Summary";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String string) {
        Assert.assertEquals(string,new LoginPage().alertwrong.getText());

    }

    @When("the user enters the blank username and correct password")
    public void the_user_enters_the_blank_username_and_correct_password() {
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("");
        loginPage.password.sendKeys(ConfigurationReader.get("password"));
        loginPage.submit.click();
    }

    @When("the user enters the correct username and blank password")
    public void the_user_enters_the_correct_username_and_blank_password() {
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys(ConfigurationReader.get("username"));
        loginPage.password.sendKeys("");
        loginPage.submit.click();
    }

    @When("the user enters the blank username and blank password")
    public void the_user_enters_the_blank_username_and_blank_password() {
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("");
        loginPage.password.sendKeys("");
        loginPage.submit.click();
    }

    @When("the user enters the invalid username and password")
    public void the_user_enters_the_invalid_username_and_password() {
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("asdfe");
        loginPage.password.sendKeys("asdfkj");
        loginPage.submit.click();
    }

}