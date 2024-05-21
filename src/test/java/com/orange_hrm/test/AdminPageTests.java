package com.orange_hrm.test;

import com.orange_hrm.pages.AdminPage;
import com.orange_hrm.pages.HomePage;
import com.orange_hrm.pages.LoginPage;
import com.orange_hrm.test_data.ExpectedMessages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AdminPageTests {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://dev-hrm.yoll.io/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void verifyPageHeader() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("yoll-student", "Bootcamp5#");
        HomePage homePage = new HomePage(driver);
        homePage.clickAdminTab();
        AdminPage adminPage = new AdminPage(driver);
        String actualHeader = adminPage.getUserManagementHeader();
        Assert.assertEquals(actualHeader, ExpectedMessages.USER_MANAGEMENT_HEADER, "Admin header verification failed");
    }
}
