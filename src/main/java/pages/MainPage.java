package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MainPage extends AbstractPage{

    @FindBy(xpath = "//*[contains(@class,'home-tabs ')]")
    WebElement mainMenu;

    //*[contains(@class,'topmenu__list')]

    public MainPage () {
        PageFactory.initElements(BaseSteps.getDriver(), this);

    }

    public void selectMainMenu (String menuItem){
        mainMenu.findElement(By.xpath(".//a[contains(text(),'"+menuItem+"')]")).click();
    }
}
