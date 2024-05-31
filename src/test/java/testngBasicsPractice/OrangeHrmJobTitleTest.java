package testngBasicsPractice;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class OrangeHrmJobTitleTest {

    private WebDriver driver;
    @BeforeMethod
    public void beforeMethodForOrangeHrmWebsite() {
        driver = new ChromeDriver();
        driver.get("http://dev-hrm.yoll.io/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
@Test
    public void testUserCanAddJobTitle() throws InterruptedException {
    WebElement userNameBox = driver.findElement(By.cssSelector("input#txtUsername"));
    WebElement pwdBox = driver.findElement(By.cssSelector("input#txtPassword"));
    WebElement login = driver.findElement(By.cssSelector("input.button"));
    userNameBox.sendKeys(new CharSequence[]{"yoll-student"});
    pwdBox.sendKeys(new CharSequence[]{"Bootcamp5#"});
    login.click();
    Thread.sleep(2000);
    WebElement admin = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]"));
admin.click();
Thread.sleep(1000);
WebElement job = driver.findElement(By.id("menu_admin_Job"));
job.click();
Thread.sleep(1000);
WebElement jobTitles = driver.findElement(By.id("menu_admin_viewJobTitleList"));
jobTitles.click();
WebElement addButton = driver.findElement(By.cssSelector("input[id='btnAdd']"));
WebElement deleteButton = driver.findElement(By.cssSelector("input[value='Delete']"));
Assert.assertTrue(addButton.isDisplayed(), "Add button verification failed!");
Assert.assertTrue(deleteButton.isDisplayed(), "Delete button verification failed!");
addButton.click();
WebElement jobTitleInputField= driver.findElement(By.cssSelector("input[name='jobTitle[jobTitle]']"));
WebElement jobDescriptionField = driver.findElement(By.cssSelector("#jobTitle_jobDescription"));

Faker mockData = new Faker();

String jobTitle = mockData.job().title();;
String jobDescription =mockData.chuckNorris().fact();
jobTitleInputField.sendKeys(jobTitle);
jobDescriptionField.sendKeys(jobDescription);

WebElement saveButton = driver.findElement(By.cssSelector("#btnSave"));
Thread.sleep(3000);
saveButton.click();
Thread.sleep(2000);
List<WebElement> formList = driver.findElements(By.xpath("//table[@id='resultTable']/tbody//td[2]"));
boolean jobTitlePresent = false;
for (WebElement form: formList) {
if(form.getText().equals(jobTitle)) {jobTitlePresent=true;
    break;
     }
}
Assert.assertTrue(jobTitlePresent, "Job title is not present!");
}
}
