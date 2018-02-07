package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Sergey
 */
public class ScenarioSteps {
    MainSteps mainSteps = new MainSteps();
    CalcSteps calcSteps = new CalcSteps();
    TravelSteps travelSteps = new TravelSteps();
    BaseSteps baseSteps = new BaseSteps();

    @When("^выбран пункт меню \"(.*)\"$")
    public void stepSelectItem(String menuItem) {
        mainSteps.stepSelectMainMenu(menuItem);
    }

    @When("^Ожидаем загрузки заголовка \"(.*)\"$")
    public void stepWaitElement(String menuItem) {
        mainSteps.stepWaitElement(menuItem);
    }

    @When("^выбран вид страхования -\"(.*)\"$")
    public void stepSelectTypeInsurance(String menuItem) {
        mainSteps.stepSelectSubMenu(menuItem);

    }

    @When("^выполнено нажатие на кнопку Оформить онлайн$")
    public void stepSendAppButton() {
        travelSteps.stepSendAppButton();
    }

    @When("^Переключение на вторую вкладку$")
    public void nextPage() {
        baseSteps.nextPage();

    }

    @When("^выбран полис страхования -\"(.*)\"$")
    public void stepChoice(String menuItem) {
        calcSteps.stepChoice(menuItem);
    }

    @When("^выполнено нажатие на кнопку-Оформить$")
    public void clickSendNext() {
        calcSteps.clickSendNext();

    }


    @When("^заполняются поля:$")
    public void stepFillFields(DataTable fields) {
        fields.asMap(String.class, String.class).forEach(
                (key, value) -> calcSteps.stepFillField(key, value));

    }

    @When("^выбран пол -\"(.*)\"$")
    public void stepChooseSex(String getSex) {
        calcSteps.stepChooseSex(getSex);
    }

    @When("^выполнено нажатие на кнопку-Продолжить$")
    public void sendButtonNext() {
        calcSteps.sendButtonNext();

    }


    @Then("^Проверяем значения полей:$")
    public void stepCheckFields(DataTable fields) {
        fields.asMap(String.class, String.class).forEach(
                (key, value) -> calcSteps.stepCheckField(key, value)
        );
    }


    @Then("^проверка сообщения об ошибке -\"(.*)\"$")
    public void stepCheckErrorMessage(String errorMessage) {
        calcSteps.stepCheckErrorMessage(errorMessage);

    }


}



















