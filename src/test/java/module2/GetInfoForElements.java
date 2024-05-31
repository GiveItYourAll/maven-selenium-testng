package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetInfoForElements {
    public static void main(String[] args) throws InterruptedException {


    WebDriver driver = new ChromeDriver();
    driver.get("http://dev-hrm.yoll.io/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
WebElement usernameInput = driver.findElement(By.cssSelector("#txtUsername"));
WebElement passwordInput = driver.findElement(By.cssSelector("#txtPassword"));
WebElement button = driver.findElement(By.cssSelector(".button"));

String user = "yoll-student";

String pwd = "Bootcamp5#";
usernameInput.sendKeys(user);
        Thread.sleep(2000);
passwordInput.sendKeys(pwd);
        Thread.sleep(2000);
        button.click();
        Thread.sleep(2000);
boolean logoList = driver.findElement(By.xpath("//img[contains(@src, 'yoll-logo.png')]")).isDisplayed();
        boolean isEnabled = driver.findElement(By.xpath("//img[contains(@src, 'yoll-logo.png')]")).isEnabled();

        System.out.println("Logo passed: "+logoList);
        System.out.println("Logo is enabled: "+isEnabled);
        Thread.sleep(2000);
        WebElement info = driver.findElement(By.cssSelector("#menu_pim_viewMyDetails"));
        info.click();
        Thread.sleep(2000);
        boolean isFullNameDisabled = driver.findElement(By.cssSelector("input[value=Yollllllll]")).isEnabled();
        System.out.println("Is full name enabled: "+isFullNameDisabled);

        driver.quit();




}

}
