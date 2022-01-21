package com.BookIT.pages;

import com.BookIT.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

/**
 * parent class for concrete Page object classes
 * provides constructor with initElements method for re-usability
 * abstract - to prevent instantiation.
 */
public abstract class BasePage {
    /**
     * parent class for concrete Page object classes
     * provides constructor with initElements method for reusabaletity
     * abstract - to prevent instantiation
     */
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}