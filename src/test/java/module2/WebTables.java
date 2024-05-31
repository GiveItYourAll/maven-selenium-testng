package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTables {
    public static void main(String [] args) {

       WebDriver driver = new ChromeDriver();

       driver.manage().window().maximize();
       driver.get("https://practice.expandtesting.com/tables");
       String currentUrl = driver.getCurrentUrl();
        System.out.println("Page title is: "+ currentUrl);

printEmailByFullName(driver, "John", "Smith");
        double expectedTotal = 251.0;
double actualTotal = getTotalAmountOfDueColumn(driver);
        if (actualTotal==expectedTotal) {
            System.out.println("TEST: PASSED"); } else {
            System.out.println("TEST: FAILED");}

        driver.quit();
    }

    public static void printEmailByFullName(WebDriver driver, String fName, String lName) {
        int size = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[1]")).size();
        String email = "";
        for (int i = 1; i <= size; i++) {
            String firstName = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[" + i + "]/td[2]")).getText();
            String lastName = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[" + i + "]/td[1]")).getText();
            String fullName = firstName + lastName;
            String expectedFullName = fName + lName;
            if (firstName.equals(fName) && lastName.equals(lName)) {
                email += driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[" + i + "]/td[3]")).getText();

                break;
            } }
            if (email.isEmpty()) {
                System.out.println("No such record found in table");
            } else {
                System.out.println(fName + " " + lName + "'s email address: " + email);
            }


        }




public static double getTotalAmountOfDueColumn(WebDriver driver) {
List<WebElement> due = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[4]"));
double size = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[4]")).size();
double total=0;
for(int i =0;i<size;i++) {
String num = due.get(i).getText().substring(1);
double number = Double.parseDouble(num);
total+=number;




}




        return total;
}


}


