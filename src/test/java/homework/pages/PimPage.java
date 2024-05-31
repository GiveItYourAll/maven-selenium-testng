package homework.pages;

import homework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

    public PimPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@class='ac_input']")
    public WebElement employeeName;
    @FindBy(xpath ="//*[text()='Add Employee']")
    public WebElement addEmployee;

}
