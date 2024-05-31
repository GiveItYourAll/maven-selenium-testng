package homework.pages;

import homework.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="txtUsername")
    private  WebElement usernameInputBox;
    @FindBy(css="#txtPassword")
    private WebElement passwordInputBox;
    @FindBy(xpath= "//*[@id='btnLogin']")
    private WebElement loginButton;
    public void login(String username, String password) {
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }
}
