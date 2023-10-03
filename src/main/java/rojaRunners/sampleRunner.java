package rojaRunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features= {"feature"},
					glue= {"stepdefenations"},
					plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
					tags = "@login",
					monochrome=true
)

public class sampleRunner extends AbstractTestNGCucumberTests
{
	
}


