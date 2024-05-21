package com.orange_hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);}
    @FindBy(id="txtUsername")
    private WebElement userNameInputBox;
    @FindBy(css="#txtPassword")
    private WebElement passwordInputBox;
    @FindBy(xpath= "//*[@id='btnLogin']")
    private WebElement loginButton;
    @FindBy(id="spanMessage")
    private WebElement errorMessageElement;
    public void login(String username, String password) {
        userNameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();

    }
    public String getErrorMessage()  {
        return errorMessageElement.getText();
    }
}
