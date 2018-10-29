package runner;
import org.junit.runner.RunWith; 
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:/Users/arahate/git/VacationExotica/src/main/java/features/GetInTouch.feature",
glue={"seleniumgluecode"}
)

public class testrunner {

}
