package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class FilterPage extends AbstractPage{
    //*[contains(@name,'glf-pricefrom-var')]
    @FindBy(name = "glf-pricefrom-var")
    WebElement priceFrom;

    @FindBy(xpath =
            "//*[contains(@class,'n-filter-block n-filter-cookie i-bem n-filter-block_type_normal b-zone b-spy-visible n-filter-block_closed_no n-filter-block_pos_aside n-filter-block_js_inited n-filter-cookie_js_inited')]//*[contains(@class,'n-filter-block__list-items i-bem')]")
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
