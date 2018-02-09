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

import static org.junit.Assert.assertTrue;

public class ResultPage extends AbstractPage {

    @FindBy(xpath = "//input[contains(@id,'header-search')]")
    public WebElement searchingBox;

    @FindBy(xpath = "//h1[contains(@class,'title')]")
    public WebElement titleGoods;

    @FindBy(xpath = "//div[contains(@class,'n-snippet-')]//*[contains(@class,'title')]//a[contains(@class,'link')][1]")
    public WebElement firstElement;

    @FindBy(xpath = "//*[contains(@type,'submit')]")
    public WebElement submitBtn;

    public ResultPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
        BaseSteps.getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    public void checkCountOfResults(){
        List<WebElement> elements = BaseSteps.getDriver().findElements(By.xpath("//*[contains(@data-id,'model-')]"));
        assertTrue(elements.size()==12);
    }

    public String saveFirstElement(){
        String element = firstElement.getText();
        return element;
    }

    public void firstResultName(){
        searchingBox.sendKeys(saveFirstElement());
    }

}
