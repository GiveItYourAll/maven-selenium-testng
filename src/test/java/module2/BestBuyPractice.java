package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuyPractice {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com/");
        WebElement searchInputBox=driver.findElement(By.className("search-input"));
WebElement searchButton = driver.findElement(By.className("header-search-button"));
searchInputBox.clear();
searchInputBox.sendKeys("iphone 15");
Thread.sleep(5000);
searchButton.click();
Thread.sleep(5000);
String currentUrl=driver.getCurrentUrl();
        System.out.println("Current URL: "+ currentUrl);
        if(currentUrl.contains("searchpage")) {
            System.out.println("TEST PASS");
        }else {
            System.out.println("TEST: FAIL");
        }
driver.quit();


    }
}
