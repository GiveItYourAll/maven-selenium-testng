package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {
    public static void main(String[] args) {

   WebDriver driver= new ChromeDriver();
   driver.get("https://www.ohchr.org");
   WebElement donate = driver.findElement(By.cssSelector("a.btn.btn--small.btn--bg-blue.btn-donate"));
   WebElement navigationBar = driver.findElement(By.cssSelector("div.header-navigation--inner"));
   WebElement whatAreHumanRights = driver.findElement(By.cssSelector("a[aria-label='What are human rights?']"));
   WebElement topics = driver.findElement(By.cssSelector("a[aria-label='Topics']"));
   WebElement countries = driver.findElement(By.cssSelector("a[aria-label='Countries']"));
   WebElement instrumentsMechanisms = driver.findElement(By.cssSelector("a[aria-label='Instruments & mechanisms']"));
   WebElement latest = driver.findElement(By.cssSelector("a[aria-label=Latest]"));
   WebElement aboutUs = driver.findElement(By.cssSelector("a[aria-label='About us']"));








    }



}
