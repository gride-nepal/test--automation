package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(
		features="src/main/java/features",
		glue={"stepDefinations"},
		tags= {"~@manual"}
		)						

public class Runner{		

	
}