package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

public class ResultPage extends AbstractPage {

    @FindBy(xpath = "//input[contains(@id,'header-search')]")
    public WebElement searchingBox;

    @FindBy(xpath = "//div[1][contains(@class,'n-snippet-card2__title')]//a[contains(@title,'Телевизор ')]")
    public WebElement firstElement;

    @FindBy(xpath = "//*[contains(@type,'submit')]")
    public WebElement submitBtn;

    public ResultPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    public void firstResultName(){
        String firstName = firstElement.getText();
        searchingBox.sendKeys(firstName);
    }

    /*public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Поиск":
                fillField(searchingBox, value);
                break;
            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }*/

}
