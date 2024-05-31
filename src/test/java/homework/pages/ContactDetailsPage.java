package homework.pages;

import homework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class ContactDetailsPage {

    public ContactDetailsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//input[@value='Edit'])[1]")
    public WebElement editButton;
    @FindBy(xpath="//input[@id='contact_street1']")
    public WebElement addressStreetInputBox;
    @FindBy(xpath="//input[@id='contact_street2']")
    public WebElement addressStreetInputBox2;
    @FindBy(xpath="//input[@id='contact_city']")
    public WebElement cityInputBox;
@FindBy(xpath="//input[@id='contact_province']")
    public WebElement provinceInputBox;
@FindBy(xpath="//input[@id='contact_emp_zipcode']")
    public WebElement zipInputBox;

@FindBy(xpath = "//select[@name='contact[country]']")
    public WebElement countryDropdown;

public void selectCountry(String countryName) {
    Select country = new Select(countryDropdown);
    List<WebElement> countryList = country.getOptions();
    for (WebElement countries : countryList) {
        System.out.println(countries.getText());
    }
    country.selectByVisibleText(countryName);
}
    @FindBy (xpath="//input[@id='btnSave']")
            public WebElement saveButton;

}
