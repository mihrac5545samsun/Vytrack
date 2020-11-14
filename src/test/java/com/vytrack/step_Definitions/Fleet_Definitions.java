package com.vytrack.step_Definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.FleetPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Fleet_Definitions extends BasePage {

    LoginPage loginPage = new LoginPage();
    FleetPage fleetPage = new FleetPage();
 // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Actions actions = new Actions(Driver.getDriver());


    @Given("User is on the Fleet login Page")
    public void user_is_on_the_fleet_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginPage.login("user36", "UserUser123");
    }

    @Then("User sees and click Fleet Page")
    public void user_sees_and_click_fleet_page() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(fleetPage.fleetPage));
        actions.moveToElement(fleetPage.fleetMainPageButton).perform();
        String actual = fleetPage.fleetPage.getText();
        logger.info("actual page : "+actual );
        Assert.assertEquals(actual, "FLEET MANAGEMENT");
        Thread.sleep(2000);
    }

    @Then("User sees Vehicle Odometer button and clicks it")
    public void user_sees_vehicle_odometer_button_and_clicks_it() throws InterruptedException {
        actions.moveToElement(fleetPage.vehicleOdometer).click().perform();
        Thread.sleep(2000);
    }

    @Then("User reaches Vehicle Odometers Grid Page")
    public void user_reaches_vehicle_odometers_grid_page() {
        Assert.assertTrue(fleetPage.vehicleOdometerGrindPage.isDisplayed());
    }

    @Given("User is on the Vehicle Odometer Grid Page")
    public void userIsOnTheVehicleOdometerGridPage() {
        Assert.assertTrue(fleetPage.vehicleOdometerGrindPage.isDisplayed());
    }

    @When("User clicks Create Vehicle Odometer button")
    public void userClicksCreateVehicleOdometerButton() throws InterruptedException {
        Thread.sleep(1000);
        fleetPage.createVehicleOdometer.click();
        Thread.sleep(2000);
    }

    @Then("user writes information about Vehicle Odometer")
    public void userWritesInformationAboutVehicleOdometer() throws InterruptedException {
        fleetPage.OdometerValue.sendKeys("2556");
        Thread.sleep(1000);
        fleetPage.date.click();
        Thread.sleep(1000);
        fleetPage.Nov2.click();
        Thread.sleep(1000);
        fleetPage.Driver.sendKeys("Mirac");
        Thread.sleep(1000);
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@class='select2 select2-offscreen']")));
        select.selectByVisibleText("km");
    }

    @And("User save information")
    public void userSaveInformation() throws InterruptedException {
        Thread.sleep(1000);
        fleetPage.saveButton.click();
        Thread.sleep(3000);
        fleetPage.editButton.click();
    }

    @Then("User delete all information he wrote")
    public void userDeleteAllInformationHeWrote() throws InterruptedException {
        Thread.sleep(2000);
        fleetPage.cancel.click();
        Thread.sleep(2000);
    }

    @When("User clicks Grid settings")
    public void userClicksGridSettings() {
        fleetPage.gridSettings.click();
    }

    @Then("User sees Grid setting table and select what they want to see")
    public void userSeesGridSettingTableAndSelectWhatTheyWantToSee()throws InterruptedException {
        fleetPage.visibilityId.click();
        Thread.sleep(1000);
        fleetPage.visibilityOdomoterValue.click();
        Thread.sleep(1000);
        fleetPage.visibilityDate.click();
        Thread.sleep(1000);
        fleetPage.visibilityDriver.click();
        Thread.sleep(1000);
        fleetPage.visibilityUnit.click();
        Thread.sleep(1000);

        fleetPage.emptyPoint.click();
    }
}
