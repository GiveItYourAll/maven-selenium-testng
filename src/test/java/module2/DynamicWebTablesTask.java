package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicWebTablesTask {
    public static void main(String [] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/dynamic-table");
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);








          List<WebElement> columnHeaders = driver.findElements(By.xpath("//table//th"));
          int cpuColumnPosition =-1;
for (int i =0; i<columnHeaders.size(); i++) {
    String currentHeaderName = columnHeaders.get(i).getText();
    if ("CPU".equals(currentHeaderName)) {
        cpuColumnPosition = i+1;
        break;
    }
}
    String cpuFinder = driver.findElement(By.xpath("//table/tbody/tr/td[text()='Chrome']/../td["+cpuColumnPosition+"]")).getText();
    String expectedChromeCpu = driver.findElement(By.id("chrome-cpu")).getText();
  if(expectedChromeCpu.endsWith(cpuFinder)) {
      System.out.println("TEST: PASSED!");}
  else {
      System.out.println("TEST: FAILED!");}



    driver.quit();
}}









