package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Feature",glue="steps",plugin={"pretty","html:target/htmlreport/report.html"})

public class Test_Runner extends AbstractTestNGCucumberTests {
	
	
	

}
