package steps;


import ru.yandex.qatools.allure.annotations.Step;

import pages.MainPage;


/**
 * Created by Sergey
 */
public class MainSteps extends BaseSteps {
    @Step("Выбран меню{0}")
    public void stepSelectMainMenu(String menuItem) {
        new MainPage(driver).selectMainMenu(menuItem);
    }

    @Step("Выбран вид страхования{0}")
    public void stepSelectSubMenu(String menuItem) {
        new MainPage(driver).selectSubMenu(menuItem);
    }

@Step("Ожидание загрузки{0}")
public void stepWaitElement(String menuItem) {
    new MainPage(driver).waitElement(menuItem);
}


}
