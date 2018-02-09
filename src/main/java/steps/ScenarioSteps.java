package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    MarketPageSteps marketPageSteps = new MarketPageSteps();
    ElectronicsPageSteps electronicsPageSteps = new ElectronicsPageSteps();
    TvPageSteps tvPageSteps = new TvPageSteps();
    FilterPageSteps filterPageSteps = new FilterPageSteps();
    ResultPageSteps resultPageSteps = new ResultPageSteps();

    @When("^выбран пункт основного меню \"(.+)\"$")
    public void selectMenuItem(String menuItem){
        mainPageSteps.selectMenuItem(menuItem);
    }

    @When("^выбран пункт основного меню Яндекс маркета\"(.+)\"$")
    public void selectMainMenuItem(String menuItem){
        marketPageSteps.selectMainMenuItem(menuItem);
    }

    @When("^выбран пункт из списка электроники\"(.+)\"$")
    public void selectElectronicsListItem(String menuItem){electronicsPageSteps.selectElectronicsListItem(menuItem);}

    @When("^выбран расширенный фильтр")
    public void clickingOnFilter(){tvPageSteps.clickingOnFilter();}

    @When("^заполняются поля:")
    public void stepWhenFillingFields(DataTable fields){
        fields.asMap(String.class, String.class).forEach((key, value) -> filterPageSteps.stepFillField(key,value));
    }

    @When("^выбран пункт из списка брэндов\"(.+)\"$")
    public void selectingProductBrand(String menuItem){filterPageSteps.selectingProductBrand(menuItem);}

    @Then("Нажата кнопка показать подходящие")
    public void clickingOnShowBtn(){filterPageSteps.clickingOnShowBtn();}

    @When("Проверено, что отображается 12 элементов")
    public void checkCountOfResults(){resultPageSteps.checkCountOfResults();}

    @When("сохранено название первого товара в списке")
    public void saveFirstElement(){
        resultPageSteps.saveFirstElement();
    }

    @When("в поискувую строку вставляется название первого элемента")
    public void fillingSearch(){resultPageSteps.fillingSearch();}

    @Then("нажимается кнопка поиска")
    public void clickingOnSubmitBtn(){resultPageSteps.clickingOnSubmitBtn();}

    @Then("найденный элемент соответствует поиску")
    public void checkSearch(){
        resultPageSteps.checkSearch();
    }
}
