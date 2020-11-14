package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

  public  WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
  public  Logger logger=Logger.getLogger(BasePage.class);
}
