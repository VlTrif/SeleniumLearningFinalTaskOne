package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class TvPage extends AbstractPage{

    @FindBy(xpath = "//*[contains(@class,'n-filter-panel-aside__show-more')]//*[contains(text(),'Перейти ко всем фильтрам')]")
    public WebElement extendedFilter;

    public TvPage () {
        PageFactory.initElements(BaseSteps.getDriver(), this);

    }

    /*public void selectFilter (){
        findElement(By.xpath("//*[contains(@class,'n-filter-panel-aside__show-more')]//*[contains(text(),'Перейти ко всем фильтрам')]")).click();
    }*/
    //*[contains(@class,'n-filter-panel-aside__show-more')]//*[contains(text(),'Перейти ко всем фильтрам')]
}
