package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ResultPage extends AbstractPage {

    @FindBy(xpath = "//input[contains(@id,'header-search')]")
    public WebElement searchingBox;

    @FindBy(xpath = "//div[contains(@class,'n-snippet-')]//*[contains(@class,'title')]//a[contains(@class,'link')][1]")
    public WebElement firstElement;

    @FindBy(xpath = "//*[contains(@type,'submit')]")
    public WebElement submitBtn;

    public ResultPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
        BaseSteps.getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //new WebDriverWait(BaseSteps.getDriver(),10);
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
