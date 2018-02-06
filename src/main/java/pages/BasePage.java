package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Created by Sergey
 */
public class BasePage {

    public BasePage(WebDriver driver) {


        PageFactory.initElements(BaseSteps.getDriver(), this);


    }


    //следующую страницу
    public void nextPage() {

        ArrayList<String> tabs = new ArrayList<String>(BaseSteps.getDriver().getWindowHandles());

        BaseSteps.getDriver().switchTo().window(tabs.get(1));

    }


    public static boolean isElementPresent(By by) {

        try {

            BaseSteps.getDriver().findElement(by);

            return true;

        } catch (NoSuchElementException e) {

            return false;

        }

    }

}
