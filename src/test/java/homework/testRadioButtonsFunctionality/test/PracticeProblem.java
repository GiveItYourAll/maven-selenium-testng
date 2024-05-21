package homework.testRadioButtonsFunctionality.test;


import homework.testRadioButtonsFunctionality.base.TestBase;
import homework.testRadioButtonsFunctionality.pages.HomePage;
import homework.testRadioButtonsFunctionality.test_data.ExpectedMessages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeProblem extends TestBase {


    @Test
    public void practiceProblem() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.selectFemale();
        homePage.getValue();
        String actualText = homePage.femaleChecked();
        homePage.maleButtonClick();
        homePage.age();
        homePage.getValuesButton2();
        Thread.sleep(3000);
        String actualMaleText = homePage.maleAsText();
        String actualAgeText = homePage.ageAsText();

        Assert.assertEquals(actualText, ExpectedMessages.EXPECTED_AFTER_GET_VALUE_BUTTON_CLICK, "a text is shown on the screen test failed!");
        Assert.assertTrue(homePage.verifyRadioButton3Disabled(), "Radio Button 3 is disabled verification failed!");
        Assert.assertEquals(actualMaleText, ExpectedMessages.EXPECTED_VALUE_FOR_GENDER, "Gender verification failed!");
        Assert.assertEquals(actualAgeText, ExpectedMessages.EXPECTED_VALUE_FOR_AGE, "Age verification failed!");
    }
}
