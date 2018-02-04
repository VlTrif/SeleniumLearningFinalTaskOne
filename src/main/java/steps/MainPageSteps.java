package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainPageSteps {

    @Step("Выбран пункт меню {0}")
    public void selectMenuItem(String menuItem){

        new MainPage().selectMainMenu(menuItem);
    }
}
