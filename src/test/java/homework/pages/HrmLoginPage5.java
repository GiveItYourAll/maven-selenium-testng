package homework.pages;

import homework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HrmLoginPage5 {
    public HrmLoginPage5(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "txtUsername")
    public WebElement usernameInput;
    @FindBy(id = "txtPassword")
    public WebElement passwordInput;
    @FindBy(id = "btnLogin")
    public WebElement loginButton;

}
