package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbstractPage {



    public void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }
}
