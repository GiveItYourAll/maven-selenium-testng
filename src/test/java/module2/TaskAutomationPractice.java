package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskAutomationPractice {
    public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.get("https://magento.softwaretestingboard.com/");
    driver.manage().window().maximize();
    String usernameInput = "yollstudent@email.com";
    String passwordInput = "Pa$$vv0rd";
    WebElement signInButton = driver.findElement(By.xpath("//a[contains(text(), 'Sign In')][1]"));
    signInButton.click();
    Thread.sleep(2000);
    WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
    email.sendKeys(usernameInput);
    Thread.sleep(2000);
    WebElement password = driver.findElement(By.xpath("//input[@name='login[password]']"));
    password.sendKeys(passwordInput);
    Thread.sleep(2000);
    WebElement signIntoStore = driver.findElement(By.xpath("//button[@id='send2' and @class='action login primary']"));
    signIntoStore.click();
    String currentUrl = driver.getCurrentUrl();
        System.out.println("Title of this page: "+currentUrl);
        Thread.sleep(2000);
        WebElement welcome = driver.findElement(By.xpath("//span[contains(text(), 'Welcome, John Doe!')]"));
        String welcomeText = welcome.getText();
        System.out.println(welcomeText);
        driver.quit();








    }



}
