package steps;

import ru.yandex.qatools.allure.annotations.Step;
import pages.CalcPage;

import java.util.HashMap;


/**
 * Created by Sergey
 */
public class CalcSteps {



    @Step("Поле {0} заполнено значением - {1}")

    public void stepFillField (String field, String value) {

        new CalcPage(BaseSteps.getDriver()).fillField(field, value);

    }


    @Step("Проверка заполнений: поле - {0} - имеет значение - {1}")

    public void stepCheckField (String fieldToCheck, String valueCheck) {

        new CalcPage(BaseSteps.getDriver()).checkField(fieldToCheck, valueCheck);

    }

    @Step("Заполняются поля:")

    public void stepFillAllFields (HashMap<String,String> fields) {

        fields.forEach(this::stepFillField);

    }
    @Step("Проверка всех полей")

    public void stepCheckAllFields (HashMap<String,String> fields) {

        fields.forEach(this::stepCheckField);

    }




    @Step("Выбран пол - {0}")

    public void stepChooseSex(String getSex) {

        new CalcPage(BaseSteps.getDriver()).choiceSex(getSex);

    }

    @Step("Оформить")
    public void clickSendNext() {
        CalcPage calcPage = new CalcPage(BaseSteps.getDriver());
        calcPage.clickSendNext();
    }


    @Step("Минимальная сумма {0}")
    public void stepChoice(String menuItem) {
        CalcPage calcPage = new CalcPage(BaseSteps.getDriver());
        calcPage.clickMinSum();

    }

    @Step("Продолжить")
    public void sendButtonNext() {
        CalcPage calcPage = new CalcPage(BaseSteps.getDriver());
        calcPage.sendButtonNext();
    }

    @Step("Выведено сообщение об обязательности заполнения ключевых полей")

    public void stepCheckErrorMessage (String errorMessage) {

        new CalcPage(BaseSteps.getDriver()).checkErrorMessage(errorMessage);

    }

}
