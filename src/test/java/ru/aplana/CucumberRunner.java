package ru.aplana;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

/**
 * Created by Sergey
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"steps"},
        plugin = {
                "util.AllureReporter",
        })
public class CucumberRunner {

}
