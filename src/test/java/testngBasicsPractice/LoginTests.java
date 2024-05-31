package testngBasicsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testngBasicsPractice.pages.LoginPage;

public class LoginTests {
    private WebDriver driver;
    @BeforeMethod
    public void setup() {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://dev-hrm.yoll.io/index.php/auth/login");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

//    public void testPomPatter() {

//        LoginPage loginPage = new LoginPage(driver);

//        loginPage.userNameInputBox.sendKeys("yoll-student");
//        loginPage.passwordInputBox.sendKeys("Bootcamp5#");
//        loginPage.loginButton.click();
        @Test
                public void testEncapsulatedPomPattern() {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login("yoll-student", "Bootcamp5#");

        }
    }

