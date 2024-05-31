package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RadioBox {
    public static void main(String [] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");

driver.manage().window().maximize();
WebElement firstName = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
firstName.sendKeys(Keys.chord("Asif", Keys.TAB, "Ahmadzada", Keys.TAB, "3010 wilshire blvd #418 Los Angeles CA 90010", Keys.TAB, "asiffvahidoglu@gmail.com", Keys.TAB, "8183185290", Keys.TAB));
Thread.sleep(2000);
maleOrFemale(driver,"male");
Thread.sleep(2000);
maleOrFemale(driver, "amale");
Thread.sleep(2000);
checkBoxes(driver, "Cricket");
checkBoxes(driver, "Hockey");
Thread.sleep(2000);
        WebElement skillsSection = driver.findElement(By.id("Skills"));

Select skills = new Select(skillsSection);

List<WebElement> optionsList = skills.getOptions();
for (WebElement allOptions: optionsList) {
    System.out.println(allOptions.getText());
}
skills.selectByValue("APIs");


Thread.sleep(2000);

WebElement countriesList = driver.findElement(By.id("country"));
Select countries = new Select(countriesList);
List<WebElement> countryList = countries.getOptions();
for (WebElement countrySelect: countryList) {
    System.out.println(countrySelect.getText());

}
countries.selectByValue("Bangladesh");
Thread.sleep(2000);

WebElement dOb = driver.findElement(By.cssSelector("#yearbox"));
Select dObSelect = new Select(dOb);
List<WebElement> dObList = dObSelect.getOptions();
boolean isPresent=true;
String expectedDob = "1990";
for (WebElement dOb1: dObList) {
    System.out.println(dOb1.getText());
    if (dOb1.equals(expectedDob)) {
        System.out.println("Date of birthvis: "+expectedDob);
    }
}
dObSelect.selectByVisibleText("1990");
Thread.sleep(2000);

WebElement month = driver.findElement(By.cssSelector("*[placeholder=Month]"));
Select monthSelect = new Select(month);
List<WebElement> birthMonth = monthSelect.getOptions();
for (WebElement months: birthMonth) {

    System.out.println(months.getText());
}
monthSelect.selectByValue("March");
Thread.sleep(2000);

WebElement day = driver.findElement(By.id("daybox"));
Select dayList = new Select(day);
List<WebElement> daysList = dayList.getOptions();
for (WebElement days: daysList) {
    System.out.println(days.getText());
}
dayList.selectByValue("20");
Thread.sleep(2000);
WebElement password = driver.findElement(By.cssSelector("#firstpassword"));
password.sendKeys(Keys.chord("klanaplan", Keys.TAB, "klanaplan", Keys.TAB, Keys.ENTER));
Thread.sleep(2000);
driver.quit();











    }



public static void maleOrFemale(WebDriver driver, String type) {
         List<WebElement> gender = driver.findElements(By.cssSelector("input[type=radio]"));
switch (type.toLowerCase()) {
    case "male":
        gender.get(0).click();
        break;
    case "female":
        gender.get(1).click();
        break;
    default:
        System.out.println("There is no radio button with such value: " + type);

}}
public static void checkBoxes(WebDriver driver, String type){
        List<WebElement> hobbies = driver.findElements(By.cssSelector("input[type=checkbox]"));

        for (WebElement option : hobbies) {
            String actualValue = option.getAttribute("value");
            if (actualValue.equalsIgnoreCase(type)) {
                option.click();
                break;
            }


        }


    }}







