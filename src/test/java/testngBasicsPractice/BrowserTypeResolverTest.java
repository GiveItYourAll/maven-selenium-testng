package testngBasicsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class BrowserTypeResolverTest {
    private WebDriver driver;
    @Parameters("browserType")
@BeforeMethod
    public void setup(@Optional("chrome") String browserType) {
        switch(browserType){
            case "firefox"-> driver=new FirefoxDriver();
            case "safari"-> driver=new SafariDriver();
            case "edge"-> driver=new EdgeDriver();
            default-> driver=new ChromeDriver();
        }
        driver.get("https://www.bestbuy.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
    driver.quit();
    }
    @Test
    public void dummyTest(){
        System.out.println(driver.getTitle());
    }
}
