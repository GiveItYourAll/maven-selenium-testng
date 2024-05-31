package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceXpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        String url = "https://magento.softwaretestingboard.com/";


        driver.get(url);
        driver.manage().window().maximize();
        WebElement logo = driver.findElement(By.xpath("//img[@src='https://magento.softwaretestingboard.com/pub/static/version1695896754/frontend/Magento/luma/en_US/images/logo.svg']"));
WebElement cart = driver.findElement(By.xpath("//span[@class='text']//.."));
WebElement searchInputBox = driver.findElement(By.xpath("//input[@id='search']"));
WebElement contactUsLink = driver.findElement(By.xpath(""));






    }

}
