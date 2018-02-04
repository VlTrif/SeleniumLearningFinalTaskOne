package steps;

import pages.FilterPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

public class FilterPageSteps {

    @Step("Поле {0} заполняется значением {1}")
    public void stepFillField(String field, String value){

        new FilterPage().fillField(field,value);
    }

    @Step("Заполняются поля")
    public void stepWhenFillingFields(HashMap<String ,String> fields){
        fields.forEach(this::stepFillField);
    }

    @Step("Выбран брэнд {0}")
    public void selectingProductBrand(String menuItem){
        new FilterPage().selectBrand(menuItem);
    }

    @Step("Нажатие кнопки - показать подходящие")
    public void clickingOnShowBtn(){

        new FilterPage().showBtn.click();
    }
}
