package homework.step_definitions;

import homework.pages.*;
import homework.utilities.ConfigReader;
import homework.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class HrmUserStory4 {
    @BeforeMethod
    public void setUp() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Driver.getDriver().manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() {

        Driver.quitDriver();

    }

    @Test
    public void userStory() {
        Driver.getDriver().get(ConfigReader.getProperty("hrm_url"));

        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        PimPage pimPage = new PimPage();
        ContactDetailsPage contactDetailsPage = new ContactDetailsPage();
        AddEmployeePage addEmployeePage = new AddEmployeePage();
        loginPage.login("yoll-student", "Bootcamp5#");
        homePage.pimButton.click();
        pimPage.addEmployee.click();
        addEmployeePage.firstName.sendKeys("Sean");
        addEmployeePage.lastName.sendKeys("Strickland");
        addEmployeePage.saveButton.click();
        addEmployeePage.contactDetails.click();
        contactDetailsPage.editButton.click();
        contactDetailsPage.addressStreetInputBox.sendKeys("3010 wilshire blvd");
        contactDetailsPage.addressStreetInputBox2.sendKeys("#418");
        contactDetailsPage.cityInputBox.sendKeys("LosAngeles");
        contactDetailsPage.provinceInputBox.sendKeys("California");
        contactDetailsPage.zipInputBox.sendKeys("90010");
        contactDetailsPage.selectCountry("United States");
        contactDetailsPage.saveButton.click();
      boolean addressLine1Displayed = contactDetailsPage.addressStreetInputBox.isDisplayed();
      boolean addressLine2Displayed = contactDetailsPage.addressStreetInputBox2.isDisplayed();
      boolean cityDisplayed = contactDetailsPage.cityInputBox.isDisplayed();
      boolean provinceInputBoxDisplayed = contactDetailsPage.provinceInputBox.isDisplayed();
      boolean zipInputBoxDisplayed = contactDetailsPage.zipInputBox.isDisplayed();
      boolean countryDisplayed = contactDetailsPage.countryDropdown.isDisplayed();
        Assert.assertTrue(addressLine1Displayed);
        Assert.assertTrue(addressLine2Displayed);
        Assert.assertTrue(cityDisplayed);
        Assert.assertTrue(provinceInputBoxDisplayed);
        Assert.assertTrue(zipInputBoxDisplayed);
        Assert.assertTrue(countryDisplayed);

    }

}

