package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XPathpractice {
    public static void main(String[] args) throws InterruptedException {

      WebDriver driver = new ChromeDriver();
      String url = "https://www.saucedemo.com/";
      driver.get(url);
      driver.manage().window().maximize();
WebElement userInput = driver.findElement(By.xpath("//input[@data-test='username']"));
WebElement passwordInput = driver.findElement(By.xpath("//input[@placeholder='Password']"));
WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
String username = "standard_user", password = "secret_sauce";
userInput.sendKeys(username);
passwordInput.sendKeys(password);
loginButton.click();
Thread.sleep(3000);
String currentUrl = driver.getCurrentUrl();
        System.out.println("URL after log in: "+currentUrl);
WebElement sauceLabsBackPackAddToCartButton = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
sauceLabsBackPackAddToCartButton.click();
Thread.sleep(3000);
WebElement sauceLabsBoltTShirtAddToCart = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']"));
sauceLabsBoltTShirtAddToCart.click();
Thread.sleep(3000);
WebElement cartButton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
cartButton.click();
Thread.sleep(3000);
        List<WebElement> productsInCart = driver.findElements(By.xpath("//div[@class='cart_item']"));
        int expectedItemsInCart = 2;
        int actualItemsInCart = productsInCart.size();
        if (actualItemsInCart==expectedItemsInCart) {
            System.out.println("TEST PASSED!");} else {
            System.out.println("TEST FAILED!");}
        System.out.println(actualItemsInCart);
        Thread.sleep(5000);

driver.quit();


    }
}
