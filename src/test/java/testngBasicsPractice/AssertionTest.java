package testngBasicsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {

@Test
    public void verifyPageTitle() {
    WebDriver driver = new ChromeDriver();
    driver.get("http://dev-hrm.yoll.io/");
    driver.manage().window().maximize();

String actualTitle = driver.getTitle();
String expectedTitle = "OrangeHRM";
Assert.assertTrue(expectedTitle.equals(actualTitle));

driver.quit();
}










}



