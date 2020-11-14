package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FleetPage extends BasePage {

    @FindBy(xpath = "(//a[.='Fleet Management'])[2]")
    public WebElement fleetPage;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetMainPageButton;

    @FindBy(xpath = "//span[.='Vehicle Odometer']")
    public WebElement vehicleOdometer;

    @FindBy(xpath = "//h1[.='Vehicles Odometers']")
    public WebElement vehicleOdometerGrindPage;

    @FindBy(xpath = "//a[@title='Create Vehicle Odometer']")
    public WebElement createVehicleOdometer;

    @FindBy(xpath = "(//input[contains(@id,custom_entity_type_OdometerValue)])[3]")
    public WebElement OdometerValue;

    @FindBy(xpath = "//input[@placeholder='Choose a date']")
    public WebElement date;

    @FindBy(xpath = "//a[.='2']")
    public WebElement Nov2;

    @FindBy(xpath = "//input[@data-name='field__driver']")
    public WebElement Driver;

    @FindBy(xpath = "//select[@class='select2 select2-offscreen']")
    public WebElement unitMiles;

    @FindBy(xpath = "//div[@class='btn-group pull-right']")
    public WebElement saveButton;

    @FindBy(xpath = "//a[@class='btn back icons-holder-text edit-button main-group']")
    public WebElement editButton;

    @FindBy(xpath = "//a[@data-action='cancel']")
    public WebElement cancel;

    @FindBy(xpath = "//i[@class='fa-cog hide-text']")
    public WebElement gridSettings;

    @FindBy(xpath = "(//td[@class='visibility-cell'])[1]")
    public WebElement visibilityId;

    @FindBy(xpath = "(//td[@class='visibility-cell'])[1]")
    public WebElement visibilityOdomoterValue;

    @FindBy(xpath = "(//td[@class='visibility-cell'])[1]")
    public WebElement visibilityDate;

    @FindBy(xpath = "(//td[@class='visibility-cell'])[1]")
    public WebElement visibilityDriver;

    @FindBy(xpath = "(//td[@class='visibility-cell'])[1]")
    public WebElement visibilityUnit;

    @FindBy(xpath = "//div[@class='breadcrumb-pin']")
    public WebElement emptyPoint;















}
