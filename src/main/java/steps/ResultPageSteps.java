package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ResultPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.List;

public class ResultPageSteps {

    @Step("проверка количества элементов")
    public void checkCountOfResults(){
        List<WebElement> elements = BaseSteps.getDriver().findElements(By.xpath("//*[contains(@data-id,'model-')]"));
        Assert.assertTrue(elements.size()==12);
    }

    /*@Step("Поле {0} заполняется значением {1}")
    public void stepFillSearchField(String field){
        String firstName = BaseSteps.getDriver().findElement(By.xpath("//div[1][contains(@class,'n-snippet-card2__title')]//a[contains(@title,'Телевизор ')]")).getText();
        new ResultPage().fillField(field,firstName);
    }*/

    @Step("получение имени первого элемента")
    public void fillingSearch(){
        new ResultPage().firstResultName();
    }

    @Step("Нажатие кнопки найти")
    public void clickingOnSubmitBtn(){

        new ResultPage().submitBtn.click();
    }
}
