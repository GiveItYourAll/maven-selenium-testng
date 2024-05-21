package homework.testRadioButtonsFunctionality.pages;

import homework.testRadioButtonsFunctionality.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//input[@value='Female']")
    private WebElement femaleSelection;
    @FindBy(xpath="//button[@id='buttoncheck']")
    private WebElement getValueButton;
    @FindBy(xpath="//p[contains(text(), 'Radio button')]")
    private WebElement femaleChecked;
@FindBy(xpath="//input[@value='RadioButton3']")
private WebElement radioButton3;
@FindBy(xpath="//div[@class='px-10 pt-20 pb-5']/label/input[@value='Male']")
private WebElement maleButton;
@FindBy(xpath="//input[@value='15 - 50']")
private WebElement age;
@FindBy(xpath="//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button")
private WebElement getValues2;
@FindBy(xpath="//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span")
private WebElement male;
@FindBy(xpath="//span[contains(text(), '15 - 50')]")
private WebElement ageAsText;
    public void selectFemale() {
        femaleSelection.click();
    }
        public void getValue() {
            getValueButton.click();
        }
    public String femaleChecked() {
        return femaleChecked.getText();
    }
    public boolean verifyRadioButton3Disabled() {

        return !radioButton3.isEnabled();
    }
public void maleButtonClick(){
        maleButton.click();
}
public void age() {
        age.click();
}
public void getValuesButton2(){
        getValues2.click();
}
public String maleAsText() {
        return male.getText();
}
public String ageAsText(){
        return ageAsText.getText();
}

    }


