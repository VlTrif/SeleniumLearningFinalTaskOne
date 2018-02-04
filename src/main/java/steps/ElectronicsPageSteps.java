package steps;

import pages.ElectronicsPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ElectronicsPageSteps {

    @Step("Выбран пункт списка {0}")
    public void selectElectronicsListItem(String menuItem){

        new ElectronicsPage().selectMainMenu(menuItem);
    }
}
