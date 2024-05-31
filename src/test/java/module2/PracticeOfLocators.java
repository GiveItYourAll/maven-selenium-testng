package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOfLocators {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.get("http://demo.guru99.com/test/newtours/");
        WebElement usernameInput = driver.findElement(By.name("userName"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement submitButton = driver.findElement(By.name("submit"));
        String userName = "test@email.com";
        String password = "test";
        usernameInput.sendKeys(userName);
        Thread.sleep(2000);
        passwordInput.sendKeys(password);
Thread.sleep(2000);

        submitButton.click();
        Thread.sleep(5000);


        WebElement vacations = driver.findElement(By.partialLinkText("Vacations"));
        vacations.click();
        Thread.sleep(5000);
        WebElement register = driver.findElement(By.linkText("REGISTER"));
register.click();
String expectedUrlPostFix = "/register.php";
String actualUrl = driver.getCurrentUrl();
if (actualUrl.endsWith(expectedUrlPostFix)) {
    System.out.println("TEST PASSED!");
} else {
    System.err.println("TEST FAILED!"); }

Thread.sleep(3000);
driver.quit();








    }


}
