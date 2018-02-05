package steps;

import ru.yandex.qatools.allure.annotations.Step;
import pages.TravelPage;

/**
 * Created by Sergey
 */
public class TravelSteps extends BaseSteps {


    @Step("выполнено нажатие на кнопку отправить заявку")
    public void stepSendAppButton(){
        new TravelPage(driver).sendButton.click();

    }
}
