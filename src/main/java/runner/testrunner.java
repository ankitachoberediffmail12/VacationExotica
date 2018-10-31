package runner;
import org.junit.runner.RunWith; 
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//features="C:/Users/arahate/git/VacationExotica/src/main/java/features",
//features="C:/Users/japatel/git/VacationExotica/src/main/java/features/ContactUs.feature",
features="C:/Users/achobe/git/VacationExotica/src/main/java/features/ContactUs.feature",


glue={"seleniumgluecode"},
plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json", "junit:target/cucumber_report.xml"},
dryRun = true, //- make it true when you want to check Feature > StepDef mapping 
monochrome=true 

)

public class testrunner {

}
