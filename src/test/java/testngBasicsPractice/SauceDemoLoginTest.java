package testngBasicsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceDemoLoginTest {

    private WebDriver driver;
@BeforeMethod
public void setup() {
    driver=new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();

}
@AfterMethod
    public void tearDown() {
    driver.quit();
    }
    @DataProvider(name= "loginCredentials")
    public Object[][] dataSet() {
      Object[][] data = {
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},
                {"error_user", "secret_sauce"},
                {"visual_user", "secret_sauce"},
        };
     return data;
    }
@Test(dataProvider = "loginCredentials")
    public void testLoginWithValidCredentials(String username, String password) throws InterruptedException {

WebElement userInputBox = driver.findElement(By.id("user-name"));
WebElement passwordInputBox = driver.findElement(By.id("password"));
WebElement loginButton = driver.findElement(By.id("login-button"));

userInputBox.sendKeys(username);
passwordInputBox.sendKeys(password);
Thread.sleep(2000);
loginButton.click();
Thread.sleep(2000);
String actualUrl = driver.getCurrentUrl();
String expectedEndpoint = "/inventory.html";
Assert.assertTrue(actualUrl.endsWith(expectedEndpoint), "Login validation failed");


    }

}

