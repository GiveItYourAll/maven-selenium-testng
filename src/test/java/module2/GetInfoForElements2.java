package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetInfoForElements2 {
public static void main(String[] args) throws InterruptedException {


    WebDriver driver = new ChromeDriver();
driver.get("https://haltersweb.github.io/Accessibility/submit-disabling.html");
driver.manage().window().maximize();
Thread.sleep(2000);
String currentUrl = driver.getCurrentUrl();
    System.out.println(currentUrl);
    WebElement submitButton = driver.findElement(By.cssSelector(".btn"));
    String text = submitButton.getAttribute("aria-disabled");
    System.out.println("Submit button is disabled: " + text);

    System.out.println("The text color of the submit button is: "+submitButton.getCssValue("text-decoration-color"));
    WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='firstName']"));
    WebElement lastNameInput = driver.findElement(By.xpath("//input[@id='lastName']"));
    firstNameInput.sendKeys("Asifius");
    Thread.sleep(2000);
firstNameInput.sendKeys(Keys.chord(Keys.TAB, "Ahmadzada"));
Thread.sleep(2000);
WebElement cat = driver.findElement(By.xpath("//input[@id='cat']"));
cat.click();
Thread.sleep(2000);
    String text1 = submitButton.getAttribute("aria-disabled");

    System.out.println("Submit button is disabled? "+text1);
    System.out.println("Text color now is: "+submitButton.getCssValue("text-decoration-color"));


driver.quit();
}
}
