package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://dev-hrm.yoll.io/");
        Thread.sleep(3000);
WebElement userNameInput=driver.findElement(By.name("txtUsername"));
WebElement passwordInput=driver.findElement(By.name("txtPassword"));
userNameInput.sendKeys("username123");
userNameInput.clear();
Thread.sleep(3000);
userNameInput.sendKeys("Yoll-Student");
passwordInput.sendKeys("Bootcamp5#");
WebElement loginButton =driver.findElement(By.id("btnLogin"));
       loginButton.click();
        Thread.sleep(3000);
        driver.quit();

    }
}
