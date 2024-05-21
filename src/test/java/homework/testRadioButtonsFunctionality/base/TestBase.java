package homework.testRadioButtonsFunctionality.base;

import homework.testRadioButtonsFunctionality.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBase {

    protected WebDriver driver;
@Parameters("browserType")
    @BeforeMethod
    public void setup(@Optional("chrome") String browserType) {
        driver = DriverFactory.getDriver(browserType);
        driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
        @AfterMethod
        public void tearDown() {
            driver.quit();
        }



    }

