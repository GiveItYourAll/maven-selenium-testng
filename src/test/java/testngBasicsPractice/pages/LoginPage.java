package testngBasicsPractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//    WebElement usernameInputBox = driver.findElement(By.id("txtUsername"));
//    WebElement passwordInputBox = driver.findElement(By.id("txtPassword"));
//    WebElement loginButton = driver.findElement(By.id("txtUsername"));
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);}
        @FindBy(id="txtUsername")
             private  WebElement userNameInputBox;
    @FindBy(css="#txtPassword")
    private WebElement passwordInputBox;
    @FindBy(xpath= "//*[@id='btnLogin']")
    private WebElement loginButton;
public void login(String username, String password) {
    userNameInputBox.sendKeys(username);
    passwordInputBox.sendKeys(password);
    loginButton.click();

}
    }

