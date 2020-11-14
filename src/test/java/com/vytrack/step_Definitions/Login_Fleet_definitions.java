package com.vytrack.step_Definitions;

import com.vytrack.pages.FleetPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Fleet_definitions {

    LoginPage loginPage=new LoginPage();
    FleetPage fleetPage=new FleetPage();
    WebDriverWait wait =new WebDriverWait(Driver.getDriver(),10);
    Actions actions=new Actions(Driver.getDriver());

    @Given("User is on the login Page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User enter {string} {string}")
    public void user_enter(String username, String password) {

        loginPage.login(username,password);

    }
    @Then("User should be able to see {string}")
    public void user_should_be_able_to_see(String fleet)throws InterruptedException {
    wait.until(ExpectedConditions.visibilityOf(fleetPage.fleetPage));
        String actual=fleetPage.fleetPage.getText();
        Assert.assertEquals(actual,"FLEET MANAGEMENT");
        Thread.sleep(2000);
    }


    @When("User is on the Landing Page, User clicks Fleet Button")
    public void userIsOnTheLandingPageUserClicksFleetButton()throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(fleetPage.fleetMainPageButton));
        actions.moveToElement(fleetPage.fleetMainPageButton).perform();
        Thread.sleep(2000);
    }

    @Then("User sees and click Vehicle Odometer")
    public void userSeesAndClickVehicleOdometer() throws InterruptedException{
        Thread.sleep(2000);
        actions.moveToElement(fleetPage.vehicleOdometer).click().perform();
    }

    @And("User will reach Vehicle Odometers Grind Page")
    public void userWillReachVehicleOdometersGrindPage() {
        Assert.assertTrue(fleetPage.vehicleOdometerGrindPage.isDisplayed());
    }



}
