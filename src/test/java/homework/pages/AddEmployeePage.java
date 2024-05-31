package homework.pages;

import homework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {

    public AddEmployeePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@name='firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//*[@name='lastName']")
    public WebElement lastName;
    @FindBy(xpath = "//*[@id='btnSave']")
    public WebElement saveButton;
    @FindBy(xpath = "//a[text()='Contact Details']")
    public WebElement contactDetails;

}