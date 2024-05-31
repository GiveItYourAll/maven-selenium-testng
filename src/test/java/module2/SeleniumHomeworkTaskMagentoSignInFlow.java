package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHomeworkTaskMagentoSignInFlow {
    public static void main(String [] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
        String email = "testautoman@email.com";
        String pwd = "qwerty123!";
        String url = "https://magento.softwaretestingboard.com//";


        driver.get(url);
        driver.manage().window().maximize();
        WebElement signIn = driver.findElement(By.xpath("//li[@class='authorization-link']/a"));
signIn.click();
Thread.sleep(2000);
WebElement emailInput = driver.findElement(By.xpath("//input[@name='login[username]']"));
emailInput.sendKeys(email);
Thread.sleep(2000);
WebElement pwdInput = driver.findElement(By.xpath("//input[@name='login[password]']"));
pwdInput.sendKeys(pwd);
Thread.sleep(2000);
WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit' and @name='send' and @class = 'action login primary']"));
signInButton.click();
Thread.sleep(2000);
String currentUrl = driver.getCurrentUrl();
        System.out.println("Title of the page is "+ currentUrl);
        WebElement welcome = driver.findElement(By.xpath("//span[text() = 'Welcome, Test Automan!']"));
        String welcomeText = welcome.getText();

        System.out.println(welcome);
        if(welcomeText.contains("Welcome")) {System.out.println("TEST: PASSED");} else {
                System.out.println("TEST: FAILED");}
        Thread.sleep(5000);
driver.quit();

    }



}
