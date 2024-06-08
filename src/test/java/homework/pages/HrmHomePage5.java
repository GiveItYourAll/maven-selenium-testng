package homework.pages;

import homework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HrmHomePage5 {
    public HrmHomePage5(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "menu_pim_viewPimModule")
    public WebElement pimButton;
@FindBy(xpath = "//*[text()='Joe']")
    public WebElement employeeNameButton;

}
