package com.BookIT.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy (name = "email")
    public WebElement emailInput;

    @FindBy (name = "password")
    public WebElement passwordInput;

    @FindBy (xpath = "//button")
    public WebElement signinBtn;

    @FindBy(xpath = "//h1[.='sign in']")
    public WebElement header;

    @FindBy (xpath = "//span[.='[object ProgressEvent]']")
    public WebElement signinFailedMessage;

    public void signin(String username,String password){
        emailInput.clear();
        emailInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        if (signinBtn.isEnabled()) signinBtn.click();
        else {
            System.out.println("Sign in button is not clickable");
            //Assert.assertTrue(false);
        }
    }
}
