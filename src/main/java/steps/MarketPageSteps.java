package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketPageSteps {

    @Step("Выбран пункт меню {0}")
    public void selectMainMenuItem(String menuItem){

        new MarketPage().selectMainMenu(menuItem);
    }

    /*@Step("Выбран пункт раскрывающегося меню {0}")
    public void selectAltMenuItem(String menuItem){

        new MarketPage().selectAltMenu(menuItem);
    }*/
}
