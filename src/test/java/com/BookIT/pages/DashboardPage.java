package com.BookIT.pages;

import com.BookIT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DashboardPage  extends BasePage{

    @FindBy(xpath = "//div[@class='map']")
    public WebElement mapView;

    @FindBy(xpath = "(//a[@class='navbar-link'])[2]")
    public WebElement topUserMenu;

    @FindBy (linkText = "sign out")
    public WebElement signOutBtn;

    @FindBy (xpath = "//h1[@class='title']")
    public WebElement header;

    public void logout() {
        //System.out.println("topUserMenu = " + topUserMenu.isDisplayed());
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(topUserMenu).perform();
        //System.out.println("signOutBtn = " + signOutBtn.isDisplayed());
        signOutBtn.click();
    }}
