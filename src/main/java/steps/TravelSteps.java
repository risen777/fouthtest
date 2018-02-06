package steps;

import ru.yandex.qatools.allure.annotations.Step;
import pages.TravelPage;

/**
 * Created by Sergey
 */
public class TravelSteps{


    @Step("выполнено нажатие на кнопку отправить заявку")
    public void stepSendAppButton(){
        new TravelPage(BaseSteps.getDriver()).sendButton.click();

    }
}
