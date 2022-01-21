package com.BookIT.pages;

import jdk.nashorn.internal.ir.IfNode;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookITLoginPage extends BasePage {


    @FindBy (name = "email")
    public WebElement emailInput;

    @FindBy (name = "password")
    public WebElement passwordInput;

    @FindBy (xpath = "//button")
    public WebElement signinBtn;
    public void signin(String username,String password){
        emailInput.clear();
        emailInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        if (signinBtn.isEnabled()) signinBtn.click();
        else {
            System.out.println("Sign in button is not clickable");
            Assert.assertTrue(false);
        }
    }
}
