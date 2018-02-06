package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

/**
 * Created by Sergey
 */
public class TravelPage {

    @FindBy(xpath = "//*/img[contains(@src, 'banner-zashita-traveler.jpg')]")
    public WebElement sendButton;

    public TravelPage(WebDriver driver) {
        PageFactory.initElements(BaseSteps.getDriver(), this);
        Wait<WebDriver> wait=new WebDriverWait(BaseSteps.getDriver(),5,1000);
        wait.until(ExpectedConditions.visibilityOf(sendButton));
    }

}
