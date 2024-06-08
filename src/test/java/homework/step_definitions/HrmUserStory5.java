package homework.step_definitions;

import homework.pages.HrmEmployeePage5;
import homework.pages.HrmHomePage5;
import homework.pages.HrmLoginPage5;
import homework.utilities.ConfigReader;
import homework.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HrmUserStory5 {

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Driver.getDriver().manage().window().maximize();
    }

    @AfterMethod
    public void tearUp() {
        Driver.getDriver().quit();
    }


    @Test
    public void hrmSteps() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("hrm_url"));

        HrmLoginPage5 hrmLoginPage5 = new HrmLoginPage5();
        HrmHomePage5 hrmHomePage5 = new HrmHomePage5();
        HrmEmployeePage5 hrmEmployeePage5 = new HrmEmployeePage5();
        hrmLoginPage5.usernameInput.sendKeys(ConfigReader.getProperty("hrm_username"));
        hrmLoginPage5.passwordInput.sendKeys(ConfigReader.getProperty("hrm_password"));
        hrmLoginPage5.loginButton.click();
        hrmHomePage5.pimButton.click();
        hrmHomePage5.employeeNameButton.click();
        hrmEmployeePage5.salaryTab.click();
        hrmEmployeePage5.addSalaryButton.click();

        WebElement payGradeDropdown = hrmEmployeePage5.payGradeDropdown;
        Select dropdownSelect = new Select(payGradeDropdown);
        dropdownSelect.selectByValue("3");
        hrmEmployeePage5.salaryComponentInput.sendKeys("Test");
        WebElement payFrequencyDropdown = hrmEmployeePage5.payFrequencyDropdown;
        Select frequencySelect = new Select(payFrequencyDropdown);
        frequencySelect.selectByValue("4");

        WebElement currencyDropdown = hrmEmployeePage5.currencyDropdown;
        Select currencySelect = new Select(currencyDropdown);
        currencySelect.selectByValue("USD");
       Thread.sleep(3000);
        hrmEmployeePage5.salary.sendKeys("10");
        boolean errorMessageIsDisplayed = hrmEmployeePage5.errorMessage.isDisplayed();
        Assert.assertTrue(errorMessageIsDisplayed);
    }
}
