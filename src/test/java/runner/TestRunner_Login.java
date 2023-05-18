package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features="features/cettire.feature", glue="steps", plugin={"pretty","junit:reports/JUnitReports/report.xml"})

//plugin={"pretty","html:reports/HtmlReports"}
// plugin={"pretty","html:reports/HtmlReports"}


@RunWith(Cucumber.class)
public class TestRunner_Login
{

}
