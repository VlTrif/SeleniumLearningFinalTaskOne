package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ResultPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class ResultPageSteps {

    @Step("проверка количества элементов")
    public void checkCountOfResults(){
        new ResultPage().checkCountOfResults();
    }

    @Step("Сохранено название первого товара в списке")
    public void saveFirstElement(){
        new ResultPage().saveFirstElement();
    }

    @Step("Ввод в строку поиска значения сохраненного элемента")
    public void fillingSearch(){
        new ResultPage().firstResultName();
    }

    @Step("Нажатие кнопки найти")
    public void clickingOnSubmitBtn(){

        new ResultPage().submitBtn.click();
    }

    @Step("Проверка соответствия найденного элемента запрошенному")
    public void checkSearch(){
        BaseSteps.getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        String actualTitle = new ResultPage().titleGoods.getText();
        String searchText = new ResultPage().searchingBox.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, searchText), actualTitle.contains(searchText));
    }
}
