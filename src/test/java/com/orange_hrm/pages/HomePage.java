package com.orange_hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "welcome")
    private WebElement welcomeElement;
    @FindBy(id = "menu_admin_viewAdminModule")
    private WebElement adminTab;

    public String getWelcomeMessage() {
        return welcomeElement.getText();
    }

    public void clickAdminTab() {
        adminTab.click();
    }
}
