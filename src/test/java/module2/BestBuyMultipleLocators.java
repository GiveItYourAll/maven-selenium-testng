package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BestBuyMultipleLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.bestbuy.com");

        WebElement searchInput = driver.findElement(By.id("gh-search-input"));
        WebElement searchButton = driver.findElement(By.className("header-search-button"));
        searchInput.sendKeys("iphone 15");
        Thread.sleep(2000);
        searchButton.click();
        Thread.sleep(2000);
        List<WebElement> products = driver.findElements(By.className("sku-title"));
        System.out.println("There are "+products.size()+ " items");

        for (WebElement product: products ) {
            String text=product.getText();
            System.out.println("Item: " + text);
            if (text.toLowerCase().contains("iphone 15")) {
                System.out.println("Relevant");} else {
                System.err.println("Irrelevant");}
            }



driver.quit();}}






