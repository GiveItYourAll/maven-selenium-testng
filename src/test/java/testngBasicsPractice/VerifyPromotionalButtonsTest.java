package testngBasicsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyPromotionalButtonsTest {


    WebDriver driver;



  @BeforeMethod
  public void beforeMethodForMagentoWebsite() {
     driver = new ChromeDriver();
     driver.get("https://magento.softwaretestingboard.com/");
driver.manage().window().maximize();
  }
@AfterMethod
public void quit() {

      driver.quit();
}

  @Test(priority=1)
    public void verifyPromotionalButtons() throws InterruptedException {

      String expectedTitleOfPage = "Home Page";
      String actualTitleOfPage = driver.getTitle();
      Assert.assertEquals(actualTitleOfPage, expectedTitleOfPage, "Actual title is different from expected!");
      WebElement shopNewYoga = driver.findElement(By.xpath("//*[text()='Shop New Yoga']"));
      boolean isDisplayed = shopNewYoga.isDisplayed();
      Assert.assertTrue(isDisplayed, "This statement is not True!");
  }

  @Test(priority=2)
        public void verifyShopWomenDealsIsDisplayed() throws InterruptedException {
          WebElement saleButton = driver.findElement(By.xpath("//*[text()='Sale']"));
          saleButton.click();
          Thread.sleep(2000);
          WebElement shopWomenDeals = driver.findElement(By.xpath("//*[@class='more button']"));
          boolean isShopWomenDealsDisplayed = shopWomenDeals.isDisplayed();
          Assert.assertTrue(isShopWomenDealsDisplayed, "Shop Women's Deals button is not displayed!");

      }







  }



