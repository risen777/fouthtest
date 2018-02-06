package steps;


import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;
import pages.MainPage;


/**
 * Created by Sergey
 */
public class MainSteps {
    @Step("Выбран меню{0}")
    public void stepSelectMainMenu(String menuItem) {
        new MainPage(BaseSteps.getDriver()).selectMainMenu(menuItem);
    }

    @Step("Выбран вид страхования{0}")
    public void stepSelectSubMenu(String menuItem) {
        new MainPage(BaseSteps.getDriver()).selectSubMenu(menuItem);
    }

@Step("Ожидание загрузки{0}")
public void stepWaitElement(String menuItem) {
    new MainPage(BaseSteps.getDriver()).waitElement(menuItem);
}


}
