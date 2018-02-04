package ru.aplana;

import org.junit.Ignore;
import org.junit.Test;
import pages.CalcPage;
import pages.MainPage;
import pages.TravelPage;
import steps.BaseSteps;

/**
 * Created by Sergey
 */
public class RefactorSberTest extends BaseSteps {


    @Test
@Ignore
    public void newSberTest() {

        driver.get(baseUrl);
        MainPage mainPage = new MainPage(driver);
        mainPage.selectMainMenu("Застраховать себя");
        mainPage.selectMainMenu("и имущество");
        mainPage.selectSubMenu("Страхование путешественников");

        new TravelPage(driver).sendButton.click();


        CalcPage calcPage = new CalcPage(driver);
       // calcPage.testSberbank(driver);
        //calcPage.clickMinSum();
        calcPage.clickSendNext();

        calcPage.fillField("Фамилия застрахованного", "Ivanov");
        calcPage.fillField("Имя застрахованного", "Ivan");
        calcPage.fillField("Фамилия", "Петров");
        calcPage.fillField("Имя", "Петр");
        calcPage.fillField("Отчество", "Петрович");
        calcPage.fillField("Дата рождения", "21.01.1991");
       // calcPage.clickSex();
        calcPage.fillField("Серия паспорта", "4613");
        calcPage.fillField("Номер паспорта", "112443");
        calcPage.fillField("Дата выдачи", "22.08.17");
        calcPage.fillField("Кем выдан", "ОВД");

    }

}
