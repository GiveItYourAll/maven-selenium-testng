package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InClassTask {
    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://dev-hrm.yoll.io");

        WebElement userNameBox = driver.findElement(By.cssSelector("input#txtUsername"));
        WebElement pwdBox = driver.findElement(By.cssSelector("input#txtPassword"));
        WebElement login = driver.findElement(By.cssSelector("input.button"));
        userNameBox.sendKeys("yoll-student");
        pwdBox.sendKeys("Bootcamp5#");
        Thread.sleep(2000);
login.click();
Thread.sleep(2000);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The title of the homepage is: "+currentUrl);
String actualHeader = driver.findElement(By.cssSelector("div.head>h1")).getText();
String expectedPageHeader = "Dashboard";
if (expectedPageHeader.equals(actualHeader)) {
    System.out.println("TEST: PASSED");} else {
    System.err.println("TEST: FAILED");
    }
driver.quit();








    }


}
