package testngBasicsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class HrmLogin {

private WebDriver driver;
@BeforeMethod
public void setup() {
    driver = new ChromeDriver();
    driver.get("http://dev-hrm.yoll.io/");
    driver.manage().window().maximize();
}
 @AfterMethod
         public void tearDown() {
     driver.quit();
    }

    public void login(String username, String password) {
        WebElement userNameInput = driver.findElement(By.name("txtUsername"));
        WebElement passwordInput = driver.findElement(By.id("txtPassword"));
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
userNameInput.sendKeys(username);
passwordInput.sendKeys(password);
loginButton.click();

    }
    @Test(dataProviderClass = TestData.class, dataProvider = "InvalidLoginCredentialsDataSet")
    public void testLoginWithInvalidCredentials(String username, String password, String expectedErrorMessage) {
        login(username, password);
        WebElement errorMessageElement = driver.findElement(By.id("spanMessage"));
        String actualErrorMessage = errorMessageElement.getText();

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message verification failed!");
    }
        @Parameters({"username", "password"})
@Test()
public void testSuccessfulLoginDisplaysUsername(String username, String password) {
    login(username, password);
    WebElement welcomeMessageElement=driver.findElement(By.id("welcome"));
    String actualWelcomeMessage = welcomeMessageElement.getText();
    String expectedWelcomeMessage = "Welcome Yoll";
    Assert.assertEquals(actualWelcomeMessage, expectedWelcomeMessage, "Welcome message verification failed!");
}

}
