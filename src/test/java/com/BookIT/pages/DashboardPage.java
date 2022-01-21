package com.BookIT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage  extends BasePage{

    @FindBy(xpath = "//div[@class='map']")
    public WebElement mapView;
}
