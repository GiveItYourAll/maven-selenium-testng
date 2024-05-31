package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RecapTablesPractice {
    public static  void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();

        driver.get("https://www.testautomationpractice.blogspot.com/");
        Thread.sleep(4000);
        int size = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[2]")).size();
        String authors = "";
        for (int i = 0; i<size; i++) {
            List<WebElement> authorsList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[2]"));
            authors+=authorsList;

            System.out.println(authors);
        }


    }
}
