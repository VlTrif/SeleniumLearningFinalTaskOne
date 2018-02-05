package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class FilterPage extends AbstractPage{

    @FindBy(name = "glf-pricefrom-var")
    WebElement priceFrom;

    @FindBy(xpath =
            "//div[contains(@data-filter-id,'7893318')]//div[contains(@class,'n-filter-block__list-items')]")
    WebElement checkBoxMenu;

    @FindBy(xpath = "//*[contains(text(),'Показать подходящие')]/..")
    public WebElement showBtn;

    public FilterPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this
        );
    }

    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Цена от":
                fillField(priceFrom, value);
                break;
            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }

    public void selectBrand(String menuItem){
        checkBoxMenu.findElement(By.xpath(".//*[contains(text(),'"+menuItem+"')]")).click();
    }
}
