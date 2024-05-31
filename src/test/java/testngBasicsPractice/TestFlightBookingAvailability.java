package testngBasicsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestFlightBookingAvailability {
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void noSeatsAvailableMessage() throws InterruptedException {
        WebElement flightsButton = driver.findElement(By.xpath("//*[contains(text(),'Flights')]"));
        flightsButton.click();
        Thread.sleep(1000);
        WebElement passengers = driver.findElement(By.name("passCount"));
        passengers.click();
        Thread.sleep(1000);
WebElement count = driver.findElement(By.xpath("//option[@value='2']"));
count.click();
Thread.sleep(1000);
WebElement fromCityDropdown = driver.findElement(By.name("fromPort"));
fromCityDropdown.click();
Thread.sleep(1000);

WebElement fromCity = driver.findElement(By.xpath("//select[@name='fromPort']/option[@value='New York']"));
fromCity.click();
Thread.sleep(1000);
WebElement fromMonth = driver.findElement(By.xpath("//select[@name='fromMonth']"));
fromMonth.click();
WebElement june = driver.findElement(By.xpath("//select[@name='fromMonth']/option[@value='6']"));
june.click();
Thread.sleep(1000);
WebElement fromDay = driver.findElement(By.name("fromDay"));
fromDay.click();
Thread.sleep(1000);
WebElement dayOfDeparting = driver.findElement(By.xpath("//select[@name='fromDay']/option[@value='1']"));
dayOfDeparting.click();
Thread.sleep(1000);
WebElement arrivingInDropdown = driver.findElement(By.name("toPort"));
arrivingInDropdown.click();
Thread.sleep(1000);

WebElement arrivingInCity = driver.findElement(By.xpath("//select[@name='toPort']/option[@value='Paris']"));
arrivingInCity.click();
Thread.sleep(1000);
WebElement toMonth = driver.findElement(By.name("toMonth"));
toMonth.click();
Thread.sleep(1000);
WebElement november = driver.findElement(By.xpath("//select[@name='toMonth']/option[@value='11']"));
november.click();
Thread.sleep(1000);
WebElement toDay = driver.findElement(By.name("toDay"));
toDay.click();
Thread.sleep(1000);
WebElement dayOfReturning = driver.findElement(By.xpath("//select[@name='toDay']/option[@value='6']"));
dayOfReturning.click();
Thread.sleep(1000);
WebElement businessClass = driver.findElement(By.xpath("//input[@value='Business']"));
businessClass.click();
Thread.sleep(1000);
WebElement airlineDropdown = driver.findElement(By.name("airline"));
airlineDropdown.click();
Thread.sleep(1000);
WebElement airline = driver.findElement(By.xpath("//select[@name='airline']/option[3]"));
airline.click();
Thread.sleep(1000);
WebElement continueButton = driver.findElement(By.xpath("//*[@name='findFlights']"));
continueButton.click();
Thread.sleep(1000);
WebElement text = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/p/font/b/font[1]"));
 String expectedText = "No Seats Avaialble";
 String actualText = text.getText();
 Assert.assertTrue(actualText.contains(expectedText), "Text Verification Failed!");

        }
    }

