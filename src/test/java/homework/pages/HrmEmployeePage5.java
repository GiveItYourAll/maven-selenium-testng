package homework.pages;

import homework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HrmEmployeePage5 {
    public HrmEmployeePage5(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[text()='Salary']")
    public WebElement salaryTab;
    @FindBy(id = "addSalary")
    public WebElement addSalaryButton;
    @FindBy(xpath = "//select[@name='salary[sal_grd_code]']")
    public WebElement payGradeDropdown;
    @FindBy(xpath = "//input[@name='salary[salary_component]']")
    public WebElement salaryComponentInput;
@FindBy(xpath = "//select[@name='salary[payperiod_code]']")
    public WebElement payFrequencyDropdown;
@FindBy(xpath = "//select[@id='salary_currency_id']")
    public WebElement currencyDropdown;
@FindBy(xpath = "//input[@name='salary[basic_salary]']")
    public WebElement salary;
@FindBy(xpath = "//span[contains(text(), 'Should be within Min/Max values')]")
    public WebElement errorMessage;
@FindBy(id = "btnSalarySave")
    public WebElement saveButton;

}
