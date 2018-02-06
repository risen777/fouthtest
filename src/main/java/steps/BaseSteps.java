package steps;


import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.junit.Assert;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import pages.BasePage;
import ru.yandex.qatools.allure.annotations.Step;
import util.TestProperties;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

//import java.util.Properties;

/**
 * Created by Sergey
 */
public class BaseSteps {
    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver driver;
    protected static String baseUrl;
    public static Properties properties = TestProperties.getInstance().getProperties();


    @Before
    public static void setUp() throws Exception {
        switch (properties.getProperty("browser")){
            case "firefox":
                System.setProperty("webdriver.gecko.driver", properties.getProperty("webdriver.gecko.driver"));
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
                driver = new ChromeDriver();
                break;
            default:
                System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
                driver = new ChromeDriver();
        }

        baseUrl = properties.getProperty("env.url");
        System.out.println(baseUrl);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

  @After
    public static void tearDown() throws Exception {
        driver.quit();
    }

    protected boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected void checkFillField(String value, By locator) {
        Assert.assertEquals(value, driver.findElement(locator).getAttribute("value"));
    }

    @Step("Переключение на вторую вкладку")

    public void nextPage(){

        new BasePage(BaseSteps.getDriver()).nextPage();

    }
    protected void fillField(By locator, String value) {

        driver.findElement(locator).clear();

        driver.findElement(locator).sendKeys(value);

    }





}