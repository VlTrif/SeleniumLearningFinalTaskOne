package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ElectronicsPage extends AbstractPage{

    @FindBy(xpath = "//*[contains(@class,'catalog-menu ')]")
    WebElement mainMenu;

    public ElectronicsPage () {
        PageFactory.initElements(BaseSteps.getDriver(), this);

    }

    public void selectMainMenu (String menuItem){
        mainMenu.findElement(By.xpath("./div//a[1][contains(text(),'"+menuItem+"')]")).click();
    }

}
