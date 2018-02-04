package steps;

import pages.TvPage;
import ru.yandex.qatools.allure.annotations.Step;

public class TvPageSteps {

    @Step("Выбирается расширенный фильтр")
    public void clickingOnFilter(){

        new TvPage().extendedFilter.click();
    }
}
