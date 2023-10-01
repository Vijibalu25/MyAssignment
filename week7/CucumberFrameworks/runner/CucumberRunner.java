package runner;


import io.cucumber.testng.CucumberOptions;
import week5.Day1.testcases.BaseClass;


@CucumberOptions(features = "src/test/java/feature",glue = "steps",monochrome=true,publish=true)
public class CucumberRunner extends BaseClass{

	
 
}
