package ru.aplana;

import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import steps.BaseSteps;
import steps.CalcSteps;
import steps.MainSteps;
import steps.TravelSteps;

import java.util.HashMap;

/**
 * Created by Sergey
 */
public class MyTestForAllureReport extends BaseSteps {

    @Test
    @Title("Страхование")
    public void textInsurance() {
        driver.get(baseUrl);
        MainSteps mainSteps = new MainSteps();
        CalcSteps calcSteps = new CalcSteps();
        TravelSteps travelSteps = new TravelSteps();
        BaseSteps baseSteps = new BaseSteps();
        mainSteps.stepSelectMainMenu("Застраховать себя");
        mainSteps.stepWaitElement("Страхование путешественников");
        mainSteps.stepSelectSubMenu("Страхование путешественников");
        travelSteps.stepSendAppButton();
        baseSteps.nextPage();
        calcSteps.stepChoice("Минимальная");
        calcSteps.clickSendNext();

        HashMap<String, String> testData = new HashMap<>();

        testData.put("Фамилия застрахованного", "Ivanov");
        testData.put("Имя застрахованного", "Ivan");
        testData.put("Фамилия", "Петров");
        testData.put("Имя", "Петр");
        testData.put("Отчество", "Петрович");
        testData.put("Дата рождения", "21.01.1991");
        testData.put("Серия паспорта", "4613");
        testData.put("Номер паспорта", "112443");
        testData.put("Дата выдачи", "22.08.2017");
        testData.put("Кем выдан", "ОВД");
        calcSteps.stepFillAllFields(testData);
        calcSteps.stepCheckAllFields(testData);
        calcSteps.stepChooseSex("мужской");
        calcSteps.sendButtonNext();
        calcSteps.stepCheckErrorMessage("Заполнены не все обязательные поля");

    }


}
