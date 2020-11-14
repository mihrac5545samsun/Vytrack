package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(id = "prependedInput")
    private WebElement username;

    @FindBy(id = "prependedInput2")
    private  WebElement password;

    @FindBy(id = "_submit")
    private WebElement loginbutton;

    public void login(String user,String pass){

        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(user);
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(pass);
        wait.until(ExpectedConditions.visibilityOf(loginbutton)).click();

    }

}
