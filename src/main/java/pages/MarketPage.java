package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MarketPage extends AbstractPage{

    @FindBy(xpath = "//*[contains(@class,'topmenu__list')]")
    WebElement mainMenu;

    @FindBy(xpath = "//*[contains(@class,'topmenu__subwrap')]")
    WebElement altMenu;

    public MarketPage () {
        PageFactory.initElements(BaseSteps.getDriver(), this);

    }

    public void selectMainMenu (String menuItem){
        mainMenu.findElement(By.xpath(".//li[contains(@data-department,'"+menuItem+"')]")).click();
    }

}

